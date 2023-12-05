import java.util.Scanner;
// ilmasari_09011182328081_sk1c_uas
public class buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    // Konstruktor
    public buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    // Metode untuk menampilkan informasi buku
    public void tampilkanInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        if (dipinjam) {
            System.out.println("Status: Dipinjam");
        } else {
            System.out.println("Status: Tersedia");
        }
    }

    // Metode untuk meminjam buku
    public void pinjamBuku() {
        if (!dipinjam) {
            dipinjam = true;
            System.out.println("Buku berhasil dipinjam.");
        } else {
            System.out.println("Buku sedang tidak tersedia.");
        }
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas Buku
        buku buku1 = new buku("Java Programming", "John Doe", 2020);
        buku buku2 = new buku("Python Basics", "Jane Smith", 2019);

        // Menampilkan informasi buku
        System.out.println("Informasi Buku 1:");
        buku1.tampilkanInformasi();

        System.out.println("\nInformasi Buku 2:");
        buku2.tampilkanInformasi();

        // Meminjam buku
        System.out.println("\nMeminjam Buku 1:");
        buku1.pinjamBuku();

        System.out.println("\nInformasi Buku 1 setelah dipinjam:");
        buku1.tampilkanInformasi();
    }
}