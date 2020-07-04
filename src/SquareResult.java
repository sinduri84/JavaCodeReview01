public class SquareResult {

    /*    Method to calculate the area and perimeter of a square using width as a parameter.
     The return value is an array of integers;
     */
    public static int[] calculateSquareAreaPerimeter(int widthSquare) {
        int areaSquare = (int) Math.pow(widthSquare, 2);
        int perimeterSquare = 4 * widthSquare;
        int[] squareValues = {areaSquare, perimeterSquare};
        return squareValues;
    }

    //Method to display the results of the area and perimeter of a square using width as a parameter;
    static void displaySquareResult(int widthSquare) {
        System.out.println("With a width of " + widthSquare + " cm: \n" +
                "\tThe area of the square is " + calculateSquareAreaPerimeter(widthSquare)[0] + " sqcm.\n" +
                "\tThe perimeter of the square is " + calculateSquareAreaPerimeter(widthSquare)[1] + " cm.\n");
    }

    public static void main(String[] args) {

        System.out.println("\nArea and Perimeter of a square!\n");

        //Method calls for different test data;
        displaySquareResult(15);
        displaySquareResult(89);
        displaySquareResult(20);
        displaySquareResult(37);

    }

}
