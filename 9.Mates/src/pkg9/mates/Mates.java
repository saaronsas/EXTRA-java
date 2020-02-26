
package pkg9.mates;


public class Mates {

    
    public static void main(String[] args) {
        
        //Raices Cuadradas -> Math.sqrt(numero)
        double raiz = Math.sqrt(10);
        int raiz2 = (int)Math.sqrt(10);
        
        System.out.println(raiz);
        System.out.println(raiz2);
        
        //Potencias -> Math.pow(base, exponente)
        double a=5, b=2;
        
        double potencia = Math.pow(a,b);
        
        System.out.println(potencia);
        
        //Redondear -> Math.round(numero)
        float numero=10.5643f;
        int redondeo = Math.round(numero);
        
        System.out.println(redondeo);
        
        //Aleatorio -> Math.random()
        double aleatorio = Math.random();
        
        System.out.println(aleatorio);
   
    }
    
}
