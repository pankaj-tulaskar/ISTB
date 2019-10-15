<%@ page import="java.util.*" %> 
<html>
<head>
</head>
<body>

<br><br><br><br><br><br>
<table width="700px" align="center"
style="border:1px solid #000000;">
<tr>
<td colspan=8 align="center"
style="background-color:ffeeff">
<b>Set Top Box Record</b></td>
</tr>
<tr style="background-color:efefef;">
<td><b>STB type</b></td>
<td><b>STB features</b></td>
<td><b>STB length</b></td>
<td><b>STB breadth</b></td>
<td><b>STB width</b></td>
<td><b>Price</b></td>
<td><b>Installation Charges</b></td>
<td><b>Upgradation Charges</b></td>
<td><b>Discount</b></td>
<td><b>Billing type</b></td>
<td><b>Refundable Deposit amount</b></td>
</tr>
<%
int count=0;
String color = "#F9EBB3";

System.out.println("entered view search jsp");
if(request.getAttribute("empList")!=null)
{
	List al = (ArrayList)request.getAttribute("empList");
	Iterator itr = al.iterator();
	System.out.println("List al"+al);

while(itr.hasNext()){

if((count%2)==0){
color = "#eeffee";
}
else{
color = "#F9EBB3";
}
count++;
ArrayList<String> empList = (ArrayList<String>)itr.next();
%>
<tr style="background-color:<%=color%>;">
<td><%=empList.get(0)%></td>
<td><%=empList.get(1)%></td>
<td><%=empList.get(2)%></td>
<td><%=empList.get(3)%></td>
<td><%=empList.get(4)%></td>
<td><%=empList.get(5)%></td>
<td><%=empList.get(6)%></td>
<td><%=empList.get(7)%></td>
<td><%=empList.get(8)%></td>
<td><%=empList.get(9)%></td>
<td><%=empList.get(10)%></td>
</tr>
<%
}
}
%>
<%
if(count==0){
%>
<tr>
<td colspan=8 align="center"
style="background-color:eeffee"><b>No STB available with this retailer</b></td>
</tr>
<%
}
%>
</table>
</body>
</html>