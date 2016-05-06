package com.xugang.entity;

public class News {
private String id;
private String keyword1;
private String keyword2;
private String keyword3;
private String tag1;
private String tag2;
private String tag3;
private String time;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getKeyword1() {
	return keyword1;
}
public void setKeyword1(String keyword1) {
	this.keyword1 = keyword1;
}
public String getKeyword2() {
	return keyword2;
}
public void setKeyword2(String keyword2) {
	this.keyword2 = keyword2;
}
public String getKeyword3() {
	return keyword3;
}
public void setKeyword3(String keyword3) {
	this.keyword3 = keyword3;
}
public String getTag1() {
	return tag1;
}
public void setTag1(String tag1) {
	this.tag1 = tag1;
}
public String getTag2() {
	return tag2;
}
public void setTag2(String tag2) {
	this.tag2 = tag2;
}
public String getTag3() {
	return tag3;
}
public void setTag3(String tag3) {
	this.tag3 = tag3;
}
public String getTime() {
	return time;
}
public void setTime(String time) {
	this.time = time;
}
public void setKeyWord(String keyword,int index){
	switch(index){
	case 1:this.keyword1 = keyword;break;
	case 2:this.keyword2 = keyword;break;
	case 3:this.keyword3 = keyword;break;
	}
}
public void settag(String tag,int index){
	switch(index){
	case 1:this.tag1 = tag;break;
	case 2:this.tag2 = tag;break;
	case 3:this.tag3 = tag;break;
	}
}
public String getTag(int index){
	switch(index){
	case 1:return tag1;
	case 2:return tag2;
	case 3:return tag3;
	}
	return "-1";
}
}
