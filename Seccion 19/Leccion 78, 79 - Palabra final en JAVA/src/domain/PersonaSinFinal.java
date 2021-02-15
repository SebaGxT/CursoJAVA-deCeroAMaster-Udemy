package domain;

public class PersonaSinFinal {

    //El final en metodos impide que se modifique su comportamiento desde las clases que heredan la clase
    //Sus clases hijas no pueden modificar metodos finales
    public final void imprimir() {

        System.out.println("Metodo imprimir");

    }

}
