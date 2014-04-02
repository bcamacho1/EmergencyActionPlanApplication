/* The LoginService interface is implemented by the 
 * LoginServiceImlem class. 
 * Author:  Camacho Bozena
 * Version: 1.0.
 * Date:    03-31-2014
 */
package ndnu.ws;

import java.sql.SQLException;

public interface LoginService {
    public boolean login(String userName, String password)throws SQLException, ClassNotFoundException;
    public boolean logout(StaffMember staff) throws SQLException;
}
