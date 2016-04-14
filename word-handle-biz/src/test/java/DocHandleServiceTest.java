import com.xugang.dto.MedicineHandbookDTO;
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
    @Test
    public void hadleDocFromLocalTest(){
        List<MedicineHandbookDTO> medicineHandbookDTOList = docHandleService.hadleDocFromLocal("C:\\Users\\ymm10\\Desktop\\【批量下载】国家中成药标准汇编外科妇科分册等\\国家中成药标准汇编\\国家中成药标准汇编口腔肿瘤儿科分册（缺口腔科部分）.doc");
        System.out.print("x");
    }
}
