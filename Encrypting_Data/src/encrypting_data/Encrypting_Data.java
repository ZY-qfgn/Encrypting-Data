/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypting_data;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author john
 */
public class Encrypting_Data {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchAlgorithmException {
        //password to be encrypted
        String password = "123456";
 
//java helper class to perform encryption
    
        MessageDigest md = MessageDigest.getInstance("SHA-256");//can also use "MD5"
//give the helper function the password
   
        md.update(password.getBytes());
//perform the encryption
        byte byteData[] = md.digest(); 
 
//OPTION 1
//To express the byte data as a hexadecimal number (the normal way)
        String sb1="";
        for (int i = 0; i < byteData.length; ++i) {
            sb1 += (Integer.toHexString((byteData[i] & 0xFF) |  0x100).substring(1,3));
          //System.out.println(sb1);
        }
        System.out.println(sb1);
    }
    
}
