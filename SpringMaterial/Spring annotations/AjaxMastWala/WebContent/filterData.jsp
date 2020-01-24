<%@page import="db.DBConnector"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = request.getParameter("name");
		Connection con = DBConnector.getConnection();
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select sno,item_name,item_type from a where item_name like '%"+name+"%'");
	
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
	
</body>
</html>