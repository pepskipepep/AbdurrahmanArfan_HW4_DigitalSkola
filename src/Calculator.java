import java.util.*;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextInt();

        System.out.print("Masukkan simbol operator yang diinginkan (+, -, x, /): ");
        String operator = scanner.next();

        double result = 0;
        switch (operator) {
            case "+":
                result = angka1 + angka2;
                break;
            case "-":
                result = angka1 - angka2;
                break;
            case "x":
                result = angka1 * angka2;
                break;
            case "/":
                if (angka2 == 0) {
                    System.out.println("Angka kedua tidak boleh 0");
                    return;
                }
                result = angka1 / angka2;
                break;
            default:
                System.out.println("Operator tidak dikenali");
                return;
        }

        if (result == (int) result) {
            result = (int) result;
        }
        
        System.out.println("Hasil: " + result);
    }
}
