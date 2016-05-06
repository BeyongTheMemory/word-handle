/**
 * 剔除内容
 */
package com.xugang.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class DeleteContent {
private String inputFilePath;//�����ļ�·��
private String outputFilePath;//����ļ�·��
public DeleteContent(String inputFilePath,String outputFilePath){
	this.inputFilePath = inputFilePath;
	this.outputFilePath = outputFilePath;
 }
/**���������޳��ı��е�����*/
public boolean run(){
	   File file = new File(inputFilePath);
	   File dest = new File(outputFilePath);
	   try {
	       BufferedReader reader = new BufferedReader(new FileReader(file));
	       PrintWriter writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(dest)),true);

	       //BufferedWriter writer  = new BufferedWriter(new FileWriter(dest));
	       String line = reader.readLine();
	       while(line!=null){
	    	   String words = line.replaceAll("\\s{1,}", " ");//ɾ������ո�
	    	   String[] word = words.split(" ");
	    	   writer.println(word[0]+" "+word[1]+" "+word[2]+" "+word[3]);  
	           line = reader.readLine();  
	       }  
	       writer.flush();  
	       reader.close();  
	       writer.close();  
	       return true;
	   } catch (FileNotFoundException e) {  
	       e.printStackTrace();  
	   } catch (IOException e) {  
	       e.printStackTrace();  
	   } 
	   return false;
}





}
