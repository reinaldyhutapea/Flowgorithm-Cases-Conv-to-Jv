// 12S22010 - Reinaldy Hutapea
// 12S22023 - Chika Situmorang
import java.util.*;
import java.lang.Math;

public class X02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int x;
        
        x = 4;
        String[] nama = new String[x];
        
        declare();
        inputan(nama, x);
        output(nama, x);
    }
    
    public static void declare() {
    }
    
    public static void inputan(String[] nama, int x) {
        for (x = 0; x <= 3; x++) {
            nama[x] = input.nextLine();
            if (!nama[x].equals("---")) {
            } else {
                x = 4;
            }
        }
    }
    
    public static void output(String[] nama, int x) {
        for (x = 0; x <= 3; x++) {
            if (!nama[x].equals("---")) {
                System.out.println(nama[x]);
            } else {
                x = 4;
            }
        }
    }
}
