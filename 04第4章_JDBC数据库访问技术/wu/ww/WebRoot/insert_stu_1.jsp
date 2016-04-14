<%@ page language="java" import="java.sql.*" pageEncoding="UTF-8" %>
<html>
	<head><title>利用PreparedStatement对象添加一条记录页面</title></head>
	<body>
		<%
			String driverName = "com.mysql.jdbc.Driver";
			String userName = "root";
			String userPwd = "root";
			String dbName = "wudb2";
			String url1 = "jdbc:mysql://localhost:3306/" + dbName;
			String url2 = "?user=" + userName + "&password=" + userPwd;
			String url3 = "&useUnicode=true&characterEncoding=UTF-8";
			String url = url1 + url2 + url3;
			Class.forName(driverName);
			Connection conn = DriverManager.getConnection(url);
			
			String sql = "Insert into stu_info(name,sex,age,weight,hight)values(?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//pstmt.setInt(1, 16);
			pstmt.setString(1, "李四");
			pstmt.setString(2, "男");
			pstmt.setInt(3, 20);
			pstmt.setFloat(4, 70);
			pstmt.setFloat(5, 175);
			int n = pstmt.executeUpdate();
			if(n==1) {%> 数据插入操作成功！<br><%}
			else {%> 数据插入操作失败！<br><%}
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
			
		 %>
	</body>
</html>