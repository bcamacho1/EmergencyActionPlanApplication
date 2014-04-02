/* The LoginServiceImplem class is used to login and logout the user to 
 * and from the application. It implements LoginService interface. 
 *  
 * Author:  Camacho Bozena
 * Version: 1.0.
 * Date:    03-31-2014
 */

package ndnu.ws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginServiceImplem implements LoginService{
    private Connection connection;
    private Statement statement;
    private ResultSet rs;
    private PreparedStatement ps;
    private String query;
    
    public LoginServiceImplem() throws SQLException{
    	connection = null;
        statement = null;
        rs = null;
        ps = null;
        query = null;
    }

    public boolean login(String email, String password) throws SQLException, ClassNotFoundException{
    	//check if user is in database and is allowed to use app
        query = "SELECT * FROM capstone.staffmember WHERE Email= '" + email + "'"
                + " AND Password = '" + password + "'";
        try {
			Class.forName("com.mysql.jdbc.Driver");
        	connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/" + "capstone", "root", "");
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            if(rs.next()){
                //if email and password match the database information, return true
                return(email.equals(rs.getString("Email")) 
                        && password.equals(rs.getString("Password")));
            }
        }catch(SQLException e) {
        	throw e;
        }finally {
            //close all connections
            rs.close();
            statement.close();
            connection.close();
        }
        return false;
    }
    
    @Override
    public boolean logout(StaffMember staff) throws SQLException{
        //set in database that user is no more active and logout from the app 
        query = "UPDATE staffmember SET Active = 0 " +
                "WHERE StaffID =" + staff.getEmployeeID();
        int affected = 0;
        try {
            connection = connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/" + "capstone", "root", "");
            ps = connection.prepareStatement(query);
            affected = ps.executeUpdate(query);      
        }catch (SQLException e){
            System.out.println("Could not logout the Staff Member. " + e.toString());
            throw e;
        }finally {
        	  ps.close();
              statement.close();
              connection.close();
        }
        return affected > 0;
    }
}

