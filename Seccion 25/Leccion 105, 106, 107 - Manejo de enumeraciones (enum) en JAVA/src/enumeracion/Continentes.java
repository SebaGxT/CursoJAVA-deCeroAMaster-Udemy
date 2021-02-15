
package enumeracion;

/*

Se pueden agregar atributos y metodos a cada enumeracion esto es muy parecido a crear una nueva clase 
pero de tipo enumeracion

al final se agrega punto y coma solo si se va a seguir trabajando en la enumeracion

*/

public enum Continentes {
    
    AFRICA(53),
    ASIA(44),
    AMERICA(34),
    EUROPA(46),
    OCEANIA(14);
    
    private final int paises;
    
    Continentes(int paises){
        
        this.paises = paises;
        
    }
    
    public int getPaises(){
        
        return this.paises;
        
    }
    
}
