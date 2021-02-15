package domain;

public class Persona {

    private int idPersona;
    private String nombre;
    /*Static asocia con la clase a los atributos y los metodos, no lo asocia con los objetos
      
    Los objetos en contexto dinamico pueden comunicarse con atributos y metodos estaticos de la clase
    pero no pueden comunicarse entre si
    El contexto estatico no pueden comunicarse con objetos dinamicos
    
    Esta variable necesita ser estatica para asociarse a la clase ya que si no es estatica se asociaria al objeto
    y con cada objeto se reiniciaria dando solamente ID = 1
     */
    private static int contadorPersonas;
    
    public Persona(){
        
        this.nombre = "NULL";
        Persona.contadorPersonas++;
        this.idPersona = Persona.contadorPersonas;
        
    }
    
    public Persona(String nombre) {

        this.nombre = nombre;
        /*
        Incrementa en uno por cada objeto persona creados
        Al ser un atributo estatico se recomienda usar la referencia de la clase
         */
        Persona.contadorPersonas++;

        //Asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;

    }

    public String getNombre() {

        return this.nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public int getIdPersona() {

        return this.idPersona;

    }

    public void setIdPersona(int idPersona) {

        this.idPersona = idPersona;

    }
    
    public static int getContadorPersonas() {

        return Persona.contadorPersonas;

    }

    public static void setContadorPersonas(int contadorPersonas) {

        Persona.contadorPersonas = contadorPersonas;

    }
    
    @Override
    public String toString() {

        return "Persona [ID Persona: " + this.idPersona + ", Nombre: " + this.nombre + "]";

    }

}
