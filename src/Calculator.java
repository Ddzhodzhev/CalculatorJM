import java.util.Scanner;

public class Calculator {
    public static String[] symbols;
    public static int a, b;

    public static void main(String[] args) throws Exception {
        System.out.println("Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b.");
        System.out.println("Калькулятор умеет работать как с арабскими (от 1 до 10), так и с римскими числами (от I до X).");
        System.out.println("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно.");
        System.out.println("Напишите выражение вида 3 + 5 или V + IX.");

        Scanner newscanner = new Scanner(System.in);
        String value = newscanner.nextLine();
        symbols = value.split(" ");
        RomeArabic.RomeToArabic();
        try {
            if (symbols.length != 3) {
                throw new Exception();
            }
            if (Check.romeI() == false || Check.romeII() == false) {

                a = Integer.parseInt(symbols[0]);
                b = Integer.parseInt(symbols[2]);
                if (a > 10 || b > 10) {
                    throw new Exception();
                }
            }

            Calculate.calculate();
            if (Check.romeI() && Check.romeII()) {
                RomeArabic.ArabicToRome();
                if (a > 10 || b > 10) {
                    throw new Exception();
                }
                System.out.println(RomeArabic.ArabicToRome());


            } else {
                System.out.println(Calculate.result);
            }
        } catch (Exception e) {
            System.out.println("Ошибка калькулятора, проверь условия:");
            System.out.println("Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b.");
            System.out.println("Калькулятор умеет работать как с арабскими (от 1 до 10), так и с римскими числами (от I до X).");
            System.out.println("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно.");
            System.out.println("Напишите выражение вида 3 + 5 или V + IX.");

        }
    }
}

