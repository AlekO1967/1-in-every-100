import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Добавьте сумму в рублях, без мелочи. Мелочь ми нэ вигавариваэм.:");
        int transfer = input.nextInt();
        int bonus;
        int limit = 1000;
                if (transfer >= limit) {
            bonus = transfer / 100;
        }
        else {
            bonus = 0;
        }
        int startBalanse = 100;
        int count = startBalanse + transfer + bonus;
        System.out.println("Бонус: " + bonus);
        System.out.println("На Вашем счету: " + count );
    }
}