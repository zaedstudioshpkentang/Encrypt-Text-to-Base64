import java.util.Scanner;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih operasi:");
        System.out.println("1. Encrypt ke Base64");
        System.out.println("2. Decrypt dari Base64");

        int choice = scanner.nextInt();
        scanner.nextLine();  // consume the newline character

        System.out.print("Masukkan teks: ");
        String inputText = scanner.nextLine();

        if (!inputText.isEmpty()) {
            String result = "";

            if (choice == 1) {
                result = encryptToBase64(inputText);
                System.out.println("Hasil enkripsi ke Base64: " + result);
            } else if (choice == 2) {
                result = decryptFromBase64(inputText);
                System.out.println("Hasil dekripsi dari Base64: " + result);
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih 1 atau 2.");
            }
        } else {
            System.out.println("Teks kosong. Masukkan teks terlebih dahulu.");
        }
    }

    private static String encryptToBase64(String text) {
        byte[] data = text.getBytes();
        return Base64.getEncoder().encodeToString(data);
    }

    private static String decryptFromBase64(String base64Text) {
        byte[] decodedBytes = Base64.getDecoder().decode(base64Text);
        return new String(decodedBytes);
    }
}