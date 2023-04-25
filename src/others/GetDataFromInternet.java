package others;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GetDataFromInternet {

    public static void getData(String url) {
        try {
            // Define the URL to be parsed

            // Create a connection object for the URL
            HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();

            // Set the request method
            con.setRequestMethod("GET");

            // Read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();

            // Print the response content
            System.out.println(content.toString());

            // Disconnect the connection
            con.disconnect();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
