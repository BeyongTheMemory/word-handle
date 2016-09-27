package com.xugang.enums;

/**
 * Created by XuGang on 2016/4/15.
 */
public enum MedicineSourceType {
    CAVITY_TUMOR_PEDIATRICS(1,"国家中成药标准汇编口腔肿瘤儿科分册"),
    HEART_INTERNAL(2,"国家中成药标准汇编内科心系分册"),
    LUNG_ONE_INTERNAL(3,"国家中成药标准汇编内科肺系（一）分册"),
    LUNG_TWO_INTERNAL(4,"国家中成药标准汇编内科肺系（二）分册"),
    KINDLE_INTERNAL(5,"国家中成药标准汇编 内科 肾系 分册"),
    HEAD_INTERNAL(6,"国家中成药标准汇编脑系经络肢体脑系分册"),
    HEPOTOBILARY_INTERNAL(7,"国家中成药标准汇编内科肝胆分册"),
    SPLEEN_AND_STOMACH_INTERNAL(8,"国家中成药标准汇编内科脾胃分册"),
    BLOOD_INTERNAL(9,"国家中成药标准汇编内科气血津液分册"),
    GYNAECOLOGY_INTERNAL(10,"国家中成药标准汇编外科妇科分册"),
    EYE_INTERNAL(11,"国家中成药标准汇编眼科耳鼻喉科皮肤科分册"),
    BONE_INTERNAL(12,"国家中成药标准汇编骨伤科分册"),
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
