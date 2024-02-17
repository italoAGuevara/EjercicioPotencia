

public class Main {
    public static void main(String[] args) {
        
        long resultado;

        resultado = potencia(10,10);
        
        System.out.println("Resultado => " + resultado);
    }


    public static long potencia(int base, int exponente){
        
        if (exponente == 0) {
            return 1;
        }
        
        // Caso recursivo: multiplicar la base por el resultado de la llamada recursiva con exponente reducido en 1
        return base * potencia(base, exponente - 1);
    }
    
}
