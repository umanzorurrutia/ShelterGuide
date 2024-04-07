package src.backend;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) {
        // col 61 for address - shelters
        // col 60 for name - shelters
        // col 5 for intersection name - intersections
        // Path to your CSV file
        System.out.println("Current Directory: " + System.getProperty("user.dir"));
        String shelters = "shelters.csv"; // Assuming the CSV file is in the same directory

        try (BufferedReader reader = new BufferedReader(new FileReader(shelters))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] cols = line.split(",");
                // Process each line as needed
                if (cols[60].split(" ").length > 1) {
                    System.out.println("Name: " + cols[60] + ". Street: " + streetName(cols[61])); 
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String streetName(String address) {
        String street = "";
        String[] streetSplit = address.split(" ");
        for (int i = 1; i < streetSplit.length - 1; i++) {
            street += streetSplit[i] + " ";
        }
        street += streetSplit[streetSplit.length - 1];
        return street;
    }
}