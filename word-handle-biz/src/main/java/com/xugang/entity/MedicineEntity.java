package com.xugang.entity;

import java.util.Map;

/**
 * Created by XuGang on 2016/4/14.
 */
public class MedicineEntity {
    private int id;
    private String name;//药名
    private int resultNum;//制成粒数
    private String function;//功能主治
    private int sourceType;//来源

    public int getSourceType() {
        return sourceType;
    }

    public void setSourceType(int sourceType) {
        this.sourceType = sourceType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResultNum() {
        return resultNum;
    }

    public void setResultNum(int resultNum) {
        this.resultNum = resultNum;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
}
