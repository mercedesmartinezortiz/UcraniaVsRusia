
import Framework.AppConfiguration;

public class App {
    static final String URL_CONFIGURACION = "C:\\examen2\\UcraniaVsRusia\\config.properties";
    public static void main(String[] args) throws Exception {
        AppConfiguration.load(URL_CONFIGURACION); 
        System.out.println(AppConfiguration.getDBName());
        System.out.println(AppConfiguration.getDBPathConnection());

        System.out.println("---------------   UCRANIA VS RUSIA   ---------------");
        
       
    }
}
