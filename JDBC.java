import java.sql.*;
import java.io.*;

public class JDBC
{
    public static void main(String[] args)
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/ftrance_corp","root","root");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from users");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            con.close();
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        catch(ClassNotFoundException e1)
        {
            System.out.println(e1);
        }
    }
}