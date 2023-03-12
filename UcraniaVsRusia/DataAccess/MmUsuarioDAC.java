package UcraniaVsRusia.DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import UcraniaVsRusia.Framework.AppConfiguration;
import UcraniaVsRusia.Framework.AppException;

public class MmUsuarioDAC extends SQLiteDataHelper {
    public MmUsuarioDAC(){
        super(AppConfiguration.getDBPathConnection());
    }

    public ResultSet mmGetUsuarioYClave(String mmUsuario, String mmClave) throws AppException{
        try {
            String sql =    "SELECT  * " +
                            "FROM    mmUsuario " +
                            "WHERE  mmUsuario = ? "+
                            "AND    mmClave = ? ";
                            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, mmUsuario);
            pstmt.setString(2, mmClave);
            return pstmt.executeQuery();
        } 
        catch (SQLException e) {
            e.printStackTrace();
            throw new AppException(e, getClass(), "mmGetUsuarioYClave()");
        }
    }

}
