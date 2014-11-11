<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
      <td height="100" colspan="3" valign="top"> <tiles:insertAttribute name="header" /></td>
  <td width="11">&nbsp;</td>
  </tr>
  <tr>
      <td height="38" colspan="3" valign="top"> <tiles:insertAttribute name="navigation"/> </td>
    <td>&nbsp;</td>
  </tr>
  <tr>
      <td width="320" height="482" valign="top"><tiles:insertAttribute name="lmenu"/></td>
      <td width="394" valign="top"><tiles:insertAttribute name="body"/></td>
      <td width="367" valign="top"><tiles:insertAttribute name="rmenu"/></td>
    <td></td>
  </tr>
  
  
  
  
  
  
  
  
  <tr>
      <td height="30" colspan="3" valign="top"><tiles:insertAttribute name="footer"/></td>
  <td>&nbsp;</td>
  </tr>
  
  
  
  
</table>
