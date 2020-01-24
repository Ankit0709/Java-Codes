<!DOCTYPE html>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="db.DBConnector"%>
<%@page import="java.sql.Connection"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Connection con = DBConnector.getConnection();
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select sno,item_name,item_type from a");
	
	%>
		<table border="1">
		<tr>
			<th>sno</th>
			<th>item_name</th>
			<th>item_type</th>
		</tr>
	<%
		while(rs.next())
		{
			out.print("<tr>"
					+"<td>"+rs.getInt("sno")+"</td>"
					+"<td>"+rs.getString("item_name")+"</td>"
					+"<td>"+rs.getString("item_type")+"</td>"
					+"</tr>");
		}
	
	%>
	</table>
	
</body>
</html>