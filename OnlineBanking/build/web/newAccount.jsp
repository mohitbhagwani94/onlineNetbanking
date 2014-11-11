<%-- 
    Document   : success
    Created on : 7 Jun, 2014, 12:26:13 AM
    Author     : MOHIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="st" %>

<%@page import="java.sql.*;" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .errorMessage{color:greenyellow};
        </style>
    </head>
    
    

<%
Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
            PreparedStatement pst = con.prepareStatement("select max(accountNo) from account" );
            ResultSet rs =pst.executeQuery();
            if(rs.next())
            {
                // int id = rs.getInt(1)) ;
                %>

    
    
    
    <body>
        <h1>Open New Account</h1>
        <st:form action="newOpen" method="post">
                Account No.<input name="accountNo"  value="<%= rs.getInt(1)+1%>"/> 
            <%--    <st:textfield name="accountNo" label="Account No" value="<%= out.println(rs.getInt(1));%>"></st:textfield>--%> 
            <st:password name="password" label="Password"></st:password>
            <st:textfield name="name" label="Account Holder Name"></st:textfield>
            <st:radio list="{'Saving','Current'}" name="type"></st:radio>
            <st:textfield name="address" label="Address"></st:textfield>
            <st:textfield name="mobileno" label="Mobile Number"></st:textfield>
            <st:textfield name="dob" label="Date Of Birth"></st:textfield>
            <st:textfield name="myfile" label="gender"></st:textfield>>
            <st:submit value="Resgister"></st:submit>
        </st:form>
    </body>
</html>


<%
            }

%>
