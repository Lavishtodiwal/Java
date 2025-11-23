import java.sql.*;

class crudThroughStatement{
	static void read(Statement st) throws Exception{
		
		//executeQuery() checked exception throw karta hai (SQLException).
		ResultSet rs = st.executeQuery("select * from Employee");
		
		while(rs.next()){
			System.out.println(rs.getInt(1) +" ----- " + rs.getString(2)+" ----- " +rs.getString(3));
		}
	}
	
	//insertion function
	static void insert(Statement st) throws Exception{
		
		st.executeUpdate("insert into Employee values (106, 'Vipul', 26)");
		System.out.println("\nnew row inserted!!!");
		
		ResultSet rs = st.executeQuery("select * from Employee");
		System.out.println("Updated table!! \n");
		while(rs.next()){
			System.out.println(rs.getInt(1) +" ----- " + rs.getString(2)+" ----- " +rs.getString(3));
		}
	}
	
		//update function
	static void update(Statement st) throws Exception{
		
		st.executeUpdate("update Employee set age= 25 where Emp_id = 101");
		System.out.println("\nid 101 age is updated to 25 !");
		
		ResultSet rs = st.executeQuery("select * from Employee");
		System.out.println("Updated table!! \n");
		while(rs.next()){
			System.out.println(rs.getInt(1) +" ----- " + rs.getString(2)+" ----- " +rs.getString(3));
		}
	}
	//delete function
	
	static void delete(Statement st) throws Exception{
		
		st.executeUpdate("delete from Employee where Emp_id =106");
		System.out.println("\nEmp_id-> 106 row is deleted !!!");
		
		ResultSet rs = st.executeQuery("select * from Employee");
		System.out.println("Updated table!! \n");
		while(rs.next()){
			System.out.println(rs.getInt(1) +" ----- " + rs.getString(2)+" ----- " +rs.getString(3));
		}
	}
	public static void main(String... z){
		try{
			//step 1 -> load driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//step 2 -> create Connection
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","virus","virus");
		
		Statement st = con.createStatement();
		read(st);
		insert(st);
		update(st);
		delete(st);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}