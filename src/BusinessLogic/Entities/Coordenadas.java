package BusinessLogic.Entities;

public class Coordenadas {
    private int AM_CAPACIDAD;
    private String AM_GEO;
    private String AM_ARSENAL;
    private String AM_FECHA_HACK;
    public Coordenadas(int aM_CAPACIDAD, String aM_GEO, String aM_ARSENAL, String aM_FECHA_HACK) {
        AM_CAPACIDAD = aM_CAPACIDAD;
        AM_GEO = aM_GEO;
        AM_ARSENAL = aM_ARSENAL;
        AM_FECHA_HACK = aM_FECHA_HACK;
    }
    public int getAM_CAPACIDAD() {
        return AM_CAPACIDAD;
    }
    public void setAM_CAPACIDAD(int aM_CAPACIDAD) {
        AM_CAPACIDAD = aM_CAPACIDAD;
    }
    public String getAM_GEO() {
        return AM_GEO;
    }
    public void setAM_GEO(String aM_GEO) {
        AM_GEO = aM_GEO;
    }
    public String getAM_ARSENAL() {
        return AM_ARSENAL;
    }
    public void setAM_ARSENAL(String aM_ARSENAL) {
        AM_ARSENAL = aM_ARSENAL;
    }
    public String getAM_FECHA_HACK() {
        return AM_FECHA_HACK;
    }
    public void setAM_FECHA_HACK(String aM_FECHA_HACK) {
        AM_FECHA_HACK = aM_FECHA_HACK;
    }
     
}
