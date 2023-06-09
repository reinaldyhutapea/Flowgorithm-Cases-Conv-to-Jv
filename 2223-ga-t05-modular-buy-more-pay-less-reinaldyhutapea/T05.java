// 12S22010 - Reinaldy Hutapea
// 12S22023 - Chika Situmorang

import java.util.*;
import java.lang.Math;

public class T05 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double[] totalHargaBuku = new double[3];
        double totalHargaBukuHasil;
        
        totalHargaBukuHasil = 0;
        
        // semua inputan akan di declare dan assign terlebih dahulu sehingga dapat dipakai, setelah itu kita akan memasukkan fungsi agar program dapat berjalan
        way(totalHargaBuku, totalHargaBukuHasil);
        hasil(totalHargaBuku, totalHargaBukuHasil);
    }
    
    public static double hasil(double[] diTotalHargaBuku, double diTotalHargaBukuHasil) {
        diTotalHargaBukuHasil = diTotalHargaBuku[0] + diTotalHargaBuku[1] + diTotalHargaBuku[2];
        System.out.println(toFixed(diTotalHargaBukuHasil,2));
        
        return diTotalHargaBukuHasil;
    }
    
    public static void way(double[] diTotalHargaBuku, double diTotalHargaBukuHasil) {
        String[] iSBN = new String[3];
        int[] jumlahBuku = new int[3];
        
        jumlahBuku[0] = 0;
        jumlahBuku[1] = 0;
        jumlahBuku[2] = 0;
        double[] hargaBuku = new double[3];
        
        hargaBuku[0] = 0;
        hargaBuku[1] = 0;
        hargaBuku[2] = 0;
        diTotalHargaBuku[0] = 0;
        diTotalHargaBuku[1] = 0;
        diTotalHargaBuku[2] = 0;
        int n;
        int jumlahBuku0;
        int jumlahBuku1;
        int jumlahBuku2;
        
        n = 0;
        jumlahBuku0 = 0;
        jumlahBuku1 = 0;
        jumlahBuku2 = 0;
        String buku0;
        String buku1;
        String buku2;
        
        buku0 = "buku";
        buku1 = "buku";
        buku2 = "buku";
        int nol;
        int satu;
        int dua;
        
        nol = 0;
        satu = 1;
        dua = 2;
        do {
            iSBN[n] = input.nextLine();
            if (iSBN[n].equals("---")) {
                n = 3;
            } else {
                if (iSBN[n].equals(iSBN[0])) {
                    if (nol == 0) {
                        buku0 = iSBN[n];
                    }
                    if (iSBN[0].equals(buku0)) {
                        n = 0;
                        hargaBuku[n] = Double.parseDouble(input.nextLine());
                        jumlahBuku[n] = Integer.parseInt(input.nextLine());
                        jumlahBuku0 = jumlahBuku0 + jumlahBuku[n];
                        nol = 3;
                        n = n + 1;
                    } else {
                        if (satu == 1) {
                            buku1 = iSBN[n];
                        }
                        if (iSBN[0].equals(buku1)) {
                            n = 1;
                            hargaBuku[n] = Double.parseDouble(input.nextLine());
                            jumlahBuku[n] = Integer.parseInt(input.nextLine());
                            jumlahBuku1 = jumlahBuku1 + jumlahBuku[n];
                            nol = 3;
                            n = n + 1;
                        } else {
                            n = 2;
                            hargaBuku[n] = Double.parseDouble(input.nextLine());
                            jumlahBuku[n] = Integer.parseInt(input.nextLine());
                            jumlahBuku2 = jumlahBuku2 + jumlahBuku[n];
                            nol = 3;
                            n = 0;
                        }
                    }
                } else {
                    if (iSBN[n].equals(iSBN[1])) {
                        if (satu == 1) {
                            buku1 = iSBN[n];
                        }
                        if (iSBN[1].equals(buku1)) {
                            n = 1;
                            hargaBuku[n] = Double.parseDouble(input.nextLine());
                            jumlahBuku[n] = Integer.parseInt(input.nextLine());
                            jumlahBuku1 = jumlahBuku1 + jumlahBuku[n];
                            satu = 3;
                            n = n + 1;
                        } else {
                            n = 2;
                            hargaBuku[n] = Double.parseDouble(input.nextLine());
                            jumlahBuku[n] = Integer.parseInt(input.nextLine());
                            jumlahBuku2 = jumlahBuku2 + jumlahBuku[n];
                            satu = 3;
                            n = 0;
                        }
                    } else {
                        if (iSBN[n].equals(iSBN[2])) {
                            if (dua == 2) {
                                buku2 = iSBN[n];
                            }
                            if (iSBN[2].equals(buku2)) {
                                n = 2;
                                hargaBuku[n] = Double.parseDouble(input.nextLine());
                                jumlahBuku[n] = Integer.parseInt(input.nextLine());
                                jumlahBuku[2] = jumlahBuku[2] + jumlahBuku[n];
                                dua = 3;
                                n = 0;
                            }
                        }
                    }
                }
            }
        } while (n < 3);
        if (jumlahBuku0 >= 20) {
            hargaBuku[0] = hargaBuku[0] - hargaBuku[0] * 12 / 100;
        } else {
            if (jumlahBuku0 >= 10) {
                hargaBuku[0] = hargaBuku[0] - hargaBuku[0] * 5 / 100;
            } else {
                if (jumlahBuku0 >= 5) {
                    hargaBuku[0] = hargaBuku[0] - hargaBuku[0] * 2 / 100;
                }
            }
        }
        diTotalHargaBuku[0] = hargaBuku[0] * jumlahBuku0;
        if (jumlahBuku1 >= 20) {
            hargaBuku[1] = hargaBuku[1] - hargaBuku[1] * 12 / 100;
        } else {
            if (jumlahBuku1 >= 10) {
                hargaBuku[1] = hargaBuku[1] - hargaBuku[1] * 5 / 100;
            } else {
                if (jumlahBuku1 >= 5) {
                    hargaBuku[1] = hargaBuku[1] - hargaBuku[1] * 2 / 100;
                }
            }
        }
        diTotalHargaBuku[1] = hargaBuku[1] * jumlahBuku1;
        if (jumlahBuku2 >= 20) {
            hargaBuku[2] = hargaBuku[2] - hargaBuku[2] * 12 / 100;
        } else {
            if (jumlahBuku2 >= 10) {
                hargaBuku[2] = hargaBuku[2] - hargaBuku[2] * 5 / 100;
            } else {
                if (jumlahBuku2 >= 5) {
                    hargaBuku[2] = hargaBuku[2] - hargaBuku[2] * 2 / 100;
                }
            }
        }
        diTotalHargaBuku[2] = hargaBuku[2] * jumlahBuku2;
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
