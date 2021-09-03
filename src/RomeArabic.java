import java.rmi.server.ExportException;


public class RomeArabic {

    public static void RomeToArabic() throws Exception {
   try{

        if (Calculator.symbols[0].equals("I")) {
            Calculator.a = 1;
        }
        if (Calculator.symbols[0].equals("II")) {
            Calculator.a = 2;
        }
        if (Calculator.symbols[0].equals("III")) {
            Calculator.a = 3;
        }
        if (Calculator.symbols[0].equals("IV")) {
            Calculator.a = 4;
        }
        if (Calculator.symbols[0].equals("V")) {
            Calculator.a = 5;
        }
        if (Calculator.symbols[0].equals("VI")) {
            Calculator.a = 6;
        }
        if (Calculator.symbols[0].equals("VII")) {
            Calculator.a = 7;
        }
        if (Calculator.symbols[0].equals("VIII")) {
            Calculator.a = 8;
        }
        if (Calculator.symbols[0].equals("IX")) {
            Calculator.a = 9;
        }
        if (Calculator.symbols[0].equals("X")) {
            Calculator.a = 10;
        }
        if (Calculator.symbols[2].equals("I")) {
            Calculator.b = 1;
        }
        if (Calculator.symbols[2].equals("II")) {
            Calculator.b = 2;
        }
        if (Calculator.symbols[2].equals("III")) {
            Calculator.b = 3;
        }
        if (Calculator.symbols[2].equals("IV")) {
            Calculator.b = 4;
        }
        if (Calculator.symbols[2].equals("V")) {
            Calculator.b = 5;
        }
        if (Calculator.symbols[2].equals("VI")) {
            Calculator.b = 6;
        }
        if (Calculator.symbols[2].equals("VII")) {
            Calculator.b = 7;
        }
        if (Calculator.symbols[2].equals("VIII")) {
            Calculator.b = 8;
        }
        if (Calculator.symbols[2].equals("IX")) {
            Calculator.b = 9;
        }
        if (Calculator.symbols[2].equals("X")) {
            Calculator.b = 10;
        }
        } catch (Exception e) {
        System.out.println("Ошибка калькулятора, проверь условия:");
        System.out.println("Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b.");
        System.out.println("Калькулятор умеет работать как с арабскими (от 1 до 10), так и с римскими числами (от I до X).");
        System.out.println("Калькулятор умеет работать только с арабскими или римскими цифрами одновременно.");
        System.out.println("Напишите выражение вида 3 + 5 или V + IX.");

    }
    }


    public static String ArabicToRome() throws Exception {


        if (Calculate.result == 1) return "I";
        else if (Calculate.result == 2) return "II";
        else if (Calculate.result == 3) return "III";
        else if (Calculate.result == 4) return "IV";
        else if (Calculate.result == 5) return "V";
        else if (Calculate.result == 6) return "VI";
        else if (Calculate.result == 7) return "VII";
        else if (Calculate.result == 8) return "VIII";
        else if (Calculate.result == 9) return "IX";
        else if (Calculate.result == 10) return "X";
        else if (Calculate.result == 11) return "XII";
        else if (Calculate.result == 12) return "XII";
        else if (Calculate.result == 13) return "XIII";
        else if (Calculate.result == 14) return "XIV";
        else if (Calculate.result == 15) return "XV";
        else if (Calculate.result == 16) return "XVI";
        else if (Calculate.result == 17) return "XVII";
        else if (Calculate.result == 18) return "XVIII";
        else if (Calculate.result == 19) return "XIX";
        else if (Calculate.result == 20) return "XX";
        else if (Calculate.result == 21) return "XXI";
        else if (Calculate.result == 22) return "XXII";
        else if (Calculate.result == 23) return "XXIII";
        else if (Calculate.result == 24) return "XXIV";
        else if (Calculate.result == 25) return "XXV";
        else if (Calculate.result == 26) return "XXVI";
        else if (Calculate.result == 27) return "XXVII";
        else if (Calculate.result == 28) return "XXVIII";
        else if (Calculate.result == 29) return "XXIX";
        else if (Calculate.result == 30) return "XXX";
        else if (Calculate.result == 31) return "XXXI";
        else if (Calculate.result == 32) return "XXXII";
        else if (Calculate.result == 33) return "XXXIII";
        else if (Calculate.result == 34) return "XXXIV";
        else if (Calculate.result == 35) return "XXXV";
        else if (Calculate.result == 36) return "XXXVI";
        else if (Calculate.result == 37) return "XXXVII";
        else if (Calculate.result == 38) return "XXXVIII";
        else if (Calculate.result == 39) return "XXXIX";
        else if (Calculate.result == 40) return "XL";
        else if (Calculate.result == 41) return "XI";
        else if (Calculate.result == 42) return "XLI";
        else if (Calculate.result == 43) return "XLII";
        else if (Calculate.result == 44) return "XLIV";
        else if (Calculate.result == 45) return "XLV";
        else if (Calculate.result == 46) return "XLVI";
        else if (Calculate.result == 47) return "XLVII";
        else if (Calculate.result == 48) return "XLVIII";
        else if (Calculate.result == 49) return "XLIX";
        else if (Calculate.result == 50) return "L";
        else if (Calculate.result == 51) return "LI";
        else if (Calculate.result == 52) return "LII";
        else if (Calculate.result == 53) return "LIII";
        else if (Calculate.result == 54) return "LIV";
        else if (Calculate.result == 55) return "LV";
        else if (Calculate.result == 56) return "LVI";
        else if (Calculate.result == 57) return "LVII";
        else if (Calculate.result == 58) return "LVIII";
        else if (Calculate.result == 59) return "LIX";
        else if (Calculate.result == 60) return "LX";
        else if (Calculate.result == 61) return "LXI";
        else if (Calculate.result == 62) return "LXII";
        else if (Calculate.result == 63) return "LXIII";
        else if (Calculate.result == 64) return "LXIV";
        else if (Calculate.result == 65) return "LXV";
        else if (Calculate.result == 66) return "LXVI";
        else if (Calculate.result == 67) return "LXVII";
        else if (Calculate.result == 68) return "LXVIII";
        else if (Calculate.result == 69) return "LXIX";
        else if (Calculate.result == 70) return "LXX";
        else if (Calculate.result == 71) return "LXXI";
        else if (Calculate.result == 72) return "LXXII";
        else if (Calculate.result == 73) return "LXXIII";
        else if (Calculate.result == 74) return "LXXIV";
        else if (Calculate.result == 75) return "LXXV";
        else if (Calculate.result == 76) return "LXXVI";
        else if (Calculate.result == 77) return "LXXVII";
        else if (Calculate.result == 78) return "LXXVIII";
        else if (Calculate.result == 79) return "LXXIX";
        else if (Calculate.result == 80) return "LXXX";
        else if (Calculate.result == 81) return "LXXXI";
        else if (Calculate.result == 82) return "LXXXII";
        else if (Calculate.result == 83) return "LXXXIII";
        else if (Calculate.result == 84) return "LXXXIV";
        else if (Calculate.result == 85) return "LXXXV";
        else if (Calculate.result == 86) return "LXXXVI";
        else if (Calculate.result == 87) return "LXXXVII";
        else if (Calculate.result == 88) return "LXXXVIII";
        else if (Calculate.result == 89) return "LXXXIX";
        else if (Calculate.result == 90) return "XC";
        else if (Calculate.result == 91) return "XCI";
        else if (Calculate.result == 92) return "XCII";
        else if (Calculate.result == 93) return "XCIII";
        else if (Calculate.result == 94) return "XCIV";
        else if (Calculate.result == 95) return "XCV";
        else if (Calculate.result == 96) return "XCVI";
        else if (Calculate.result == 97) return "XCVII";
        else if (Calculate.result == 98) return "XCVIII";
        else if (Calculate.result == 99) return "XCIX";
        else if (Calculate.result == 100) return "C";
        else throw new Exception();

    }

    }
