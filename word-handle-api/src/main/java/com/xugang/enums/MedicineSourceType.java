package com.xugang.enums;

/**
 * Created by XuGang on 2016/4/15.
 */
public enum MedicineSourceType {
    CAVITY_TUMOR_PEDIATRICS(1,"国家中成药标准汇编口腔肿瘤儿科分册"),
    HEART_INTERNAL(2,"国家中成药标准汇编内科心系分册"),
    ;
    private int code;
    private String name;
    private MedicineSourceType(int code,String name){
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
