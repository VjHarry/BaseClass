package org.test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class BrokenLinks {
	public static void main(String[] args) throws IOException {

	URL u=new URL("https://www.loganair.co.uk/");
	HttpURLConnection uc=(HttpURLConnection)u.openConnection();
    
	int code=uc.getResponseCode();
	System.out.println(code);
	if(code==200) {
		System.out.println("not broken");
	}else { System.out.println("broke");}

}}
