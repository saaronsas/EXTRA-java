
package pkg3.variables;


public class Variables {

    
    public static void main(String[] args) {
        int entero=1234567;
        float decimal=3.45f;
        char caracter='A';
        boolean decision=true;
        Integer dato=null, dato2=4;
        String cadena="Hola que tal";
        
        System.out.println("Entero es igual a "+entero);
        System.out.println("Decimal es igual a "+decimal);
        System.out.println("Caracter es igual a "+caracter);
        System.out.println("La decision es "+decision);
        System.out.println("Esto es un dato No Primitivo "+dato+" y "+dato2);
        System.out.println("Esta es la cadena:  "+cadena);
    }
    
}

/*
ENTEROS:
    byte -> Pequeño(8)
    short -> Mediano(16)
    int -> Grande(32)
    long -> Enorme(64)

DECIMALES:
    float -> Grande(32)--->f al final
    double -> Enorme(64)

CARACTERES:
    char -> Caracteres

VoF:
    boolean -> ToF

NO PRIMITIVOS:
    Integer numero -> Enteros
    String -> Cadenas
*/