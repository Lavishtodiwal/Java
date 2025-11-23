import java.sql.*;

class createMultiple{
	public static void main(String... s){
	try{
			//create connection
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//create connection
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "virus", "virus");
			
			Statement st = con.createStatement();
			
			PreparedStatement ps = con.prepareStatement("insert into Employee values(?, ?,?)");
			ps.setInt(1,103);
			ps.setString(2,"Pankaj");
			ps.setInt(3,26);
			ps.addBatch(); //data ka batch bnayega or batch by batch insert karega
			
			ps.setInt(1,104);
			ps.setString(2,"Shivam");
			ps.setInt(3,23);
			ps.addBatch(); //data ka batch bnayega or batch by batch insert karega
			
			ps.setInt(1,105);
			ps.setString(2,"Satyam");
			ps.setInt(3,27);
			ps.addBatch(); //data ka batch bnayega or batch by batch insert karega
			
			//multiple ko ek sath execute karne
			// ps.executeUpdate(); //for single update
			ps.executeBatch();
			
			con.close();
			st.close();
			ps.close();

	}catch(Exception e){
		System.out.println(e);
		}
	}
}