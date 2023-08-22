package edu.ucalgary.oop;

// Name: Maheen Raza
// UCID: 30137445
public class Trip {
    private String arrival;
    private String departure;
    private String city;
    private String country;

    // Returns a string in the format of:
    // value (key)
    public static String fmtString(String key, String value) {
        return value + " (" + key + ")";
    }

    // Constructor
    public Trip(String[] array) {
        if (array.length >= 1) {
            this.arrival = array[0];
        }

        if (array.length >= 2) {
            this.departure = array[1];
        }

        if (array.length >= 3) {
            this.city = array[2];
        }

        if (array.length >= 4) {
            this.country = array[3];
        }

    }

    // Given a date string, return just the year
    public static int getYear(String date) {
        return Integer.parseInt(date.substring(0, 4));

    }

    // Given a date string, return just the month
    // Since it is an int, a date like "2022-01-12" returns 1
    public static int getMonth(String date) {
        return Integer.parseInt(date.substring(5, 7));
    }

    // Return a formatted string of key/value pairs, with commas
    // between each. See the output for an example.
    public String formatTrip() {
        String arrival = this.arrival;
        String departure = this.departure;
        String city = this.city;
        String country = this.country;

        return arrival + " (Arrival), " + departure + " (Departure), " + city + " (City), " + country + " (Country)";

        //return (fmtString("Arrival", arrival) + "," + fmtString("Departure", departure) + "," + fmtString("City", city) + "," + fmtString("Country", country));
    }

    // Getter
    public String getArrival() {
        return this.arrival;

    }

    // Getter
    public String getDeparture() {
        return this.departure;
    }

    // Getter
    public String getCity() {
        return this.city;
    }

    // Getter
    public String getCountry() {
        return this.country;
    }

    // Setter
    public void setArrival(String date) {
        this.arrival = date;
    }

    // Setter
    public void setDeparture(String date) {
        this.departure = date;
    }

    // Setter 
    public void setCity(String city) {
        this.city = city;
    }

    // Setter 
    public void setCountry(String country) {
        this.country = country;
    }

}
