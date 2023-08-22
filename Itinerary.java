package edu.ucalgary.oop;

// Name: Maheen Raza
// UCID: 30137445
public class Itinerary {
    private Trip[] trips = new Trip[20];

    // Returns a string in the format of:
    // value (key)
    public static String fmtString(String key, String value) {
        return value + " (" + key + ")";

    }

    // Constructor
    public Itinerary(String[][] myTrips) {
        for (int i = 0; i < myTrips.length; i++) {
            trips[i] = new Trip(myTrips[i]);
        }

    }

    public int numInstances() {
        int counter = 0;
        int i = 0;
        while (trips[i] != null) {
            counter++;
            i++;
        }
        return counter;
    }

    // Getter
    public Trip[] getTrips() {
        return this.trips;

    }

    public String formatByArrival() {
        String format = "";
        int[][] doubleArray = formatArray();
        int num = numInstances();

        for (int i = 0; i < 3; i++) {
            int yearCounter = 0;
            for (int j = 0; j < 12; j++) {
                int monthCounter = 0;
                for (int k = 0; k < num; k++) {
                    if (doubleArray[k][0] == i && doubleArray[k][1] == j) {
                        if (yearCounter == 0) {
                            String year = Integer.toString(doubleArray[k][0] + 2021);
                            String yearHeader = year + " (Year)\n";
                            format = format.concat(yearHeader);
                            yearCounter++;
                        }
                        if (monthCounter == 0) {
                            String month = Integer.toString(doubleArray[k][1] + 1);
                            String monthHeader = "--" + month + " (Month)\n";
                            format = format.concat(monthHeader);
                            monthCounter++;
                        }

                        String location = "----" + trips[k].getCity() + " (City), " + trips[k].getCountry() + " (Country) (Place)\n";
                        format = format.concat(location);

                    }
                }
            }
        }

        return (format.trim());
    }

    // The first array holds years (2021-2023).
    // The second array holds months.
    // The third array holds formatted locations occurring in the year/month
    String[][][] byDate() {

        int[][] array = formatArray();
        int num = numInstances();

        String nested[][][] = new String[3][12][num];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 12; j++) {
                int counter = 0;
                for (int k = 0; k != num; k++) {
                    if (array[k][0] == i && array[k][1] == j) {
                        nested[i][j][counter] = trips[k].getCity() + " (City), " + trips[k].getCountry() + " (Country)";
                        counter++;
                    }
                    else {
                        nested[i][j][k] = "null";
                    }
                }

            }
        }

        return nested;

    }

    int [][] formatArray() {
        int num = numInstances();
        int array[][] = new int[num][2];

        for (int i = 0; i < num; i ++) {
            String arrival = trips[i].getArrival();

            int month = Trip.getMonth(arrival) - 1;
            int year = Trip.getYear(arrival) - 2021;

            array[i][0] = year;
            array[i][1] = month;
        }

        return array;

    }


}
