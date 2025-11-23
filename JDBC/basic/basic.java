import java.sql.*;

class basic {
	public static void main(String... z){
		try{
			//step 1 -> Load the Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//step 2 -> Create Connection 
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "virus","virus");
			
			// step 3 ->   create Statement 
			Statement st = con.createStatement();
			
			// step 4 -> result set banana ya (query execute karna)
			ResultSet rs = st.executeQuery("select * from StudentData");
			
			while(rs.next()){
				System.out.println(rs.getString(1) + "  " +rs.getString(2)+ "  " +rs.getInt(3));
				
			}
			//close (optional)
			con.close();
			st.close();
		}catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
	}
}