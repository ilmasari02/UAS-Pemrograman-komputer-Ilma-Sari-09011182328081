import java.util.Scanner;
//ilmasari_09011182328081_sk1c_uas
public class kalkulatorsederhana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan operasi (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        // Memanggil metode sesuai operasi yang dimasukkan
        switch (operator) {
            case '+':
                jumlah(angka1, angka2);
                break;
            case '-':
                kurang(angka1, angka2);
                break;
            case '*':
                kali(angka1, angka2);
                break;
            case '/':
                bagi(angka1, angka2);
                break;
            default:
                System.out.println("Operasi tidak valid.");
        }

        scanner.close();
    }

    // Metode untuk penjumlahan
    public static void jumlah(double angka1, double angka2) {
        double hasil = angka1 + angka2;
        System.out.println("Hasil penjumlahan: " + hasil);
    }

    // Metode untuk pengurangan
    public static void kurang(double angka1, double angka2) {
        double hasil = angka1 - angka2;
        System.out.println("Hasil pengurangan: " + hasil);
    }

    // Metode untuk perkalian
    public static void kali(double angka1, double angka2) {
        double hasil = angka1 * angka2;
        System.out.println("Hasil perkalian: " + hasil);
    }

    // Metode untuk pembagian
    public static void bagi(double angka1, double angka2) {
        if (angka2 != 0) {
            double hasil = angka1 / angka2;
            System.out.println("Hasil pembagian: " + hasil);
        } else {
            System.out.println("Tidak dapat melakukan pembagian dengan nol.");
        }
    }
}