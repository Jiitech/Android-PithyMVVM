package com.wukj.utils.safety;

import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

import it.sauronsoftware.base64.Base64;

/**
 * 项目名称：NetCar_Chauffeur
 * 包名称：com.jonyker.utils.safety.
 * 创建时间：2018/8/8 9:16
 * 作者：Jonyker
 * 博客：http://blog.csdn.net/jerry_137188
 * github：https://github.com/Jonyker
 * 修改人：Jonyker
 * 联系方式：QQ/534098845
 * 修改时间：2018/8/8 9:16
 * 备注：
 * 版本：V.1.0
 * 描述：
 */
public class AndroidDes3Utils {
    public static final String ALGORITHM_MODE = "DES";
    public static final String ALGORITHM_DES ="DES/CBC/PKCS5Padding";
    public static final String ivString = "12345678";
    public static final String codeType = "UTF-8";


    /**
     * DES加密算法
     * @param data 原始字符串
     * @param pwd 密私钥，长度不能够小于8位
     * @return
     */
    public static String encode(String data,String pwd) {
        if (data == null)
            return null;
        try {
            DESKeySpec dks = new DESKeySpec(pwd.getBytes());
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM_MODE);
            // key的长度不能够小于8位字节
            Key secretKey = keyFactory.generateSecret(dks);
            Cipher cipher = Cipher.getInstance(ALGORITHM_DES);
            IvParameterSpec iv = new IvParameterSpec(ivString.getBytes());
            AlgorithmParameterSpec paramSpec = iv;
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, paramSpec);
            byte[] bytes = cipher.doFinal(data.getBytes(codeType));

            return new String(Base64.encode(bytes));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * DES 解密算法
     * @param data 待加密字符串
     * @param pwd 密码
     * @return 解密后的字符串
     */
    public static String decode(String data,String pwd) {
        if (data == null)
            return null;
        try {
            DESKeySpec dks = new DESKeySpec(pwd.getBytes());
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM_MODE);
            // key的长度不能够小于8位字节
            Key secretKey = keyFactory.generateSecret(dks);
            Cipher cipher = Cipher.getInstance(ALGORITHM_DES);
            IvParameterSpec iv = new IvParameterSpec(ivString.getBytes());
            AlgorithmParameterSpec paramSpec = iv;
            cipher.init(Cipher.DECRYPT_MODE, secretKey, paramSpec);
            return new String(cipher.doFinal(Base64.decode(data).getBytes()),codeType);
        } catch (Exception e) {
            e.printStackTrace();
            return data;
        }
    }

}
