package com.xugang.entity;

import java.util.HashMap;
import java.util.Map;

public class User {
private String id;
private String like1;
private int count1;
private String like2;
private int count2;
private String like3;
private int count3;
private Map<String,Integer> map;
public User(){
	this.map = new HashMap<String,Integer>();
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getLike1() {
	return like1;
}
public void setLike1(String like1) {
	this.like1 = like1;
}
public int getCount1() {
	return count1;
}
public void setCount1(int count1) {
	this.count1 = count1;
}
public String getLike2() {
	return like2;
}
public void setLike2(String like2) {
	this.like2 = like2;
}
public int getCount2() {
	return count2;
}
public void setCount2(int count2) {
	this.count2 = count2;
}
public String getLike3() {
	return like3;
}
public void setLike3(String like3) {
	this.like3 = like3;
}
public int getCount3() {
	return count3;
}
public void setCount3(int count3) {
	this.count3 = count3;
}

public Map getMap() {
	return map;
}
public void setMap(Map map) {
	this.map = map;
}
public void setlike(String like,int index){
	switch(index){
	case 1:this.like1=like;break;
	case 2:this.like2=like;break;
	case 3:this.like3=like;break;
	}
}

public void setcount(int count,int index){
	switch(index){
	case 1:this.count1 = count;break;
	case 2:this.count2 = count;break;
	case 3:this.count3 = count;break;
	}
}

public String getLike(int index){
	switch(index){
	case 1:return like1;
	case 2:return like2;
	case 3:return like3;
	}
	return "-1";
}
}
