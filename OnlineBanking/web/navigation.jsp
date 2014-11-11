<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib uri="/struts-tags" prefix="st"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0" style="background-color:#000000;color:#FFFFFF;padding:10;border-radius:10px; border: solid #CCCCCC 2px;">
  <!--DWLayoutTable-->
 
  <tr style="border:solid #CCCCCC 3px;">
    <td width="80" height="38">&nbsp;</td>
    <td width="169" valign="top" style="color: #FFFFFF"> <st:a action="newaccount"> NEW ACCOUNT </st:a></td>
    <td valign="top"><st:a action="balance"> BALANCE </st:a>   </td>
    <td valign="top"><st:a action="deposit"> DEPOSIT </st:a>    </td>
    <td valign="top"><st:a action="withdraw"> WITHDRAW </st:a>     </td>
    <td valign="top"><st:a action="transfer"> TRANSFER  </st:a>  </td>
    <td valign="top"><st:a action="logout"> LOGOUT  </st:a>    </td>
    <td valign="top"> <st:a action="aboutus"> ABOUT US </st:a>   </td>
    <td>&nbsp;</td>
  </tr>
</table>
</body>
</html>
