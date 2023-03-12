package UcraniaVsRusia.DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import UcraniaVsRusia.Framework.AppConfiguration;
import UcraniaVsRusia.Framework.AppException;

public class MmCoordenadaDAC extends SQLiteDataHelper {
    public MmCoordenadaDAC(){
        super(AppConfiguration.getDBPathConnection());
    }

    

    public ResultSet getAllCoordenadas() throws AppException {
        try {
            String sql = "SELECT  * " +
                    "FROM    mmCoordenadas ";
            Connection conn = getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            return pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new AppException(e, getClass(), "getAllCoordenadas()");
        }
    }

}
