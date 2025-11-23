import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class Query01{
    public static void main(String... z){
        Connect con =  new Connect();

    }
}
class CreateFirstForm{
   StringBuffer strQuery=new StringBuffer("select ");// to store prepared query
StringBuffer orderbyBuffer=new StringBuffer(" ");
StringBuffer criteriaBuffer=new StringBuffer(" ");
int createQueryStatus=0;
JFrame jf1;
JLabel jl1,j12,j13,j14,j15;
JComboBox jcom1,jcom2,jcom3;
JTextField jtf1;
JList jlist1,jlist2;
JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jbtemp;
JCheckBox jcb1;
JRadioButton jrb1,jrb2,jrb3;
JScrollPane jsp1,jsp2;
ButtonGroup bg1;

}