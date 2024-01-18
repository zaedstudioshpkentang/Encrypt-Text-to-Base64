import java.util.Scanner;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();

        if (!inputText.isEmpty()) {
            String base64Result = convertToBase64(inputText);
            System.out.println("Base64 conversion result: " + base64Result);
        } else {
            System.out.println("Empty text. Please enter text first.");
        }
    }

    private static String convertToBase64(String text) {
        byte[] data = text.getBytes();
        return Base64.getEncoder().encodeToString(data);
    }
}