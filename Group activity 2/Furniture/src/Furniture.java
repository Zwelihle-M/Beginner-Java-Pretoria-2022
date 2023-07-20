import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Furniture {
    private static BufferedReader in = new BufferedReader(
            new InputStreamReader(System.in));

    public static void main(String[] args) {

        writeSeparator();
        writeLine("Furniture Program");
        writeSeparator();

        writeLine("Please select your table size:");
        writeLine("(1) Large");
        writeLine("(2) Small");

        String tableSize = readLine("> ");

        writeLine("");
        writeLine("Select the wood:");
        writeLine("(1) Pine");
        writeLine("(2) Oak");
        writeLine("(3) Mahogany");

        String wood = readLine("> ");
        String woodName = "";

        double price = 0;

        if ("1".equals(tableSize)) {
            price += 35.00; // Large Table, add $35.00
        }

        if ("1".equals(wood)) {
            price += 100.00;
            woodName = "Pine";
        } else if ("2".equals(wood)) {
            price += 225.00;
            woodName = "Oak";
        } else if ("3".equals(wood)) {
            price += 310.00;
            woodName = "Mahogany";
        }

        writeSeparator();
        if (!"".equals(woodName)) {
            writeLine("The selected wood was: " + woodName);
        }
        write("Price: " + String.format("R%6.2f", price));

    }

    private static String readLine(String caption) {
        write(caption);
        try {
            return in.readLine();
        } catch (IOException e) {
            return "";
        }
    }

    private static void write(String... values) {
        for (Object value : values) {
            System.out.print(value);
        }
    }

    private static void writeLine(Object... values) {
        for (Object value : values) {
            System.out.print(value);
        }
        System.out.println();
    }

    private static void writeSeparator() {
        writeLine("---------------------------------------");
    }

}