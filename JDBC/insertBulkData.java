import java.sql.*;
class insertBulkData{
	public static void main(String... s){
	try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","virus","virus");
			String sql = "insert into student values(?, ?,?,?)";
			PreparedStatement pst =con.prepareStatement(sql);
			int count=0;
			for(int i=1;i<=10;i++){
				pst.setInt(1,i);
				pst.setString(2, "krishna"+i);
				pst.setString(3, "Delhi"+i);
				pst.setInt(4,10+i);
				pst.executeUpdate();
				count++;
			}
			System.out.println(count);

	}catch(Exception ex){System.out.println(ex);}
	}
}