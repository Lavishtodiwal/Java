<%@ page import "java.io.*,java.sql.*" %>
<%@ page contentType ="test/html" pageEncoding ="UTF-8" %>

<% 
response.setContentType("test/xml");
String xn= request.getParameter("ok");
int i = Integer.parseInt(sn);

Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhos:1521:XE","virus", "virus");
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