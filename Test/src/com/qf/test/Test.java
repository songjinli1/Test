package com.qf.test;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Test {

	public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
		String str = "123456";
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		/*
		 * messageDigest.update(str.getBytes("utf-8")); 
		 * byte[] bytes = messageDigest.digest();
		 */
		byte[] bytes = messageDigest.digest(str.getBytes("utf-8"));//摘要，上述注释简写
		//BigInteger bigInteger = new BigInteger(1, bytes);
		//String strEncode = bigInteger.toString(16);//十六进制
		//System.out.println(strEncode);//1、md5加密：e10adc3949ba59abbe56e057f20f883e
		
		String string = Base64.getEncoder().encodeToString(bytes);
		System.out.println(string);//2、md5(base64)加密---两次加密：4QrcOUm6Wau+VuBX8g+IPg==
		
		
		
		/*
		 * String strEncode2 = Base64.getEncoder().encodeToString(bytes);
		 * System.out.println(strEncode2);
		 */
	}

}
