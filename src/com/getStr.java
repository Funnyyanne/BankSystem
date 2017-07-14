package com;

public class getStr{
	
	public String getStr(String str){
		 try{
		 String temp_p=str;
		 String temp=new String(temp_p.getBytes("iso-8859-1"),"UTF-8");
		 return temp;
		 }
		catch(Exception e){}
		return "null";
		}

}
