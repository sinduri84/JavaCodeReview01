public class Bonus02 {

    public static void main(String[] args) {

        double widthRectangle = Double.parseDouble(args[0]);
        double heightRectangle = Double.parseDouble(args[1]);

        double areaRectangle = widthRectangle * heightRectangle;

        System.out.printf("\nThe area of the rectangle with a %.2f cm width and a %.2f cm height is %.2f sqcm.\n",
                widthRectangle, heightRectangle, areaRectangle);
    }

}
