package com.xugang.serviceImpl;

import com.xugang.repository.MedicineRepository;
import com.xugang.repository.PrescriptionRepository;
import com.xugang.dto.MedicineHandbookDTO;
import com.xugang.entity.MedicineEntity;
import com.xugang.entity.PrescriptionEntity;
import com.xugang.service.MedicineService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by XuGang on 2016/4/14.
 */
public class MedicineServiceImpl implements MedicineService {
    @Autowired
    MedicineRepository medicineRepository;
    @Autowired
    PrescriptionRepository prescriptionRepository;
    @Override
    public void save(List<MedicineHandbookDTO> medicineHandbookDTOList,int sourceType) {
        if(!CollectionUtils.isEmpty(medicineHandbookDTOList)){
            for(MedicineHandbookDTO medicineHandbookDTO:medicineHandbookDTOList){
                MedicineEntity medicineEntity = new MedicineEntity();
                BeanUtils.copyProperties(medicineHandbookDTO, medicineEntity);
                medicineEntity.setSourceType(sourceType);
                medicineRepository.insert(medicineEntity);
                if(medicineHandbookDTO.getPrescription() != null &&!medicineHandbookDTO.getPrescription().isEmpty()){
                    List<PrescriptionEntity> prescriptionEntityList = new ArrayList<>();
                    for (Map.Entry<String, Double> entry : medicineHandbookDTO.getPrescription().entrySet()) {
                        PrescriptionEntity prescriptionEntity = new PrescriptionEntity();
                        prescriptionEntity.setMedicineId(medicineEntity.getId());
                        prescriptionEntity.setName(entry.getKey());
                        prescriptionEntity.setWeight(entry.getValue().doubleValue());
                        prescriptionEntityList.add(prescriptionEntity);
                    }
                    prescriptionRepository.bathInsert(prescriptionEntityList);
                }
            }
        }
    }
}
