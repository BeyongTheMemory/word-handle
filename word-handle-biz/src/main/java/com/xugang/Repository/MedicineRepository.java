package com.xugang.repository;

import com.xugang.entity.MedicineEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by XuGang on 2016/4/14.
 */
@Repository
public interface MedicineRepository {
    public void insert(MedicineEntity medicineEntity);
}
