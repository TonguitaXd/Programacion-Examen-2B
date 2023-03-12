import BusinessLogic.*;
import BusinessLogic.Entities.Usuarios;
import BusinessLogic.Entities.Coordenadas;
import Framework.AppConfiguration;
import GUI.LoginUI;

public class App {
    public static void main(String[] args) throws Exception {
        new LoginUI();


        AppConfiguration.load("src/config.properties"); 
        System.out.println(AppConfiguration.getDBName());
        System.out.println(AppConfiguration.getDBPathConnection());

        System.out.print("AM_CAPACIDAD\t\t");
        System.out.print("AM_GEO\t");
        System.out.print("AM_ARSENAL\t\t");
        
        
        try {
            CoordenadasBL coordenadas = new CoordenadasBL();
            for (Coordenadas c : coordenadas.getAllCoordenadas()) {
                System.out.print(c.getAM_CAPACIDAD() + "\t\t");
                System.out.print(c.getAM_GEO() + "\t\t");
                System.out.print(c.getAM_ARSENAL() + "\t\t");    
                         
            }
        } catch (Exception e) {

        }

        System.out.print("AM_ID_USUARIOS\t\t");
        System.out.print("AM_USUARIOS\t");
        System.out.print("AM_CONTRASENA_ENCRIPTADA\t\t");
        
        try {
            UsuariosBL usuarios = new UsuariosBL();
            for (Usuarios u : usuarios.getAllUsuarios()) {
                System.out.print(u.getAM_ID_USUARIOS() + "\t\t");
                System.out.print(u.getAM_USUARIOS() + "\t\t");
                System.out.print(u.getAM_CONTRASENA_ENCRIPTADA() + "\t\t");               
            }
        } catch (Exception e) {

        }



    }
}
