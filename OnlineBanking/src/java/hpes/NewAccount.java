/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hpes;
import java.sql.*;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author MOHIT
 */
public class NewAccount extends ActionSupport {
    private String  accountNo,password,name,type,address,mobileno,dob,myfile;
    public NewAccount() {
    }
    
    public String execute() throws Exception {
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
            
            //PreparedStatement pst = con.prepareStatement("insert into account values('"+accountNo+"','"+password+"','"+name+"','"+type+"','"+address+"','"+mobileno+"','"+dob+"','"+myfile+"',)");
            PreparedStatement pst =con.prepareStatement("INSERT INTO `account`(`accountNo`, `password`, `name`, `type`, `address`, `mobileno`, `dob`, `gender`) VALUES ('"+accountNo+"','"+password+"','"+name+"','"+type+"','"+address+"','"+mobileno+"','"+dob+"','"+myfile+"')");
            int i=pst.executeUpdate();
            if(i>0){
                return "success";
            }
           
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return "fail";
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the mobileno
     */
    public String getMobileno() {
        return mobileno;
    }

    /**
     * @param mobileno the mobileno to set
     */
    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the myfile
     */
    public String getMyfile() {
        return myfile;
    }

    /**
     * @param myfile the myfile to set
     */
    public void setMyfile(String myfile) {
        this.myfile = myfile;
    }

    /**
     * @return the accountNo
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * @param accountNo the accountNo to set
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
    public void validate(){
        if(password.length()<1){
            addFieldError("password","Please Enter The Password");
        }
        else if(password.length()<8){
            addFieldError("password","Password should contain altleast 8 Charater or Number");
        }
        if(name.length()<1){
            addFieldError("name", "Please Enter The Account Holder Name");
        }
        if(type==null){
            addFieldError("type", "Select The Type Of Account ");
        }
        if(address.length()<1){
            addFieldError("address","Please Enter The Address");
        }
        if(mobileno.length()<1){
            addFieldError("mobileno", "Please Enter The Mobile Number");
        }
        else if(mobileno.length()<10){
            addFieldError("mobileno","Please Enter the correct Mobile Number");
            
        }
        if(dob.length()<1){
            addFieldError("dob","Please Enter The Date Of Birth");
            
        }
        if(myfile.length()<1){
            addFieldError("myfile","Plese Enter Our Gender");
        }
    }
    
}
