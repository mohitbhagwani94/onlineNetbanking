<%-- 
    Document   : withdraw
    Created on : 8 Jun, 2014, 12:11:44 PM
    Author     : MOHIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="st"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Withdraw Here</h1>
        <st:form action="withdrawAmount" method="post">
            <st:textfield name="accountNo" label="Account Number"></st:textfield>
            <st:textfield name="deposit" label="Enter Deposit Amount"></st:textfield>
            <st:textfield name="date" label="Enter Today Date"></st:textfield>
            <st:submit ></st:submit>
        </st:form>
    </body>
</html>
