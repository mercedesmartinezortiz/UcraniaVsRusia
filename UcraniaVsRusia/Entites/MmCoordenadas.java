package UcraniaVsRusia.Entites;

public class MmCoordenadas {
    private String mmCapacidadBelica;
    private String mmGeoLocalizacion;
    private String mmDetalleDelArsenal;
    private String mmFechaIngreso;

    
    public MmCoordenadas(String mmCapacidadBelica, String mmGeoLocalizacion, String mmDetalleDelArsenal,
            String mmFechaIngreso) {
        this.mmCapacidadBelica = mmCapacidadBelica;
        this.mmGeoLocalizacion = mmGeoLocalizacion;
        this.mmDetalleDelArsenal = mmDetalleDelArsenal;
        this.mmFechaIngreso = mmFechaIngreso;
    }
    public String getMmCapacidadBelica() {
        return mmCapacidadBelica;
    }
    public void setMmCapacidadBelica(String mmCapacidadBelica) {
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
