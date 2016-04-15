package com.xugang.dto;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by XuGang on 2016/4/14.
 * 中成药汇编手册DTO
 */
public class MedicineHandbookDTO implements Serializable{
    private String name;//药名
    private Map<String,Double> prescription;//处方<成分，克数>
    private int resultNum;//制成粒数
//    private double singleWeight;//单粒重量
    private String function;//功能主治

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Double> getPrescription() {
        return prescription;
    }

    public void setPrescription(Map<String, Double> prescription) {
        this.prescription = prescription;
    }

    public int getResultNum() {
        return resultNum;
    }

    public void setResultNum(int resultNum) {
        this.resultNum = resultNum;
    }

//    public double getSingleWeight() {
//        return singleWeight;
//    }
//
//    public void setSingleWeight(double singleWeight) {
//        this.singleWeight = singleWeight;
//    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
