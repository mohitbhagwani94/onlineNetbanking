<%@taglib uri="/struts-tags" prefix="st"%>

<%@page import="java.sql.*;" %>
<%! int id; %>
<%
Class.forName("com.mysql.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/banking","root","");
            PreparedStatement pst = con.prepareStatement("select max(accountNo) from account" );
            ResultSet rs =pst.executeQuery();
            if(rs.next())
            {
                //id =Integer.parseInt(rs.getString(1));
                String acc=rs.getString(1);
                %>

<st:form>
    
    
</st:form>


<%
            }

%>
