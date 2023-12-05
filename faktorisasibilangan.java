import java.util.Scanner;
//ilmasari_09011182328081_sk1c_uas
public class faktorisasibilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        // Memanggil metode untuk melakukan faktorisasi
        faktorisasiBilangan(bilangan);

        scanner.close();
    }

    // Metode untuk melakukan faktorisasi
    public static void faktorisasiBilangan(int bilangan) {
        System.out.print("Faktorisasi " + bilangan + ": ");

        // Mencari faktor-faktor bilangan
        for (int i = 2; i <= bilangan; i++) {
            while (bilangan % i == 0) {
                System.out.print(i);
                bilangan /= i;

                if (bilangan > 1) {
                    System.out.print("*");
                }
            }
        }
    }
}