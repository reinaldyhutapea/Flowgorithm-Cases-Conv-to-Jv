// 12S22010 - Reinaldy Hutapea
// 12S22046 - Difya Laurensya Ambarita
import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, tahunTerbit, penerbit, format;
        double harga, margin, rating;
        int stok;
        
        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahunTerbit = input.nextLine();
        penerbit = input.nextLine();
        format = input.nextLine();
        harga = input.nextDouble();
        margin = input.nextDouble();
        stok = input.nextInt();
        rating = input.nextDouble();
        if (rating >= 4.7) {
            System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + format + "|" + harga + "|" + margin + "|" + stok + "|" + rating + "|" + "Best Pick");
        } else {
            if (rating >= 4.5) {
                System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + format + "|" + harga + "|" + margin + "|" + stok + "|" + rating + "|" + "Must Read");
            } else {
                if (rating >= 4.0) {
                    System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + format + "|" + harga + "|" + margin + "|" + stok + "|" + rating + "|" + "Recommended");
                } else {
                    if (rating >= 3.0) {
                        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + format + "|" + harga + "|" + margin + "|" + stok + "|" + rating + "|" + "Average");
                    } else {
                        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + format + "|" + harga + "|" + margin + "|" + stok + "|" + rating + "|" + "Low");
                    }
                }
            }
        }
    }
}
