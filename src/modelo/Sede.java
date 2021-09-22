package modelo;

public class Sede {
	
	private int idSede;
    private String nombreSede;
    private String direccionSede;
    private String telefonoSede;
    private String estadoSede;
    
    public Sede() {
    }
    
    public Sede(int idSede, String nombreSede, String direccionSede, String telefonoSede, String estadoSede) {
    	this.idSede = idSede;
        this.nombreSede = nombreSede;
        this.direccionSede = direccionSede;
        this.telefonoSede = telefonoSede;
        this.estadoSede = estadoSede;
    }
    
    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    public String getDireccionSede() {
        return direccionSede;
    }

    public void setDireccionSede(String direccionSede) {
        this.direccionSede = direccionSede;
    }

    public String getTelefonoSede() {
        return telefonoSede;
    }

    public void setTelefonoSede(String telefonoSede) {
        this.telefonoSede = telefonoSede;
    }

    public String getEstadoSede() {
        return estadoSede;
    }

    public void setEstadoSede(String estadoSede) {
        this.estadoSede = estadoSede;
    }

}
