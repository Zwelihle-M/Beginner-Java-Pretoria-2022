import javax.swing.JOptionPane;


class Lawn {
    private double length;
    private double width;


    public Lawn() {
    }


    public Lawn(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double calculateWeeklyFee() {
        double area = calculateArea();
        // The weekly fee for mowing a lot under 4,000 square feet is R25.
        if (area < 4000) {
            return 25;
        }
        // The fee for a lot that is 4,000 square feet or more,
        // but under 6,000 square feet, is R35 per week.
        if (area >= 4000 && area < 6000) {
            return 35;
        }
        // The fee for a lot that is 6,000 square feet or over is R50 per week.
        return 50;
    }


    public double calculateArea() {
        return this.length * this.width;
    }


    /**
     * @return the length
     */
    public double getLength() {
        return length;
    }


    /**
     * @param length the length to set
     */
    public void setLength(double length) {
        this.length = length;
    }


    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }


    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }


}


class App {


    public static void main(String[] args) {
        double length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length of a lawn: "));
        double width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width of a lawn: "));
        Lawn l = new Lawn(length, width);
        double weekSeasonalFee20 = l.calculateWeeklyFee() * 20;
        String output = "Your lawn is " + l.calculateArea() + " square feet.\n";
        output += "Weekly fee: R" + l.calculateWeeklyFee() + "\n";
        output += "20-week seasonal fee: R" + weekSeasonalFee20 + "\n";
        output += "Your payment is 20 times per year: R" + l.calculateWeeklyFee() + "\n";


        JOptionPane.showMessageDialog(null, output);
    }
}