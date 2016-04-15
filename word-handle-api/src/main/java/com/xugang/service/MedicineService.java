package com.xugang.service;

import com.xugang.dto.MedicineHandbookDTO;

import java.util.List;

/**
 * Created by XuGang on 2016/4/14.
 */
public interface MedicineService {
    public void save(List<MedicineHandbookDTO> medicineHandbookDTOList,int sourceType);
}
