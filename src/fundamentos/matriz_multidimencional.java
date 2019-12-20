/*
 matriz de matrices
 */
package fundamentos;

/**
 matriz tridimencional tipo[fila][columna][profundidad]
 */
public class matriz_multidimencional {
    public static void main(String[] args) {
        int num[][][]=new int[2][2][1];
        num [0][0][0]=11;
        num [0][1][0]=15;
        num [1][0][0]=45;
        num [1][1][0]=233;
        
        for (int f = 0; f < 2; f++) {
            for (int c = 0; c < 2; c++) {
                for (int p = 0; p < 1; p++) {
                    System.out.println("num["+f+"]["+c+"]["+p+"]="+num[f][c][p]);
                }
                
            }
            
        }
    }
}
