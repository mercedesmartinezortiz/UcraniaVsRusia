package UcraniaVsRusia;

import java.util.Scanner;

import UcraniaVsRusia.DataAccess.MmUsuarioDAC;
import UcraniaVsRusia.Entites.MmUsuario;
import UcraniaVsRusia.Entites.MmUsuarioBL;
import UcraniaVsRusia.Framework.AppConfiguration;
import UcraniaVsRusia.Framework.AppException;

public class App {
    static final String URL_CONFIGURACION = "C:\\examen2\\UcraniaVsRusia\\UcraniaVsRusia\\config.properties";
    static final String MMNOMBRE_COMPLETO = "Mercedes Alexandra Martinez Ortiz";
    static final int MMCEDULA = 1752864379;
    static final String MMREGEX = "a*b+c";

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

       
        try {
            login();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ERROR en el login");
        }

    }

    private static void login() throws AppException {
        Scanner mmScanner = new Scanner(System.in);
        // Booleano, strings y numero de intentos para el log in
        boolean mmLoggedIn = false;
        int attempts = 0;
        String mmEnteredUsername;
        String mmEnteredPassword;
        do {
            
            // Procedemos a pedir el input del usuario
            System.out.print("Ingrese usuario: ");
            mmEnteredUsername = mmScanner.nextLine();
            System.out.print("Ingrese clave: ");
            mmEnteredPassword = mmScanner.nextLine();
            // Comprobamos con la lista de usuarios lo ingresado
            MmUsuarioBL usuarioBl = new MmUsuarioBL();

            MmUsuario usuario = usuarioBl.getMmUsuario(mmEnteredUsername, AppConfiguration.encode(mmEnteredPassword));
            
           
            // Mostramos el error en login
            if (usuario == null) {
                attempts++;
                System.out.println("Clave o usuario incorrectos. Intentos restantes: " + (3 - attempts));
            }else{
                System.out.println("Bienvenido " + usuario.getMmNombre());
                mmLoggedIn = true;
            }
        } while (!mmLoggedIn && attempts < 3);
    }
}
