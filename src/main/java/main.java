import Parser.Parser;
import Parser.ParserException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class main {


    public static void main(String[] args) throws ParserException {
        parsStart();
    }

    public static void parsStart() throws ParserException {

        Parser myParser = new Parser();

        for (int x = 0; x < 1; x++) {
            try {
                System.out.print("Введите выражение для вычисления\n-> ");
                String str = "10%4";
                String str1 = "1-100";
                String str2 = "4*(9+1)*5-1";
                String str3 = "((5+5)*4)/10";
                double result = myParser.evaluate(str);
                double result1 = myParser.evaluate(str1);
                double result2 = myParser.evaluate(str2);
                double result3 = myParser.evaluate(str3);
                DecimalFormatSymbols s = new DecimalFormatSymbols();
                s.setDecimalSeparator('.');
                DecimalFormat f = new DecimalFormat("#,###.00", s);
                System.out.printf("%s = %s%n", str, f.format(result));
                System.out.printf("%s = %s%n", str1, f.format(result1));
                System.out.printf("%s = %s%n", str2, f.format(result2));
                System.out.printf("%s = %s%n", str3, f.format(result3));
            } catch (ParserException e) {
                System.out.println(e);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

