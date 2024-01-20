/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypting_data;

public class UserInformation {
    //basic user informations
    private String userName, firstName, lastName, passWord, cellPhone, eMail;
    
    public UserInformation(String u, String p, String f, String l, String c, String e){
        //the UserInformation for signup page
        userName = u;
        passWord = p;
        firstName = f;
        lastName = l;     
        cellPhone = c;
        eMail = e;
    }
    
    public UserInformation(String u, String p){
        //the UserInformation for login page
        userName = u;
        passWord = p;     
    }
        
    public String getUserName() {
        return userName;
    }
   
    public String getPassWord() {
        return passWord;
    }
           
    public String getFirstName() {
        return firstName;
    }
             
    public String getLastName() {
        return lastName;
    }
    
    public String getCellPhone() {
        return cellPhone;
    }
        
    public String getEMail() {
        return eMail;
    }
}
