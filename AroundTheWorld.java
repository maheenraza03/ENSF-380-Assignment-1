public class AroundTheWorld {
    public static void main(String args[]) {
        var data = exampleData();

        // Create a new Itinerary object. Order of listings is the same
        // as input data. Input data is always in order.
        var myItinerary = new Itinerary(data);

        System.out.println("** Demonstrate formatByArrival");
        System.out.println(myItinerary.formatByArrival());

        // Add a blank line before the next output - 
        // does not end with a newline character.
        System.out.println();

        // Retrieve the array of Trip objects from Itinerary
        var array = myItinerary.getTrips();

        System.out.println("** Demonstrate fmtString");
        System.out.println(array[0].fmtString("City", array[0].getCity()));
        System.out.println(Itinerary.fmtString("Key", "Value"));

        System.out.println("** Demonstrate formatTrip");
        String[] tmp = {"2023-07-10", "2023-08-11", "Vaduz", "Liechtenstein"};
        Trip aTrip = new Trip(tmp);
        System.out.println(aTrip.formatTrip());

        System.out.println("** Demonstrate getMonth");
        System.out.println(aTrip.getMonth(tmp[0]));

        System.out.println("** Demonstrate getYear");
        System.out.println(Trip.getYear(tmp[1]));

        System.out.println("** Demonstrate getters and setters");
        System.out.println();
	    array[4].setDeparture("2023-01-10");
	    array[4].setArrival("2023-01-10");
	    System.out.println("--" + array[4].getArrival() + "--");
	    System.out.println("--" + array[4].getDeparture() + "--");
	    System.out.println("--" + array[4].getCity() + "--");
	    System.out.println("--" + array[4].getCountry() + "--");

        System.out.println("** Demonstrate content of byDate");
	    var dateArray = myItinerary.byDate();
	    for (int i=0; i<dateArray.length; i++) { // i is years - 2021-2023 
		    for (int j=0; j<dateArray[i].length; j++) { // j is months, 0-11
                        // Printing every entry in the array would give 720
                        // lines. We only print the first entry in the
                        // 3rd level array as an example.
			        System.out.printf("dateArray[%d][%d][%d] = %s\n", i,j,0,
			dateArray[i][j][0]);
		    }
	    }

    }

    // Each line is: arrival date, departure date, city, country/territory
    public static String[][] exampleData() {
        String[][] example = { 
            { "2021-12-15", "2021-12-31", "Nuuk", "Greenland" },
            { "2021-12-31", "2023-01-05", "Longyearbyen", "Svalbard" },
            { "2023-01-05", "2023-01-08", "Helsinki", "Finland" },
            { "2023-01-08", "2023-01-12", "Casablanca", "Morocco" },
            { "2023-01-12", "2023-01-15", "Istanbul", "Turkey" },
            { "2023-01-15", "2023-01-17", "Yerevan", "Armenia" },
            { "2023-01-17", "2023-01-18", "Tblisi", "Georgia" },
            { "2023-01-19", "2023-01-20", "Coimbatore", "India" }, 
            { "2023-01-20", "2023-01-27", "Ooty", "India" },
            { "2023-01-27", "2023-01-30", "Hyderabad", "India" },
            { "2023-01-31", "2023-02-05", "Seoul", "South Korea" },
            { "2023-02-05", "2023-02-07", "Jeju", "South Korea" },
            { "2023-02-07", "2023-02-08", "Seoul", "South Korea" },
            { "2023-02-08", "2023-02-08", "Tokyo", "Japan" }, 
            { "2023-02-08", "2023-02-15", "Osaka", "Japan" } 
        };
        return example;
    }
}
