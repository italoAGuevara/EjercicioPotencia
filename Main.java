

public class Main {
    public static void main(String[] args) {
        
        long resultado;

        try {
            resultado = Potencia.potencia(5,5);    
            
            System.out.println("OK 5^5 => " + resultado);        

        } catch (Exception e) {
            
            System.out.println("exception => " + e.getMessage());
           
        }
    }


    
}
