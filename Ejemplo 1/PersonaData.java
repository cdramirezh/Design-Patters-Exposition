package PrivateClassData;

class PersonaData {

    private int cedula;
    private String nombre;
    private double altura;
    private double peso;

    public PersonaData(int cedula, String nombre, double altura, double peso) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
    }

    public int getCedula() {
        return this.cedula;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getPeso() {
        return this.peso;
    }

}
