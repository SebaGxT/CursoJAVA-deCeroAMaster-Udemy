/*

Para que una clase se concidere como JavaBean debe cumplir ciertas caracteristicas:

- Debe tener un constructor vacio
- Todos los atributos definidos en la clase deben ser privados
- Todos deben tener sus metodos get y set
- Debe tener una interface implementada llamada serializable esto va a permitir enviar la clase entre diferentes equipos
por ejemplo si se tienen varios servidores de java, esta interface tiene mas usos pero simplemente al agregar implements 
serializable todo lo demas lo va a implementar el servidor de aplicaciones java, al cumplir ciertas caracteristicas 
se va a considerar JavaBeans y al ser conciderada JavaBeans otras tecnologias como JavaEmpresarial o frameworks como 
spring o hibernate van a poder hacer uso de las clases sin esto no podrian utilizarlas

en ocaciones se acostumbra agregar bean al nombre de la clase pero no es obligatorio

Lo primero es agregar implements serializable al nombre de la clase, es necesario importar el paquete que contiene la 
interface

de ser necesario pueden definirse mas constructores pero no es obligatorio
Los metodos toString, equals y hashCode son complementos no obligatorios

Para permitir la tranferencia de la clase en una red de servidores debe cumplir con la serializacion esto significa
que el objeto debe poder convertirse en 0 y 1 es decir que se convierte a bits
el que recibe estos bits hace uso de la deserializacion que es convertir los bits a los objetos nuevamente

 */
package domain;

import java.io.Serializable;

public class Persona implements Serializable {

    private String nombre;
    private String apellido;

    public Persona() {

    }

    public Persona(String nombre, String apellido) {

        this.nombre = nombre;
        this.apellido = apellido;

    }

    public String getNombre() {

        return this.nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public String getApellido() {

        return this.apellido;

    }

    public void setApellido(String apellido) {

        this.apellido = apellido;

    }

    @Override
    public String toString() {
        return "Persona{" + "nombre: " + nombre + ", apellido: " + apellido + '}';
        
    }
    
    

}
