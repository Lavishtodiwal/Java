import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
import javax.swing.table.TableColumn;

class RecordFilter extends JFrame implements KeyListener{
	JLabel lid; //Lable :instructions
	JTextField tb; 
	JTable ta;// Table: to display the filtered records
	Connection cn; //DB Connection
	Statement st;
	int columns;
	JScrollPane sp; // for scrolling the JTable
	DefaultTableModel model; //table ka data model (brain)
	public RecordFilter(){
		setSize(1000,600);  // window ka size 
		setResizable(true);	//resize allowed
		setLayout(null);	// no layout (absolute positioning)
		lid = new JLabel("Enter ID/ Phone: ");
		lid.setBounds(100,50,100,27); //x,y,width,height
		add(lid);
		tb = new JTextField();
		tb.setBounds(210,50,100,27);
		add(tb);
		tb.addKeyListener(this);
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","virus","virus");
			Statement ps = cn.createStatement();
			ResultSet rst = ps.executeQuery("select * from Emp");
			ResultSetMetaData metaData = rst.getMetaData();
			columns = metaData.getColumnCount();
			model = new DefaultTableModel();
			ta = new JTable(model);
			// font increase
			ta.setFont(new Font("Arial", Font.PLAIN, 18));
			ta.setRowHeight(28);

			// header font increase
			ta.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18));
			
			for (int i=1;i<=columns;i++){
				model.addColumn(metaData.getColumnName(i));
				
			}
		}catch(Exception ex){System.out.println(ex);}
		sp=new JScrollPane(ta);
		sp.setBounds(50,100,900,150); //full visible table ke liye
		add(sp);
		setVisible(true);		
	}
	public void keyPressed(KeyEvent ke){}
	public void keyTyped(KeyEvent ke){}
	public void keyReleased(KeyEvent ke){
		String str = tb.getText();
		if(str.equals("")){
			clearTable();
			return;
		}
		try{
			clearTable();
			PreparedStatement ps = cn.prepareStatement("select * from Emp where Emp_id like '"+str+"%' or phone like '"+str+"%'");
			ResultSet rst = ps.executeQuery();
			//fetching the rows
			while(rst.next()){
				Vector row = new Vector();
				for(int i =1;i<=columns;i++){
					row.add(rst.getString(i));
				}
				model.addRow(row);
			}
		}catch(Exception ex){System.out.println(ex);}
	}
	void clearTable(){
		for(int i=0;i<model.getRowCount();)
			model.removeRow(i);
	}
	public static void main(String... args){
		new RecordFilter();
	}
}