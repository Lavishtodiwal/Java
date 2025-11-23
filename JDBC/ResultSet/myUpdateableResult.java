import java.sql.*;
import java.sql.ResultSet;

class MyUpdateableResult{
	public static void main(String... z){
		Statement st = null;
		ResultSet rs= null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","virus","virus");
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select * from bank1");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+ rs.getInt(3));
			}
			
			rs = st.executeQuery("select accno, name from bank1");
			
			rs.next();
			rs.next();
			rs.next();
			rs.deleteRow();
			System.out.println("one Record is deleted");
			rs = st.executeQuery("select * from bank1");
			
			while(rs.next()){	
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+ rs.getInt(3));
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}