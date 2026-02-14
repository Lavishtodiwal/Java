<%@ page import="java.io.*,java.sql.*" %>


<% 
response.setContentType("text/xml");
String state1= request.getParameter("ok");


Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","virus", "virus");
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(
    "select city from State where stateName = '" + state1 + "'"
);
out.println("<State>");
while (rs.next()) {
            out.println("<city>" + rs.getString(1) + "</city>");
        }
    out.println("</State>");
    rs.close();
    st.close();
    con.close();
 %>