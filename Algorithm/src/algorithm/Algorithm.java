
package algorithm;

import java.util.Scanner;

public class Algorithm {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //Attributes
        System.out.println("Input the First Value: ");
        int x = scan.nextInt();
        
        System.out.println("Input the Second Value: ");
        int y = scan.nextInt();
        
        System.out.println("Input the Third Value: ");
        int z = scan.nextInt();
        
        //Method
        if (x > y) {
            if (x > z) {
                if (y > z) {
                    System.out.println(z + ", " + y + ", " + x);
                } else  {
                    System.out.println(y + ", " + z + ", " + x);
                }
            }else {
                System.out.println(y + ", " + x + ", " + z);
            }
        } else if (y > z) {
            if (z > x) {
                System.out.println(x + ", " + z +", "+ y);
            } else {
                System.out.println(z + ", " + x + ", " + y);
            }
        } else if (z > x) {
            System.out.println(x + ", " + y + ", " + z);
        }
    }
    
}