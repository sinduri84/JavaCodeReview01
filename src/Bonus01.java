public class Bonus01 {

    //Method to take Test Data from the 2D array rectangleTestData and display the results of the area;
    static void calculateRectAreaTestData(double[][] rectangleTestData) {
        for (int i = 0; i < rectangleTestData.length; i++) {
            //The displayArea (and calculateRectArea) methods are used from the RectangularArea class.
            RectangularArea.displayArea(rectangleTestData[i][0], rectangleTestData[i][1]);
        }
    }

    public static void main(String[] args) {

        //The test data is saved in a 2D array.
        double[][] rectangleTestData = {
                {20, 30},
                {40, 50},
                {10.5, 22.18},
                {39.2, 90.6},
                {81.4, 76.9},
                {21.344, 22.899}};

        calculateRectAreaTestData(rectangleTestData);

    }

}
