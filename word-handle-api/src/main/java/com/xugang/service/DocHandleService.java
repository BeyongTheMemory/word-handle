package com.xugang.service;

import com.xugang.dto.MedicineHandbookDTO;

import java.util.List;

/**
 * Created by XuGang on 2016/4/13.
 */
public interface DocHandleService {
    /**
     * 从本地读取word
     * @param path
     */
    public List<MedicineHandbookDTO> hadleDocFromLocal(String path);
}
