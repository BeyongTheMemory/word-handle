import com.xugang.dto.MedicineHandbookDTO;
import com.xugang.enums.MedicineSourceType;
import com.xugang.service.MedicineService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.xugang.service.DocHandleService;

import java.util.List;

/**
 * Created by XuGang on 2016/4/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:/config/spring/*.xml")
public class DocHandleServiceTest {
    @Autowired
    private DocHandleService docHandleService;
    @Autowired
    private MedicineService medicineService;
    @Test
    public void hadleDocFromLocalTest(){
        List<MedicineHandbookDTO> medicineHandbookDTOList = docHandleService.hadleDocFromLocal("E:\\国家中成药标准汇编\\国家中成药标准汇编眼科耳鼻喉科皮肤科分册.doc");
        medicineService.save(medicineHandbookDTOList, MedicineSourceType.EYE_INTERNAL.getCode());
        System.out.print("心系,脑系经络肢体脑系,国家中成药标准汇编内科肺系（一）分册,国家中成药标准汇编内科脾胃分册,国家中成药标准汇编外科妇科分册,国家中成药标准汇编 内科 肾系 分册.doc" +
                "国家中成药标准汇编骨伤科分册，国家中成药标准汇编口腔肿瘤儿科分册（缺口腔科部分）,国家中成药标准汇编内科肝胆分册，国家中成药标准汇编内科气血津液分册.doc");
    }
}
