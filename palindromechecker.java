import java.util.Scanner;
// ilmasari_09011182328081_sk1c_uas
public class palindromechecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("Palindrom!");
        } else {
            System.out.println("Bukan palindrom.");
        }

        scanner.close();
    }

    private static boolean isPalindrome(String str) {
        // Menghapus spasi dan mengubah ke huruf kecil
        String cleanedStr = str.replaceAll("\\s", "").toLowerCase();

        int length = cleanedStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}