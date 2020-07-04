public class Bonus02 {

    public static void main(String[] args) {

        /* The values for args can be provided in IntelliJ - Run -> Edit Configurations -> Program arguments
         Or in the command line - java Bonus02 20 50 (Bonus02 being the name of the class)
         (20 and 50 being the parameters width and height of the rectangle);
         Java accepts only String array arguments,
         so it is necessary to convert string to the appropriate number type for mathematical calculations;
         */
        double widthRectangle = Double.parseDouble(args[0]);
        double heightRectangle = Double.parseDouble(args[1]);

        double areaRectangle = widthRectangle * heightRectangle;

        System.out.printf("\nThe area of the rectangle with a %.2f cm width and a %.2f cm height is %.2f sqcm.\n",
                widthRectangle, heightRectangle, areaRectangle);
    }

}
