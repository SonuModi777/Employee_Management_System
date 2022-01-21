package employee_management_system;

import java.sql.*;

public class conn {
    
    public Connection c;    //Connection interface is use dfor establish connection setup with mysql
    public Statement s;    // Statement interface is used for execute mysql queries
    
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");  //class.forName is used for register the mysql drivers
            c = DriverManager.getConnection("jdbc:mysql:///project3","root","");
            s = c.createStatement();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
