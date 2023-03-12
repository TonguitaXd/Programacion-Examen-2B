package DataAccess;

//import java.sql.Connection;
// import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.AppConfiguration;
import Framework.AppException;

public class UsuariosDAC extends SQLiteDataHelper {
    public UsuariosDAC(){
        super(AppConfiguration.getDBPathConnection());
    }

    public ResultSet getAllUsuarios() throws AppException{
        try {
            String sql =    "SELECT AM_ID_USUARIOS, AM_USUARIOS, AM_CONTRASENA_ENCRIPTADA FROM USUARIOS ";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllUsuarios()");
        }
    }

    /* 
    public ResultSet getUsuariosById(int IdUsuarios) throws AppException{
        try {
            String sql ="SELECT AM_ID_USUARIOS, AM_USUARIOS, AM_CONTRASENA_ENCRIPTADA  "+
                        "FROM   USUARIOS "+
                        "WHERE  AM_ID_USUARIOS = 1 ";
                        
            Connection conn = getConnection();
            PreparedStatement pstmt  = conn.prepareStatement(sql);
            pstmt.setInt(1, IdUsuarios);
            return pstmt.executeQuery();
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getUsuariosById()");
        }
    }
    */
}
