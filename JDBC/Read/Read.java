import java.sql.*;

class Read{
	public static void main(String... z){
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "virus", "virus");
			
			Statement s = con.createStatement();
			
			ResultSet rs = s.executeQuery("select * from Employee");
			
			while(rs.next()){
				System.out.println(rs.getInt(1) +" " +rs.getString(2)+" "+rs.getInt(3));
			}
		}catch(Exception e){
			System.out.println(e);
		}

		}
}