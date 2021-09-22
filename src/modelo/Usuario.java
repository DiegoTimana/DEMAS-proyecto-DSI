package modelo;

public class Usuario {
	
	private String id;
    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String telefono;
    private String direccion;
    private String email;
    private String genero;
    private String fechaVinculacion;     
    private String cargo;
    private String estado;    
    private int id_sede;    
    private String password;
    
    public Usuario() {
    }
    
    public Usuario(String id,String nombre,String apellidos,String fechaNacimiento,String telefono,String direccion,String email,
    		String genero,String fechaVinculacion,String cargo,String estado,int id_sede,String password) {
    	this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento=fechaNacimiento;
        this.telefono= telefono;
        this.direccion = direccion;
        this.email= email;
        this.genero= genero;
        this.fechaVinculacion= fechaVinculacion;
        this.cargo= cargo;
        this.estado= estado;
        this.id_sede= id_sede;
        this.password = password;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaVinculacion() {
        return fechaVinculacion;
    }

    public void setFechaVinculacion(String fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_sede() {
        return id_sede;
    }

    public void setId_sede(int id_sede) {
        this.id_sede = id_sede;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
