package com.xugang.util;

public class MyMath {
	/**
	  * �ж��ַ����Ƿ�������
	  */
	 public static boolean isInteger(String value) {
	  try {
	   Integer.parseInt(value);
	   return true;
	  } catch (NumberFormatException e) {
	   return false;
	  }
	 }
}
