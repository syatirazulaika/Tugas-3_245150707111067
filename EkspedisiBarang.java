package Ekpedisi;

class EkspedisiBarang {
    private String namaPengirim;
    private String alamatTujuan;
    private double berat;
    private double biayaDasar;

    public EkspedisiBarang() {
        this.namaPengirim = "";
        this.alamatTujuan = "";
        this.berat = 0.0;
        this.biayaDasar = 0.0;
    }

    public EkspedisiBarang(String namaPengirim, String alamatTujuan, double berat, double biayaDasar) {
        this.namaPengirim = namaPengirim;
        this.alamatTujuan = alamatTujuan;
        this.berat = berat;
        this.biayaDasar = biayaDasar;
    }

    public double hitungOngkir(double diskonPersen) {
        double totalBiaya = biayaDasar * berat;
        return totalBiaya - (totalBiaya * (diskonPersen / 100));
    }

    public double hitungOngkir(double diskonPersen, double biayaTambahan) {
        return hitungOngkir(diskonPersen) + biayaTambahan;
    }

    public double hitungOngkir(int jarak) {
        double totalBiaya = biayaDasar * berat;
        if (jarak > 50) {
            return totalBiaya + (totalBiaya * 0.10);
        } else {
            return totalBiaya - (totalBiaya * 0.05);
        }
    }

    public static void displayInfoLogistik() {
        System.out.println("=== Perusahaan Logistik Singebut ===");
        System.out.println("Kami menyediakan layanan pengiriman cepat dan aman.");
    }

    public void displayInfoPengiriman() {
        System.out.println("Nama Pengirim: " + namaPengirim);
        System.out.println("Alamat Tujuan: " + alamatTujuan);
        System.out.println("Berat Barang: " + berat + " kg");
        System.out.println("Biaya Dasar: Rp " + biayaDasar);
    }
}
