public class Participante {
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String numeroTelefono;
    private String sexo;
    private String edad;
    private String numeroCarne;
    private String facultad;
    private String tallaPlayera;
    private String textoPlayera;
    private String modalidadCarrera;
    private String numeroCorredor;
    private String tiempoCarrera;
    
    public Participante(String nombre, String apellido, String correoElectronico, String numeroTelefono, String sexo, String edad, String numeroCarne,
        String facultad, String tallaPlayera, String textoPlayera, String modalidadCarrera, String numeroCorredor, String tiempoCarrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.numeroTelefono = numeroTelefono;
        this.sexo = sexo;
        this.edad = edad;
        this.numeroCarne = numeroCarne;
        this.facultad = facultad;
        this.tallaPlayera = tallaPlayera;
        this.textoPlayera = textoPlayera;
        this.modalidadCarrera = modalidadCarrera;
        this.numeroCorredor = numeroCorredor;
        this.tiempoCarrera = tiempoCarrera;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    
    public String getSexo() {
        return sexo;
    }
    
    public String getEdad() {
        return edad;
    }
    
    public String getNumeroCarne() {
        return numeroCarne;
    }
    
    public String getFacultad() {
        return facultad;
    }
    
    public String getTallaPlayera() {
        return tallaPlayera;
    }
    
    public String getTextoPlayera() {
        return textoPlayera;
    }
    public String getModalidadCarrera() {
        return modalidadCarrera;
    }
    
    public String getNumeroCorredor() {
        return numeroCorredor;
    }
    
    public String getTiempoCarrera() {
        return tiempoCarrera;
    }
    
    public int getTiempo() {
        return Integer.parseInt(tiempoCarrera);
    }
    
    public void setNumeroCorredor(String numeroCorredor) {
        this.numeroCorredor = numeroCorredor;
    }
    
    public void setTiempoCarrera(String tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }
    
}
