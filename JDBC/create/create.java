import java.sql.*;

class create{
	public static void main(String... z){
		try{
			//load driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//create connections
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","virus","virus");
			
			//create statement
			Statement s = con.createStatement();
			
			//fire query 
			int rs = s.executeUpdate("create table employee(Emp_id number, Name varchar(20), Age number)");
			System.out.println("table created");
			rs = s.executeUpdate("insert into employee(Emp_id,Name, Age) values(101, 'kamal',23)");
			System.out.println("data 1 created ");
			rs = s.executeUpdate("insert into employee(Emp_id,Name, Age) values(102, 'Neel',25)");
			System.out.println("data 2 created ");
			
			con.close();
			s.close();

		}catch(Exception e){
			System.out.println(e);
		}
	}
}