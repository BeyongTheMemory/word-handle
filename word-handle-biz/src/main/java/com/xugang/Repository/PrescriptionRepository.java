package com.xugang.repository;

import com.xugang.entity.PrescriptionEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by XuGang on 2016/4/14.
 */
@Repository
public interface PrescriptionRepository {
    public void bathInsert(List<PrescriptionEntity> prescriptionEntityList);
}
