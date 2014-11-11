<%-- 
    Document   : deposit
    Created on : 8 Jun, 2014, 12:10:28 PM
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
        <h1>Deposit your Amount Here</h1>
        <st:form action="depositAmount" method="post">
            <st:textfield name="accountNo" label="Account Number"></st:textfield>
            <st:textfield name="deposit" label="Enter Deposit Amount"></st:textfield>
            <st:textfield name="date" label="Enter Today Date"></st:textfield>
            <st:submit ></st:submit>
        </st:form>
        
        <%-- <st:if test="hasActionErrors()">
            <div>
                <st:actionerror/>
            </div>
            
        </st:if>--%>
    </body>
</html>
