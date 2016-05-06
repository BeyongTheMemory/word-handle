package com.xugang.serviceImpl;

import com.xugang.dto.MedicineHandbookDTO;
import org.apache.poi.hwpf.extractor.WordExtractor;
import com.xugang.service.DocHandleService;
import org.springframework.util.StringUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by XuGang on 2016/4/13.
 */
public class DocHandleServiceImpl implements DocHandleService {

    @Override
    public List<MedicineHandbookDTO> hadleDocFromLocal(String path){
        List<MedicineHandbookDTO> medicineHandbookDTOList = new ArrayList<>();
        try {
            InputStream is = new FileInputStream(path);
            WordExtractor extractor = new WordExtractor(is);
            String paraTexts[] = extractor.getParagraphText();
            MedicineHandbookDTO medicineHandbookDTO =  new MedicineHandbookDTO();//仅为编译通过，无实际作用
            for (int i=0; i<paraTexts.length; i++) {
                String line = paraTexts[i];
                if(line.startsWith("中文名")){//药名
                    int start = line.indexOf("：");
                    int end = line.lastIndexOf("汉");
                    String name = line.substring(start+1,end-2);
                    medicineHandbookDTO.setName(name);
                }
                if(line.startsWith("【处方】")){//处方和制成粒数
                    Map prescriptionMap = new HashMap<String,Double>();
                    while(i < paraTexts.length){//处方数据存在于多行
                        line = line.replaceAll("【处方】","").replaceAll("/t", "").
                                replaceAll("/r","").replaceAll("/n","").replaceAll("\t","").trim();
                        String[] prescriptions = line.split("g");
                        for(String prescription:prescriptions) {
                            char[] chars = prescription.trim().toCharArray();
                            String prescriptionNameResult = "";
                            String prescriptionWeightResult = "";
                            for(char achar:chars){

                                if (("0123456789.").indexOf(achar) != -1)
                                {
                                    prescriptionWeightResult += achar;
                                }else{
                                    prescriptionNameResult += achar;
                                }
                            }
                            if(!StringUtils.isEmpty(prescriptionNameResult)) {
                                try {
                                    prescriptionMap.put(prescriptionNameResult,Double.parseDouble(prescriptionWeightResult));
                                }
                                catch (Exception e){
                                    prescriptionMap.put(prescriptionNameResult,-1.0);
                                }
                            }
                        }
                        //下一行
                        line = paraTexts[++i];
                        if(line.indexOf("制成") != -1){//读到制成为止
                            char[] chars = line.toCharArray();
                            String resultNum = "";
                            for(char achar:chars){
                                if (("0123456789").indexOf(achar) != -1)
                                {
                                    resultNum += achar;
                                }if(("gml片").indexOf(achar) != -1){//读到单位停止
                                    break;
                                }
                            }
                            medicineHandbookDTO.setResultNum(Integer.parseInt(resultNum));
                            medicineHandbookDTO.setPrescription(prescriptionMap);
                            break;
                        }
                    }
                }
                if(line.startsWith("【功能主治】")){//功能主治
                    String function = line.replaceAll("【功能主治】","").replaceAll("\r","").replaceAll("\n","");
                    medicineHandbookDTO.setFunction(function);
                }
                if(line.startsWith("【批准文号】")){//读取完成
                    medicineHandbookDTOList.add(medicineHandbookDTO);
                    medicineHandbookDTO = new MedicineHandbookDTO();
                }
//                if(line.startsWith("【规格】")){//单粒重量
//                    char[] chars = line.toCharArray();
//                    String singleResult = "";
//                    for(char achar:chars) {
//                        if (("0123456789.").indexOf(achar) != -1) {
//                            singleResult += achar;
//                        }
//                    }
//                    medicineHandbookDTO.setSingleWeight(Double.parseDouble(singleResult));//所有属性已读入
//                    medicineHandbookDTOList.add(medicineHandbookDTO);
//                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return medicineHandbookDTOList;
    }
}
