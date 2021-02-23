package paquete1;

public class TestModificadoresAcceso {

    public static void main(String[] args) {

        Clase1 clase1 = new Clase1("Publico");
        System.out.println("clase1 = " + clase1);
        clase1.setAtributoPrivate("Cambio a traves de set en prueba");
        System.out.println("Atributo privado: "+clase1.getAtributoPrivate());

    }

}