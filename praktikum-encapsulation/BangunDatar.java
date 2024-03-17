public class BangunDatar {
    private double panjang;
    private double lebar;

    // Constructor
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }

    // Method untuk menghitung keliling
    public double hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    // Method Setter untuk panjang
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    // Method Getter untuk panjang
    public double getPanjang() {
        return panjang;
    }

    // Method Setter untuk lebar
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    // Method Getter untuk lebar
    public double getLebar() {
        return lebar;
    }
}
