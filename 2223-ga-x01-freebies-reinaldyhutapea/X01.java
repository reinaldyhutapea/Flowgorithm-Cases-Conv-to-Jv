//12S22010 - Reinaldy Hutapea
//12S22046 - Difya Laurensya Ambarita
import java.util.*;
import java.lang.Math;

public class X01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargabuku, total, hargabukutermurah;
        int buku;
        
        total = 0;
        hargabuku = Double.parseDouble(input.nextLine());
        hargabukutermurah = hargabuku;
        while (hargabuku != 0) {
            if (hargabuku < hargabukutermurah) {
                hargabukutermurah = hargabuku;
            }
            total = total + hargabuku;
            hargabuku = Double.parseDouble(input.nextLine());
        }
        if (total > 100) {
            total = total - hargabukutermurah;
        } else {
            total = total;
        }
        System.out.println(toFixed(total,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
