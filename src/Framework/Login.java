package Framework;
import BusinessLogic.UsuariosBL;
import BusinessLogic.Entities.Usuarios;
import BusinessLogic.EncriptadorMD5;

public class Login {
    UsuariosBL amUsuarioBL = new UsuariosBL();

    public boolean amValidacionIngreso(String amUsuario, String amClave) throws AppException{
        boolean amIngresoExitoso = false;
        
        for (Usuarios amU : amUsuarioBL.getAllUsuarios()) {
            if(amU.getAM_USUARIOS().equals(amUsuario) &&
                amU.getAM_CONTRASENA_ENCRIPTADA().equals(EncriptadorMD5.amEncryptMD5(amClave)))
                amIngresoExitoso = true;
        }
        return amIngresoExitoso;
    }
}
