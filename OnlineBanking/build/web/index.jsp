<%-- 
    Document   : index
    Created on : 6 Jun, 2014, 11:52:18 PM
    Author     : MOHIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="st" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Banking Project</title>
        <style>
            .errorMessage{color:red};
        </style>
    </head>
    <body>
        <h1>ONLINE BANKING SERVICES</h1>
        <st:form action="log" method="post">
            <st:textfield label="ACCOUNT NUMBER" name="account" ></st:textfield>
            <st:textfield label="PASSWORD" name="pass"></st:textfield>
            <st:submit value="LOG IN"></st:submit>
        </st:form>
        <st:form action="new" method="post">
            
            <st:submit value="NEW REGISTER"></st:submit>
            
        </st:form>
        <st:if test="hasActionErrors()">
            <div>
                <st:actionerror/>
            </div>
            
        </st:if>
    </body>
</html>
