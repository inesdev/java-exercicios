package poo.inheritance.ex06;

public class Child extends Mother {
    
    // M�todo construtor padr�o = atributos vazios
    // Default constructor method = empty attributes
    
    public Child() {
        
    }

    // M�todo Construtor com atributos inicializados
    // Constructor method with attributes initialized
    
    public Child(String eyes, String nose, String mouth, String hair) {
        super(eyes, nose, mouth, hair);
    }
    
    // Sobrescrevendo os m�todos comuns
    // Overriding common methods
    
    @Override
    public void speak() {
        System.out.println("\nChild is talking");
    }
    
    @Override
    public String walk() {
        return "\nChild is walking";
    }
    
    // M�todo exclusivo da filha
    // Daughter's exclusive method
    
    public String toDance() {
        return "Child is dancing";
    }
}