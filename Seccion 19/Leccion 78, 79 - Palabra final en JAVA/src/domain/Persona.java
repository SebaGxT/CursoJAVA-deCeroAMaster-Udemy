package domain;

public final class Persona {

    //A este atributo se la conoce como constante en JAVA y se deben definir en mayuscula
    //Si tiene mas de una palabra se utiliza guion bajo para separar las palabras
    public final static int MI_CONSTANTE = 1;

    private String nombre;

    public String getNombre() {

        return this.nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

}
