package UcraniaVsRusia;

import UcraniaVsRusia.DataAccess.MmUsuarioDAC;
import UcraniaVsRusia.Entites.MmUsuario;
import UcraniaVsRusia.Entites.MmUsuarioBL;
import UcraniaVsRusia.Framework.AppConfiguration;

public class App {
    static final String URL_CONFIGURACION = "C:\\examen2\\UcraniaVsRusia\\UcraniaVsRusia\\config.properties";
    public static void main(String[] args) throws Exception {
        AppConfiguration.load(URL_CONFIGURACION); 
        System.out.println(AppConfiguration.getDBName());
        System.out.println(AppConfiguration.getDBPathConnection());

        System.out.println("---------------   UCRANIA VS RUSIA   ---------------");
        // Load Driver
        try {
            // The newInstance() call is a work around for some
            // broken Java implementations
            Class.forName("org.sqlite.JDBC").newInstance();
            
            System.out.println("Database connection established");
        } catch (Exception ex) {
            // handle the error
            ex.printStackTrace();
        }

        System.out.println("---------------   forName   ---------------");
        try{
            MmUsuarioBL usuarioBl =new MmUsuarioBL();
            
            
            MmUsuario usuario = usuarioBl.getMmUsuario("alumno2", "MTIzNA==");
            System.out.println("Bienvenido " + usuario.getMmNombre());

        }catch(Exception e){
            e.printStackTrace();
            System.out.println("ERROR en el login");
        }
        
       
    }
}
