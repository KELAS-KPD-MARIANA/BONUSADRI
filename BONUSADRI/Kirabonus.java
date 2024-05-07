
package kirabonus;
import java.util.Scanner;

public class Kirabonus {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double bonus = 0;
        int bil;
        
          System.out.print("Masukkan bilangan pelanggan : ");
        bil = input.nextInt(); 

        if (bil >= 40) {
            bonus = 10000;
        } else if (bil >= 30 && bil <= 39) {
            bonus = 8000;
        } else if (bil >= 20 && bil <= 29) {
            bonus = 6000;
        }else if (bil >= 10 && bil <= 19) {
            bonus = 4000;
        } else if (bil >= 1 && bil <= 9){
            bonus = 2000;
        }
          double jumlah_gaji = 1100 + bonus;
             System.out.println("Bilangan pelanggan: " + bil);
             System.out.println("Jumlah gaji: RM " + jumlah_gaji);
    }
    
    
}
