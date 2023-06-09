// 12S22010 - Reinaldy Hutapea
// 12S22023 - Chika Situmorang 

import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        boolean palindrom;
        String word;
        
        word = input.nextLine();
        palindrom = true;
        i = 0;
        while (i <= (double) word.length() / 2 - 1 && palindrom == true) {
            if (!String.valueOf(word.charAt(i)).equals(String.valueOf(word.charAt(word.length() - i - 1)))) {
                palindrom = false;
            }
            i = i + 1;
        }
        if (palindrom == true) {
            System.out.println("YA");
        } else {
            System.out.println("BUKAN");
        }
    }
    
    public static void read(int n, String[] word) {
        int i;
        
        for (i = 0; i <= n - 1; i++) {
            word[i] = input.nextLine();
        }
    }
}

