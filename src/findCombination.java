import java.util.Scanner;

public class findCombination {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1, number2, total = 1, total2 = 1, total3 = 1;

        System.out.print("N Sayısını Giriniz:");
        number1 = input.nextInt();

        System.out.print("R Sayısını Giriniz:");
        number2 = input.nextInt();

        for (int i = 1; i <= number1; i++) {
            total = total * i;
        }
        System.out.println(number1 + " Sayısının Faktöriyeli:" + total);

        for (int k = 1; k <= number2; k++) {
            total2 = total2 * k;
        }
        System.out.println(number2 + " Sayısının Faktöriyeli:" + total2);

        for (int m = 1; m <= (number1 - number2); m++) {
            total3 = total3 * m;
        }
        System.out.println("(N-R)'nin Faktöriyeli:" + total3);
        int combination;
        combination = total / (total2 * total3);
        System.out.println(number1 + "Sayısının " + number2 + " r li Kombinasyonu:" + combination);


    }
}
