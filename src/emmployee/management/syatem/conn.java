package emmployee.management.syatem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class conn {
    Connection connection;
    Statement statement;
    public conn(){
        try{
         Class.forName("com.mysql.cj.jdbc.Driver");
         connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root","22BCA054");
         statement=connection.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
