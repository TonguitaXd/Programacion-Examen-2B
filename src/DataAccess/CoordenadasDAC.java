package DataAccess;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Framework.AppConfiguration;
import Framework.AppException;

public class CoordenadasDAC extends SQLiteDataHelper{
    public CoordenadasDAC(){
        super(AppConfiguration.getDBPathConnection());
    }

    public ResultSet getAllCoordenadas() throws AppException{
        try {
            String sql = "SELECT AM_CAPACIDAD,AM_GEO, AM_ARSENAL FROM PERSONA";
            return getResultSet(sql);
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass(), "getAllPet()");
        }
    }
}
