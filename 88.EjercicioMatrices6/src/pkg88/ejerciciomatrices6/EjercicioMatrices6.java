
package pkg88.ejerciciomatrices6;


public class EjercicioMatrices6 {

    
    public static void main(String[] args) {
        
        int matriz1[][]={{1,2,3,4,5,6,7,8,9}, {1,2,3,4,5,6,7,8,9}, {1,2,3,4,5,6,7,8,9}, {1,2,3,4,5,6,7,8,9}, {1,2,3,4,5,6,7,8,9}}, matriz2[][]=new int[9][5];

        System.out.println("Matriz 1");
        for(int i=0; i<5; i++){
            System.out.println("  ");        
            for(int j=0; j<9; j++){
                System.out.print("  "+matriz1[i][j]);
            }
        }
        
        for(int i=0; i<9; i++){       
            for(int j=0; j<5; j++){
                matriz2[i][j]=matriz1[j][i];
            }
        }
        System.out.println("\n\nMatriz 2");
        for(int i=0; i<9; i++){       
            System.out.println("  ");
            for(int j=0; j<5; j++){
                System.out.print("  "+matriz2[i][j]);
            }
        }
    }
    
}
