import java.util.Scanner;
// ilmasari_09011182328081_sk1c_uas
public class akunpengguna {
    private String username;
    private String password;
    private boolean aktif;

    // Konstruktor
    public akunpengguna(String username, String password) {
        this.username = username;
        this.password = password;
        this.aktif = true; // Saat akun dibuat, dianggap aktif
    }

    // Metode untuk menampilkan informasi akun
    public void tampilkanInformasi() {
        System.out.println("Username: " + username);
        System.out.println("Status: " + (aktif ? "Aktif" : "Nonaktif"));
    }

    // Metode untuk mengaktifkan akun
    public void aktifkanAkun() {
        aktif = true;
        System.out.println("Akun berhasil diaktifkan.");
    }

    // Metode untuk menonaktifkan akun
    public void nonaktifkanAkun() {
        aktif = false;
        System.out.println("Akun berhasil dinonaktifkan.");
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas AkunPengguna
        akunpengguna akun1 = new akunpengguna("ilmafasilkom23", "2234");
        akunpengguna akun2 = new akunpengguna("sarisistemkomputer20", "6675");

        // Menampilkan informasi akun
        System.out.println("Informasi Akun 1:");
        akun1.tampilkanInformasi();

        System.out.println("\nInformasi Akun 2:");
        akun2.tampilkanInformasi();

        // Menonaktifkan akun
        System.out.println("\nMenonaktifkan Akun 1:");
        akun1.nonaktifkanAkun();

        System.out.println("\nInformasi Akun 1 setelah dinonaktifkan:");
        akun1.tampilkanInformasi();
    }
}