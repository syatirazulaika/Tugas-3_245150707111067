package Ekpedisi;

class EkspedisiBarang {
    private String namaPengirim;
    private String alamatTujuan;
    private double berat;
    private double biayaDasar;

    // Default Constructor
    public EkspedisiBarang() {
        this.namaPengirim = "";
        this.alamatTujuan = "";
        this.berat = 0.0;
        this.biayaDasar = 0.0;
    }

    // Overloading Constructor
    public EkspedisiBarang(String namaPengirim, String alamatTujuan, double berat, double biayaDasar) {
        this.namaPengirim = namaPengirim;
        this.alamatTujuan = alamatTujuan;
        this.berat = berat;
        this.biayaDasar = biayaDasar;
    }

    // Overloaded Method - Diskon Persentase
    public double hitungOngkir(double diskonPersen) {
        double totalBiaya = biayaDasar * berat;
        return totalBiaya - (totalBiaya * (diskonPersen / 100));
    }

    // Overloaded Method - Diskon Persentase + Biaya Tambahan
    public double hitungOngkir(double diskonPersen, double biayaTambahan) {
        return hitungOngkir(diskonPersen) + biayaTambahan;
    }

    // Overloaded Method - Berdasarkan Jarak
    public double hitungOngkir(int jarak) {
        double totalBiaya = biayaDasar * berat;
        if (jarak > 50) {
            return totalBiaya + (totalBiaya * 0.10);
        } else {
            return totalBiaya - (totalBiaya * 0.05);
        }
    }

    // Menampilkan info perusahaan logistik
    public static void displayInfoLogistik() {
        System.out.println("=== Perusahaan Logistik Singebut ===");
        System.out.println("Kami menyediakan layanan pengiriman cepat dan aman.");
    }

    // Method untuk menampilkan detail pengiriman
    public void displayInfoPengiriman() {
        System.out.println("Nama Pengirim: " + namaPengirim);
        System.out.println("Alamat Tujuan: " + alamatTujuan);
        System.out.println("Berat Barang: " + berat + " kg");
        System.out.println("Biaya Dasar: Rp " + biayaDasar);
    }
}
