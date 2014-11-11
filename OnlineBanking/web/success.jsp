<%-- 
    Document   : success
    Created on : 9 Jun, 2014, 12:40:57 AM
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
        <h1>Your Account Has Been Created</h1>
        <h4><st:property value="name"></st:property></h4>
        <h4>Your Account Number is:</h4>
        <st:property value="accountNo"></st:property>
    </body>
</html>
