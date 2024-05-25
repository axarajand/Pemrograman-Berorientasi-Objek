public class String {
    public static void main(String[] args) {
        String name = "Coding All String  ";
        System.out.println("Panjang string: " + name.length());
        System.out.println("Substring: " + name.substring(7)); // Mengambil substring dari indeks ke-7
        System.out.println("Karakter pada indeks ke-5: " + name.charAt(5)); // Mengambil karakter pada indeks ke-5
        System.out.println("Huruf kecil: " + name.toLowerCase());
        System.out.println("Huruf besar: " + name.toUpperCase());
        System.out.println("String setelah penggantian: " + name.replace("All", "Tll")); // Mengganti "All" dengan "Tll"
        System.out.println("Apakah string mengandung 'String'?: " + name.contains("String")); // Memeriksa apakah string mengandung "String"
        System.out.println("Apakah string sama dengan 'Coding All String'?: " + name.equals("Coding All String")); // Memeriksa kesamaan string
        System.out.println("Apakah string sama dengan 'coding all string' (tanpa memperhatikan case)?: " + name.equalsIgnoreCase("coding all string")); // Memeriksa kesamaan string tanpa memperhatikan case
        System.out.println("Apakah string diakhiri dengan ' '?: " + name.endsWith(" ")); // Memeriksa apakah string diakhiri dengan spasi
    }
}
