package UcraniaVsRusia.Entites;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import UcraniaVsRusia.DataAccess.MmUsuarioDAC;
import UcraniaVsRusia.Framework.AppException;

public class MmUsuarioBL {
    public MmUsuario getMmUsuario(String mmUsuario, String mmClave) throws AppException {
        try {
            MmUsuarioDAC mmUsuarioDAC = new MmUsuarioDAC();
            List<MmUsuario> mmUsuarios = new ArrayList<MmUsuario>();

            ResultSet rs = mmUsuarioDAC.mmGetUsuarioYClave(mmUsuario, mmClave);
            while (rs.next()) {
                MmUsuario s = new MmUsuario(rs.getString("mmUsuario"), rs.getString("mmNombre"),
                        rs.getString("mmClave"), rs.getString("mmFechaCreacion"));
                mmUsuarios.add(s);
            }
            if(mmUsuarios != null && !mmUsuarios.isEmpty()){
                return mmUsuarios.get(0);
            }
            return null;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new AppException(e, getClass(), "getMmUsuario");
        }
    }
}
