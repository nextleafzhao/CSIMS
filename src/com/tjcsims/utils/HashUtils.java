package com.tjcsims.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
public class HashUtils {
    public static String getHash1(String source) {
        StringBuilder strb = new StringBuilder();
        MessageDigest encryptstr;
        try {
        	encryptstr = MessageDigest.getInstance("SHA-1");//将此换成SHA-1、SHA-512、SHA-384等参数,算法名对大小写不敏感
        	encryptstr.update(source.trim().getBytes());
            for (byte b : encryptstr.digest()) {
                strb.append(String.format("%02X", b));// 10进制转16进制，X 表示以十六进制形式输出，02 表示不足两位前面补0输出
            }
            return strb.toString();
        } catch (NoSuchAlgorithmException e) {e.printStackTrace();
        //异常处理
        
        
        
        }
        return null;
    }
}
/*
 * 摘自EncryptionUtil.java
 */