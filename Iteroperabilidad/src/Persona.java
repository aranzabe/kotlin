public class Persona {
    private String nombre;
    private int edad;

    public Persona(String n, int e){
        this.nombre = n;
        this.edad = e;
    }

    public String toString(){
        return "Persona{" + this.nombre + ", " + this.edad + "}";
    }
}
