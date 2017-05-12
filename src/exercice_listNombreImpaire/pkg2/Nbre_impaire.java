
package exercice_listNombreImpaire.pkg2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Nbre_impaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0,n=0;
        System.out.println("Enter your number");
        n = sc.nextInt();
        while (i<n){
            if (i%2!=0){
                System.out.println(i);
                i=i+1;
           
            }
            else{
                i=i+1;
                        
            }    
        }
            
        
        }
        
    }
    



