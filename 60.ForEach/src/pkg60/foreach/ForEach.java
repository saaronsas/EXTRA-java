
package pkg60.foreach;


public class ForEach {

    
    public static void main(String[] args) {
        
        String[] nombres = {"Oscar", "Juan","Carlos","Kvin","Luis","Maria"};
        
        /*for(int i=0; i<nombres.length; i++){
            System.out.println(nombres[i]);
        }*/
        
        for(String i: nombres){
            System.out.println("Nombre: "+i);
        }
        
    }
    
}
