public class Main {
    public static void main(String[] args) {
        // Membuat objek BujurSangkar
        BujurSangkar bujurSangkar = new BujurSangkar(5);

        // Menghitung luas dan keliling bujur sangkar
        System.out.println("Luas Bujur Sangkar: " + bujurSangkar.hitungLuas());
        System.out.println("Keliling Bujur Sangkar: " + bujurSangkar.hitungKeliling());

        // Membuat objek PersegiPanjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(4, 6);

        // Menghitung luas dan keliling persegi panjang
        System.out.println("\nLuas Persegi Panjang: " + persegiPanjang.hitungLuas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());
    }
}
