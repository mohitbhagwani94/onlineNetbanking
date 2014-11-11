/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hpes;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.*;
/**
 *
 * @author MOHIT
 */
public class Login extends ActionSupport {
    private String account,pass;
    public Login() {
    }
    
    public String execute() throws Exception {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
            PreparedStatement pst = con.prepareStatement("select * from account where accountNo='"+account+"' and password='"+pass+"'");
            ResultSet rs =pst.executeQuery();
            if(rs.next())
            {
                return "success";
            }
            
            else
            {
                addActionError("Enter Correct Account Number and Password");
                return "fail";
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        addActionError("Enter Correct Account Number and Password");
        return null;
//throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the account
     */
    public String getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
    public void validate(){
        if(account.length()<3){
            addFieldError("account","Please Enter All The Ten Digit");
        }
        if(pass.length()<8){
            addFieldError("pass","Password Should Be Of Atleast 8 Character");
        }
            
        
    }
}
