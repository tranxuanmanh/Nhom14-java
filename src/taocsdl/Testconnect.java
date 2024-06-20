
package taocsdl;

import taocsdl.DbHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Manh
 */
public class Testconnect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException{
       Connection conn=DbHelper.getConnect();
       String sql="select * from user";
		   
		   PreparedStatement pr=conn.prepareStatement(sql);
		   
		    ResultSet r1=pr.executeQuery();
		 		   
		   while(r1.next()) {
			   System.out.print(r1.getInt("id")+"--");
			   System.out.print(r1.getString("username")+"--");
			   System.out.print(r1.getString("password")+"--");
			  
			   System.out.print("\n");
		   } 
System.out.println(conn);
    }
}
