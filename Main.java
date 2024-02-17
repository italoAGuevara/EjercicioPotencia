

public class Main {
    public static void main(String[] args) {
        
        int resultado;

        resultado = Potencia(2,4);
        
        System.out.println("Resultado => " + resultado);
    }


    public static int Potencia(int base, int potencia){
        
        if (potencia == 0) {
            return 1;
        }
 
        if (potencia == 1) {
            return base;
        }
        
        return base + Potencia(base, potencia - 1);
    }
    
}
