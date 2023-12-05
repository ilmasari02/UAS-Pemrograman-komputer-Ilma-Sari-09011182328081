import java.util.Scanner;
// ilmasari_09011182328081_sk1c_uas
public class autentikasipengguna {
    public static void main(String[] args) {
        // Nilai username dan password yang telah ditentukan
        String usernameTersimpan = "ilmasaricantik245";
        String passwordTersimpan = "020405";

        // Input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = scanner.nextLine();

        // Periksa autentikasi
        if (autentikasiBerhasil(usernameInput, passwordInput, usernameTersimpan, passwordTersimpan)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }
    }

    static boolean autentikasiBerhasil(String usernameInput, String passwordInput, String usernameTersimpan, String passwordTersimpan) {
        // Perbandingan nilai username dan password
        return usernameInput.equals(usernameTersimpan) && passwordInput.equals(passwordTersimpan);
    }
}