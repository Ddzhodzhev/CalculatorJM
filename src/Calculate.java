import java.rmi.server.ExportException;

public class Calculate {
    public static int result;

    public static int calculate() {
        if (Calculator.symbols[1].equals("+")) {
            result = Calculator.a + Calculator.b;
        }
        if (Calculator.symbols[1].equals("-")) {
            result = Calculator.a - Calculator.b;
        }
        if (Calculator.symbols[1].equals("*")) {
            result = Calculator.a * Calculator.b;
        }

        if (Calculator.symbols[1].equals("/")) {
            result = Calculator.a / Calculator.b;
        }

        return result;
    }
}