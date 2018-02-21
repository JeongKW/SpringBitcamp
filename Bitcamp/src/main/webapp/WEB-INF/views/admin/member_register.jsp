<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.sql.*" %>
<%
	String addr = request.getParameter("addr_head") + " " + request.getParameter("addr_tail");
	
	
	Connection conn = null;
	Statement stmt = null;
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "bitcamp", "bitcamp");
		stmt = conn.createStatement();
		
		String sql = "INSERT INTO Member("
					+ "id,"
					+ "pw,"
					+ "name,"
					+ "ssn,"
					+ "phone,"
					+ "email,"
					+ "profile,"
					+ "addr"
					+ ") VALUES ("
					+ "'%s','%s','%s','%s','%s','%s','%s','%s')";
		stmt.executeUpdate(sql);
	}catch(SQLException ex){
		out.println(ex.getMessage());
		ex.printStackTrace();
	} finally {
		if(stmt != null){
			try{ stmt.close(); } catch(Exception e){ e.printStackTrace(); } }
		if(conn != null){
			try{ conn.close(); } catch(Exception e){ e.printStackTrace(); } }
	}
		
	pageContext.forward("member_list.jsp");
%>