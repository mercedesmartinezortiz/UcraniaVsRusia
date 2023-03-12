package UcraniaVsRusia.Entites;

public class MmUsuario {
    private String mmUsuario;
    private String mmNombre;
    private String mmClave;
    private String mmFechaCreacion;
    private String mmCedula;
    public String getMmCedula() {
        return mmCedula;
    }
    public void setMmCedula(String mmCedula) {
        this.mmCedula = mmCedula;
    }
    public MmUsuario(String mmUsuario, String mmNombre, String mmClave, String mmFechaCreacion,
            String mmCedula) {
        this.mmUsuario = mmUsuario;
        this.mmNombre = mmNombre;
        this.mmClave = mmClave;
        this.mmFechaCreacion = mmFechaCreacion;
        this.mmCedula = mmCedula;
    }
    public String getMmUsuario() {
        return mmUsuario;
    }
    public void setMmUsuario(String mmUsuario) {
        this.mmUsuario = mmUsuario;
    }
    public String getMmNombre() {
        return mmNombre;
    }
    public void setMmNombre(String mmNombre) {
        this.mmNombre = mmNombre;
    }
    public String getMmClave() {
        return mmClave;
    }
    public void setMmClave(String mmClave) {
        this.mmClave = mmClave;
    }
    public String getMmFechaCreacion() {
        return mmFechaCreacion;
    }
    public void setMmFechaCreacion(String mmFechaCreacion) {
        this.mmFechaCreacion = mmFechaCreacion;
    }

    
}
