package security;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 * java 原生的MD5实现
 * @author jimmy xu
 * @date 2019/12/10 10:45
 */
public class MyMD5Util {

    /** 加盐，拼接与需要加密的字段 */
    private static final String SALT = "add salt";

    public static String javaEncrypt(String sourceData) {
        try {
            sourceData += SALT;
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(sourceData.getBytes("UTF8"));
            byte s[] = m.digest();

            // 初始化结果为空
            String result = "";
            for (int i = 0; i < s.length; i++) {
                result += Integer.toHexString((0x000000FF & s[i]) | 0xFFFFFF00).substring(6);
            }
            return result;

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String springEncrypt(String sourceData) {
        sourceData += SALT;
        return "";
    }


}
