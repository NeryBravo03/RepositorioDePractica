public class Estudiante {
    private String carnet;
    private String nombres;
    private String telefono;
    // Constructor
    public Estudiante(String carnet, String nombres, String telefono) {
        this.carnet = carnet;
        this.nombres = nombres;
        this.telefono = telefono;
    }
    // Getters
    public String getCarnet() {
        return carnet;
    }
    public String getNombres() {
        return nombres;
    }
    public String getTelefono() {
        return telefono;
    }
    // Setters
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    // Para mostrar los datos en forma legible
    @Override
    public String toString() {
        return "Carnet: " + carnet + " | Nombres: " + nombres + " | Tel: " + telefono;
    }
} 
