import java.util.Stack;
// ilmasari_09011182328081_sk1c_uas
public class pemeriksakurung {

    public static boolean periksaUrutanKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        for (char karakter : ekspresi.toCharArray()) {
            if (karakter == '(' || karakter == '{' || karakter == '[') {
                stack.push(karakter);
            } else if (karakter == ')' || karakter == '}' || karakter == ']') {
                if (stack.isEmpty()) {
                    return false; // Terdapat kurung tutup tanpa pasangan kurung buka
                }

                char kurungBuka = stack.pop();
                if (!isPasanganKurung(kurungBuka, karakter)) {
                    return false; // Pasangan kurung tidak sesuai
                }
            }
        }

        return stack.isEmpty(); // Jika stack kosong, urutan kurung benar
    }

    private static boolean isPasanganKurung(char kurungBuka, char kurungTutup) {
        return (kurungBuka == '(' && kurungTutup == ')') ||
               (kurungBuka == '{' && kurungTutup == '}') ||
               (kurungBuka == '[' && kurungTutup == ']');
    }

    public static void main(String[] args) {
        String ekspresi1 = "((a+b)*(c-d))";
        String ekspresi2 = "[(a+b)*(c-d)]";
        String ekspresi3 = "{(a+b)*(c-d)}";
        String ekspresi4 = "(a+b)*[c-d)]";

        System.out.println("Ekspresi 1: " + (periksaUrutanKurung(ekspresi1) ? "Benar" : "Salah"));
        System.out.println("Ekspresi 2: " + (periksaUrutanKurung(ekspresi2) ? "Benar" : "Salah"));
        System.out.println("Ekspresi 3: " + (periksaUrutanKurung(ekspresi3) ? "Benar" : "Salah"));
        System.out.println("Ekspresi 4: " + (periksaUrutanKurung(ekspresi4) ? "Benar" : "Salah"));
    }
}
