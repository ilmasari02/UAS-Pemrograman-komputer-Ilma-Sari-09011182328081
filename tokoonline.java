import java.util.Scanner;
// ilmasari_09011182328081_sk1c_uas
public class tokoonline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();

        System.out.print("Masukkan harga per barang: ");
        double hargaPerBarang = scanner.nextDouble();

        double totalHarga = hitungTotalHarga(jumlahBarang, hargaPerBarang);

        System.out.println("Total harga yang harus dibayar: " + totalHarga);
    }

    static double hitungTotalHarga(int jumlahBarang, double hargaPerBarang) {
        double totalHarga = jumlahBarang * hargaPerBarang;

        // Berikan diskon berdasarkan jumlah pembelian
        if (jumlahBarang >= 5 && jumlahBarang <= 10) {
            totalHarga *= 0.95; // Diskon 5%
        } else if (jumlahBarang >= 11 && jumlahBarang <= 20) {
            totalHarga *= 0.9; // Diskon 10%
        } else if (jumlahBarang > 20) {
            totalHarga *= 0.8; // Diskon 20%
        }

        return totalHarga;
    }
}