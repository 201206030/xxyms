package net.happystudy.xxyms.utils;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class EncryptUtil {
	
	private static final String KEY_MD5 = "MD5";
	private static final String KEY_SHA = "SHA";

    private final static char[] HEX = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
    
	public static final byte[] md5(byte[] data) {
		try {
			MessageDigest md = MessageDigest.getInstance(KEY_MD5);
			md.update(data);
			return md.digest();
		} catch(Exception e){
			return null;
		}
	}
	
	public static final String md5(String text) {
		byte[] digest = md5(text.getBytes());
		int i;
        StringBuffer buf = new StringBuffer();
		for (int offset = 0; offset < digest.length; offset++) {
			i = digest[offset];
			if (i < 0){
				i += 256;
			}
			if (i < 16){
				buf.append(0);
			}
			buf.append(Integer.toHexString(i));
		}
		return buf.toString();
	}

	public static final byte[] sha(byte[] data) {
		try {
			MessageDigest md = MessageDigest.getInstance(KEY_SHA);
			md.update(data);
			return md.digest();
		} catch(Exception e){
			return null;
		}
	}
	
	public static final String sha(String text) {
		byte[] digest = sha(text.getBytes());
		int i;
        StringBuffer buf = new StringBuffer();
		for (int offset = 0; offset < digest.length; offset++) {
			i = digest[offset];
			if (i < 0){
				i += 256;
			}
			if (i < 16){
				buf.append(0);
			}
			buf.append(Integer.toHexString(i));
		}
		return buf.toString();
	}

    /**
     * AES加密
     * 
     * @param content
     *            待加密内容
     * @param key
     *            加密的密钥
     * @return
     */

    
    public static String enAes(String input, String key){
        byte[] crypted = null;
        try{
          SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, skey);
            crypted = cipher.doFinal(input.getBytes());
          }catch(Exception e){
              System.out.println(e.toString());
          }
          return new String(toHex(crypted));
      }
    
    /**
     * AES解密
     * 
     * @param content
     *            待解密内容
     * @param key
     *            解密的密钥
     * @return
     */
    public static String decAes(String content, String key) {
        if (content.length() < 1)
            return null;
        try {
            SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, skey);
            byte[] output = cipher.doFinal(hexToBytes(content));
            return new String(output);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    private static String toHex(byte[] buf) {
        if (buf == null || buf.length == 0) { return ""; }
        
        StringBuilder out = new StringBuilder();
        
        for (int i = 0; i < buf.length; i++) {
            out.append(HEX[(buf[i] >> 4) & 0x0f]).append(HEX[buf[i] & 0x0f]);
        }
        
        return out.toString();
    }
    
    /**
     * 将十六进制文本转换为byte数组
     * 
     * @param str
     * @return
     */
    private static byte[] hexToBytes(String str) {
        if (str == null) { return null; }
        
        char[] hex = str.toCharArray();
        
        int length = hex.length / 2;
        byte[] raw = new byte[length];
        for (int i = 0; i < length; i++) {
            int high = Character.digit(hex[i * 2], 16);
            int low = Character.digit(hex[i * 2 + 1], 16);
            int value = (high << 4) | low;
            if (value > 127)
                value -= 256;
            raw[i] = (byte) value;
        }
        return raw;
    }
    
}
