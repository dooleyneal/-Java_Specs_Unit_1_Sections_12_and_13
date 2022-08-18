public class Prices {
    public static void main(String[] args) {
        //Task 1 - Create a 2D array that can store 3 rows and 5 columns of double values.
        //double[][] values = new double[3][5];

        // Task 2 - Populate your 2D array with values from the table (see article)
        double[][] values = {
                {12.99, 8.99, 9.99, 10.49, 11.99},
                {0.99, 1.99, 2.49, 1.49, 2.99},
                {8.99, 7.99, 9.49, 9.99, 10.99}
        };

        // Task 3 - Print the prices for each department. See the article for the expected output.
        System.out.println("Baking: " + values[0][0] + " " + values[0][1] + " " + values[0][2] + " " + values[0][3] + " " + values[0][4] + " " );
        System.out.println("Beverage: " + values[1][0] + " " + values[1][1] + " " + values[1][2] + " " + values[1][3] + " " + values[1][4] + " " );
        System.out.println("Cereal: " + values[2][0] + " " + values[2][1] + " " + values[2][2] + " " + values[2][3] + " " + values[2][4] + " " );
    }
}