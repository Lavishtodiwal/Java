<%@ page import="java.io.*,java.sql.*" %>
<%@ page contentType ="text/html" pageEncoding ="UTF-8" %>

<% 
response.setContentType("text/xml");
String xn= request.getParameter("ok");
int i = Integer.parseInt(xn);

Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","virus", "virus");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select name from student where age ="+i);
out.println("<student>");
    while(rs.next()){
        out.println("<stdname>"+rs.getString(1)+"</stdname>");
    }
    out.println("</student>");
    rs.close();
    st.close();
    con.close();
 %>