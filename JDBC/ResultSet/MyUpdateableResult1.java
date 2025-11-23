import java.sql.*;
// import java.sql.ResultSet;

class MyUpdateableResult1{
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
			rs = st.executeQuery("select accno,name,salary from bank1");
			while(rs.next()){
				if(rs.getInt(1)==1001){
					rs.updateDouble(3,30000);
					rs.updateRow();
					System.out.println("Record Updated ");
					
				}
			}
			rs = st.executeQuery("select * from bank1");
			while(rs.next()){
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+ rs.getInt(3));
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
}