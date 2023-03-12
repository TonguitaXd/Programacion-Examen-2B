package BusinessLogic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
// import java.util.stream.Stream;

import DataAccess.UsuariosDAC;
import Framework.AppException;
import BusinessLogic.Entities.Usuarios;

public class UsuariosBL {
    public List<Usuarios> getAllUsuarios( ) throws AppException{
        try {
            UsuariosDAC UsuariosDAC = new UsuariosDAC();  
            List<Usuarios> usuarios = new ArrayList<Usuarios>();
            ResultSet rs = UsuariosDAC.getAllUsuarios();
            while(rs.next())    {
                Usuarios u = new Usuarios(rs.getInt("AM_ID_USUARIOS"), rs.getString("AM_USUARIOS"), rs.getString("AM_CONTRASENA_ENCRIPTADA")); ;
                usuarios.add(u);
            }
            return usuarios;
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass());
        }
    }
}
