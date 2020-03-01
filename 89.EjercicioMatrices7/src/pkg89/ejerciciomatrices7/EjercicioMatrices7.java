
package pkg89.ejerciciomatrices7;


public class EjercicioMatrices7 {

    
    public static void main(String[] args) {
        
        int matriz[][] = new int[5][5];
        
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(i==0 || i==4 || j==0 || j==4){
                    matriz[i][j]=1;
                } //El resto son 0
            }
        }
        
        System.out.println("Monstrando Matriz...\n");
        for(int i=0; i<5; i++){
            System.out.println("  ");
            for(int j=0; j<5; j++){
                System.out.print("  "+matriz[i][j]);
            }
        }
        System.out.println("\n");
    }
    
}
