import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lutfen Bir Sayı Giriniz :");
        int number = input.nextInt();
        double result = 0;
        for (double i = 1; i <= number; i++) {
           result += (1/i);
        }
        System.out.println(result);
    }
}






