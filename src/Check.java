public class Check {

    public static boolean romeI() {
        String[] massArabic = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i < 10; i++) {
            if (Calculator.symbols[0].equals(massArabic[i])) {
                return true;
            }
        }
        return false;
    }


    public static boolean romeII() {
        String[] massArabic = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 0; i < 10; i++) {
            if (Calculator.symbols[2].equals(massArabic[i])) {
                return true;
            }
        }
        return false;
    }
}

