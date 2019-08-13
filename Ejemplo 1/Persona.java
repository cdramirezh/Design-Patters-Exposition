public class Persona {

    private PersonaData datos;

    public Persona(int cedula, String nombre, double altura, double peso) {
        datos = new PersonaData(cedula,nombre,altura,peso);
    }

    public double getIMC() {
        return datos.getAltura()/(datos.getPeso()*datos.getPeso());
    }

}
