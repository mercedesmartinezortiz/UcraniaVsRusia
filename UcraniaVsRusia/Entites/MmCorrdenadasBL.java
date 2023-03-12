package UcraniaVsRusia.Entites;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import UcraniaVsRusia.DataAccess.MmCoordenadaDAC;
import UcraniaVsRusia.Framework.AppException;

public class MmCorrdenadasBL {
    public List<MmCoordenadas> getAllCoordenadas() throws AppException {
        try {
            MmCoordenadaDAC mmCoordenadaDAC = new MmCoordenadaDAC();
            List<MmCoordenadas> mmCoordenadas = new ArrayList<MmCoordenadas>();

            ResultSet rs = mmCoordenadaDAC.getAllCoordenadas();
            while (rs.next()) {
                MmCoordenadas s = new MmCoordenadas(rs.getString("mmCapacidadBelica"), rs.getString("mmGeoLocalizacion"),
                        rs.getString("mmDetalleDelArsenal"), rs.getString("mmFechaIngreso"));
                mmCoordenadas.add(s);
            }
           
            return mmCoordenadas;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new AppException(e, getClass(), "getMmUsuario");
        }
    }
}
