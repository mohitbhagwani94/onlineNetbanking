/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hpes;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author MOHIT
 */
public class Deposit extends ActionSupport {
    private String date;
    private int  accountNo,deposit;
    int before=0;
    public Deposit() {
    }
    
    public String execute() throws Exception {
        
        
        //throw new UnsupportedOperationException("Not supported yet.");
        try{
             Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
            
             PreparedStatement pst1 = con.prepareStatement("select Balance from account where accountNo='"+accountNo+"'");
            ResultSet rs = pst1.executeQuery();
            if(rs.next()){
                before=rs.getInt("Balance");
            }
            before=before+deposit;
            
            String s1="INSERT INTO `transaction`(`accountNo`, `credit`, `date`,`balance` ) VALUES ('"+accountNo+"','"+deposit+"','"+date+"','"+before+"')";
            String s2="UPDATE `account` SET `Balance`='"+before+"' WHERE accountNo='"+accountNo+"' ";

//PreparedStatement pst = con.prepareStatement("insert into account values('"+accountNo+"','"+password+"','"+name+"','"+type+"','"+address+"','"+mobileno+"','"+dob+"','"+myfile+"',)");
            PreparedStatement pst =con.prepareStatement(s1);
            pst.addBatch(s1);
            pst.addBatch(s2);
            int i[]=pst.executeBatch();
            if(i[0]>0 && i[1]>0){
                return "success";
            }
           
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return "fail";
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the accountNo
     */
    public int getAccountNo() {
        return accountNo;
    }

    /**
     * @param accountNo the accountNo to set
     */
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * @return the deposit
     */
    public int getDeposit() {
        return deposit;
    }

    /**
     * @param deposit the deposit to set
     */
    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }
    
}
