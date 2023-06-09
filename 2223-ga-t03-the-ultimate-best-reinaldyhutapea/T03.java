//12S22010 - Reinaldy Hutapea
//12S22046 - Difya Laurensya Ambarita
import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, tahunTerbit, penerbit, format, buku, kategori, diskontype;
        double harga, margin, rating, nilai, diskon;
        int stok;
        
        do {
            iSBN = input.nextLine();
            if (!iSBN.equals("---")) {
                judul = input.nextLine();
                penulis = input.nextLine();
                tahunTerbit = input.nextLine();
                penerbit = input.nextLine();
                format = input.nextLine();
                harga = Double.parseDouble(input.nextLine());
                margin = Double.parseDouble(input.nextLine());
                stok = Integer.parseInt(input.nextLine());
                rating = Double.parseDouble(input.nextLine());
                if (penerbit.equals("---")) {
                    penerbit = "---";
                }
                if (rating >= 4.7) {
                    kategori = "Best Pick";
                } else {
                    if (rating >= 4.5) {
                        kategori = "Must Pick";
                    } else {
                        if (rating >= 4.0) {
                            kategori = "Recommended";
                        } else {
                            if (rating >= 3.0) {
                                kategori = "Average";
                            } else {
                                kategori = "Low";
                            }
                        }
                    }
                }
                diskon = -(margin / harga) * 100;
                if (margin > 0) {
                    diskontype = "---";
                } else {
                    if (diskon > 40.00) {
                        diskontype = "Once in a lifetime";
                    } else {
                        if (diskon > 20.00) {
                            diskontype = "Never come twice";
                        } else {
                            diskontype = "No regret";
                        }
                    }
                }
                if (diskontype.equals("Once in a lifetime") && kategori.equals("Best Pick")) {
                    buku = "The Ultimate Best";
                } else {
                    buku = "---";
                }
                System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + format + "|" + harga + "|" + margin + "|" + stok + "|" + rating + "|" + kategori + "|" + diskontype + "|" + buku);
            }
        } while (iSBN.equals("---"));
    }
}
