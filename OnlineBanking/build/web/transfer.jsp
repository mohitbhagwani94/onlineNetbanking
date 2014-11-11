<%-- 
    Document   : transfer
    Created on : 8 Jun, 2014, 12:13:22 PM
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
        <h1>Enter the Account Number to want to Sent</h1>
        <st:form action="transferAmount" method="post">
            <st:textfield label="Enter Your Account Number" name="sender"></st:textfield>
            <st:textfield label="Enter Account number You want to sent to" name="reciver"></st:textfield>
            <st:textfield label="Amount" name="amount"></st:textfield>
            <st:textfield label="Date" name="date"></st:textfield>
            <st:submit value="send"></st:submit>
        </st:form>
        
        <st:if test="hasActionErrors()">
            <div>
                <st:actionerror/>
            </div>
        </st:if>
    </body>
</html>
