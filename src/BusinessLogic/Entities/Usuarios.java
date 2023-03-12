package BusinessLogic.Entities;

public class Usuarios {
    private int AM_ID_USUARIOS;
    private String AM_USUARIOS;
    private String AM_CONTRASENA_ENCRIPTADA;

    
    public Usuarios(int aM_ID_USUARIOS, String aM_USUARIOS, String aM_CONTRASENA_ENCRIPTADA) {
        AM_ID_USUARIOS = aM_ID_USUARIOS;
        AM_USUARIOS = aM_USUARIOS;
        AM_CONTRASENA_ENCRIPTADA = aM_CONTRASENA_ENCRIPTADA;
    }


    public int getAM_ID_USUARIOS() {
        return AM_ID_USUARIOS;
    }


    public void setAM_ID_USUARIOS(int aM_ID_USUARIOS) {
        AM_ID_USUARIOS = aM_ID_USUARIOS;
    }


    public String getAM_USUARIOS() {
        return AM_USUARIOS;
    }


    public void setAM_USUARIOS(String aM_USUARIOS) {
        AM_USUARIOS = aM_USUARIOS;
    }


    public String getAM_CONTRASENA_ENCRIPTADA() {
        return AM_CONTRASENA_ENCRIPTADA;
    }


    public void setAM_CONTRASENA_ENCRIPTADA(String aM_CONTRASENA_ENCRIPTADA) {
        AM_CONTRASENA_ENCRIPTADA = aM_CONTRASENA_ENCRIPTADA;
    } 


    
}
