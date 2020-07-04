public class RectangularArea {

    //Method to calculate the area of a rectangle using width and height as parameters;
    public static double calculateRectArea (double widthRectangle, double heightRectangle) {
        double areaRectangle = widthRectangle * heightRectangle;
        return areaRectangle;
    }

    //Method to display the results of the area using width and height as parameters;
    public static void displayArea (double widthRectangle, double heightRectangle) {
        System.out.printf("\nThe area of the rectangle with a %.2f cm width and a %.2f cm height is %.2f sqcm.",
                widthRectangle, heightRectangle, calculateRectArea(widthRectangle, heightRectangle));
    }

    public static void main(String[] args) {

        //Method calls for different test data;
        displayArea(20, 30);
        displayArea(40, 50);
        displayArea(19,39.5);
        displayArea(18.5, 14.3);


    }

}
