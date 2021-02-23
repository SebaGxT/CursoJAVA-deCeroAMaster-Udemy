package domain;

/*

Existen bloques de inicializacion estaticos y no estaticos estos se ejecutan antes del constructor
Estos bloques de inicializacion no es algo comun que se utilice en JAVA sin embargo es importante el orden en el 
que se definen y ejecutan siendo estos antes de los constructores

dentro del contexto estatico no se puede utilizat this.
las variables que no son estaticas no pueden ser referenciadas dentro de un contexto estatico

 */
public class Persona {

    private final int idPersona;
    private static int contadorPersonas;
    //Bloque de inicializacion estatico, siempre se ejecutan antes que los constructores
    //Este bloque solo se ejecuta una vez al inicio de la ejecucion del programa
    static{
        
        System.out.println("Ejecucion bloque estatico");
        //Esta variable dentro de este bloque se incrementa 1 sola vez por lo que inicia en 1
        ++Persona.contadorPersonas;
        //idPersona = 10; no permite el uso de esta variable porque no es estatica
    }
    
    //Bloque de inicializacion no estatico, siempre se ejecutan antes que los constructores, solamente se abren llaves
    //Tambien conocido como contexto dinamico
    //Este bloque de codigo se va a ejecutar cada vez que se cree un nuevo objeto
    {
        
        System.out.println("Ejecucion bloque no estatico");
        //Se debe incrementar la variable ya que si no se asignaria siempre el mismo valor
        this.idPersona = Persona.contadorPersonas++;
        
        
    }
    
    public Persona(){
        
        System.out.println("Ejecucion del constructor");
        
    }
    
    public int getIdPersona(){
        
        return this.idPersona;
        
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona: " + idPersona + '}';
    }
    
    
    
}
