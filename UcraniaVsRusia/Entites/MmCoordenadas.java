package UcraniaVsRusia.Entites;

public class MmCoordenadas {
    private Integer mmCapacidadBelica;
    private String mmGeoLocalizacion;
    private String mmDetalleDelArsenal;
    private String mmFechaIngreso;

    
    public MmCoordenadas(
            Integer mmCapacidadBelica, String mmGeoLocalizacion, String mmDetalleDelArsenal,
            String mmFechaIngreso) {
        this.mmCapacidadBelica = mmCapacidadBelica;
        this.mmGeoLocalizacion = mmGeoLocalizacion;
        this.mmDetalleDelArsenal = mmDetalleDelArsenal;
        this.mmFechaIngreso = mmFechaIngreso;
    }
    public Integer getMmCapacidadBelica() {
        return mmCapacidadBelica;
    }
    public void setMmCapacidadBelica(Integer mmCapacidadBelica) {
        this.mmCapacidadBelica = mmCapacidadBelica;
    }
    public String getMmGeoLocalizacion() {
        return mmGeoLocalizacion;
    }
    public void setMmGeoLocalizacion(String mmGeoLocalizacion) {
        this.mmGeoLocalizacion = mmGeoLocalizacion;
    }
    public String getMmDetalleDelArsenal() {
        return mmDetalleDelArsenal;
    }
    public void setMmDetalleDelArsenal(String mmDetalleDelArsenal) {
        this.mmDetalleDelArsenal = mmDetalleDelArsenal;
    }
    public String getMmFechaIngreso() {
        return mmFechaIngreso;
    }
    public void setMmFechaIngreso(String mmFechaIngreso) {
        this.mmFechaIngreso = mmFechaIngreso;
    }


   
}
