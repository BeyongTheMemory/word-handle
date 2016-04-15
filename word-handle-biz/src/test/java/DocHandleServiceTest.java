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
        List<MedicineHandbookDTO> medicineHandbookDTOList = docHandleService.hadleDocFromLocal("C:\\Users\\ymm10\\Desktop\\【批量下载】国家中成药标准汇编外科妇科分册等\\国家中成药标准汇编\\国家中成药标准汇编 内科 心系 分册.doc");
        medicineService.save(medicineHandbookDTOList, MedicineSourceType.HEART_INTERNAL.getCode());
        System.out.print("x");
    }
}
