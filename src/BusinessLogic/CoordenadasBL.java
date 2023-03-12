package BusinessLogic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
// import java.util.stream.Stream;

import DataAccess.CoordenadasDAC;
import Framework.AppException;
import BusinessLogic.Entities.Coordenadas;

public class CoordenadasBL {
    public List<Coordenadas> getAllCoordenadas( ) throws AppException{
        try {
            CoordenadasDAC CoordenadasDAC = new CoordenadasDAC();  
            List<Coordenadas> coordenadas = new ArrayList<Coordenadas>();
            ResultSet rs = CoordenadasDAC.getAllCoordenadas();
            while(rs.next())    {
                Coordenadas c = new Coordenadas(rs.getInt("AM_CAPACIDAD"), rs.getString("AM_GEO"), rs.getString("AM_ARSENAL"), rs.getString("AM_FECHA_HACK")); ;
                coordenadas.add(c);
            }
            return coordenadas;
        } 
        catch (SQLException e) {
            throw new AppException(e, getClass());
        }
    }
}
