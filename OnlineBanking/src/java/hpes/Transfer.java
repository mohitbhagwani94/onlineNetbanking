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
public class Transfer extends ActionSupport {
    private String date;
    private Integer sender, reciver,amount;
    //int before;
    public Transfer() {
    }
    
    public String execute() throws Exception {
        int rbefore=0,sbefore=0;
       // throw new UnsupportedOperationException("Not supported yet.");
        try{
            
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
            PreparedStatement pst1 = con.prepareStatement("select Balance from account where accountNo='"+reciver+"'");
            ResultSet rs = pst1.executeQuery();
            if(rs.next()){
                rbefore=rs.getInt("Balance");
            }
            rbefore=rbefore+amount;
            
            
            PreparedStatement pst2 = con.prepareStatement("select Balance from account where accountNo='"+sender+"'");
            ResultSet rs1 = pst2.executeQuery();
            if(rs1.next()){
                sbefore=rs1.getInt("Balance");
            }
            sbefore=sbefore-amount;
            
            
            String s1="insert into transaction(debit,accountNo,date,balance)values('"+amount+"','"+getSender()+"','"+date+"','"+sbefore+"')";
            String s2="insert into transaction(credit,accountNo,date,balance)values('"+amount+"','"+getReciver()+"','"+date+"','"+rbefore+"')";
            //String s3="update account set Balance='"+before+"' where accountNo='"+reciver+"')";
            String s3="UPDATE `account` SET `Balance`='"+rbefore+"' WHERE accountNo='"+reciver+"' ";
            String s4="UPDATE `account` SET `Balance`='"+sbefore+"' WHERE accountNo='"+sender+"' ";
            PreparedStatement pst =con.prepareStatement(s1);
            pst.addBatch(s1);
            pst.addBatch(s2);
            pst.addBatch(s3);
            pst.addBatch(s4);
            int i[]=pst.executeBatch();
            if( i[1]>0 && i[0]>0 && i[2]>0 && i[3]>0){
                addActionError("Your Money has been Successfully Transfered");
                return "success";
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return "success";
    }

    /**
     * @return the sender
     */
   

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
     * @return the sender
     */
    public Integer getSender() {
        return sender;
    }

    /**
     * @param sender the sender to set
     */
    public void setSender(Integer sender) {
        this.sender = sender;
    }

    /**
     * @return the reciver
     */
    public Integer getReciver() {
        return reciver;
    }

    /**
     * @param reciver the reciver to set
     */
    public void setReciver(Integer reciver) {
        this.reciver = reciver;
    }

    /**
     * @return the amount
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * @return the sender
     */
   
   
}
