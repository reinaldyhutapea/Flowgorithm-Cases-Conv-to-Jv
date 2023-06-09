// 12S22010 - Reinaldy Hutapea
import java.util.*;
import java.lang.Math;

public class T04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] isbn = new String[3];
        double[] price = new double[3];
        
        price[0] = 0;
        price[1] = 0;
        price[2] = 0;
        String buku0, buku1, buku2;
        
        buku0 = "0";
        buku1 = "0";
        buku2 = "0";
        double[] befprice = new double[3];
           
        befprice[0] = 0;
        befprice[1] = 0;
        befprice[2] = 0;
        int[] quantity = new int[3];
        
        quantity[0] = 0;
        quantity[1] = 0;
        quantity[2] = 0;
        double totalharga;
        
        totalharga = 0;
        int quantity0, quantity1, quantity2, y;
        
        y = 0;
        quantity0 = 0;
        quantity1 = 0;
        quantity2 = 0;
        while (y <= 2) {
            isbn[y] = input.nextLine();
            if (!isbn[y].equals("---")) {
                if (isbn[y].equals(isbn[0])) {
                    buku0 = isbn[y];
                    y = 0;
                    price[y] = Double.parseDouble(input.nextLine());
                    quantity[y] = Integer.parseInt(input.nextLine());
                    quantity0 = quantity0 + quantity[y];
                    y = y + 1;
                } else {
                    buku1 = isbn[y];
                    if (isbn[y].equals(isbn[1])) {
                        y = 1;
                        price[y] = Double.parseDouble(input.nextLine());
                        quantity[y] = Integer.parseInt(input.nextLine());
                        quantity1 = quantity1 + quantity[y];
                        y = y + 1;
                    } else {
                        buku2 = isbn[y];
                        if (isbn[y].equals(isbn[2])) {
                            y = 2;
                            price[y] = Double.parseDouble(input.nextLine());
                            quantity[y] = Integer.parseInt(input.nextLine());
                            quantity2 = quantity2 + quantity[y];
                            y = y + 1;
                        }
                    }
                }
            } else {
                y = 3;
            }
        }
        if (quantity0 <= 5) {
            befprice[0] = befprice[0] - befprice[0] * 2 / 100;
        } else {
            if (quantity0 <= 10) {
                befprice[0] = befprice[0] - befprice[0] * 5 / 100;
            } else {
                if (quantity0 <= 20) {
                    befprice[0] = befprice[0] - befprice[0] * 12 / 100;
                }
            }
        }
        befprice[0] = befprice[0] * quantity0;
        if (quantity1 >= 20) {
            befprice[1] = befprice[1] - befprice[1] * 12 / 100;
        } else {
            if (quantity1 >= 10) {
                befprice[1] = befprice[1] - befprice[1] * 5 / 100;
            } else {
                if (quantity1 >= 5) {
                    befprice[1] = befprice[1] - befprice[1] * 2 / 100;
                }
            }
        }
        befprice[1] = befprice[1] * quantity1;
        if (quantity2 >= 20) {
            befprice[2] = befprice[2] - befprice[2] * 12 / 100;
        } else {
            if (quantity2 >= 10) {
                befprice[2] = befprice[2] - befprice[2] * 5 / 100;
            } else {
                if (quantity2 >= 5) {
                    befprice[2] = befprice[2] - befprice[2] * 2 / 100;
                }
            }
        }
        befprice[2] = befprice[2] * quantity2;
        totalharga = befprice[0] + befprice[1] + befprice[2];
        System.out.println(toFixed(totalharga,2));
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
