package Ekpedisi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sytr = new Scanner(System.in);

        EkspedisiBarang.displayInfoLogistik();
        System.out.println();

        System.out.print("Masukkan Nama Pengirim: ");
        String nama = sytr.nextLine();
        System.out.print("Masukkan Alamat Tujuan: ");
        String alamat = sytr.nextLine();
        System.out.print("Masukkan Berat Barang (kg): ");
        double berat = sytr.nextDouble();
        System.out.print("Masukkan Biaya Dasar: ");
        double biayaDasar = sytr.nextDouble();

        EkspedisiBarang pengiriman = new EkspedisiBarang(nama, alamat, berat, biayaDasar);
        pengiriman.displayInfoPengiriman();
        System.out.println();

        System.out.print("Masukkan diskon persentase: ");
        double diskon = sytr.nextDouble();
        System.out.println("Ongkir setelah diskon " + diskon + "%: Rp " + pengiriman.hitungOngkir(diskon));
        
        System.out.print("Masukkan biaya tambahan: ");
        double biayaTambahan = sytr.nextDouble();
        System.out.println("Ongkir setelah diskon " + diskon + "% + biaya tambahan Rp " + biayaTambahan + ": Rp " + pengiriman.hitungOngkir(diskon, biayaTambahan));
        
        System.out.print("Masukkan jarak pengiriman (km): ");
        int jarak = sytr.nextInt();
        System.out.println("Ongkir untuk jarak " + jarak + " km: Rp " + pengiriman.hitungOngkir(jarak));
        
        sytr.close();
    }
}
