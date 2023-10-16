import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ConectorAPI {

    public static void main(String[] args) {
        try {
            String apiKey = "TU_API_KEY";
            String url = "URL_DE_LA_API"; // Reemplaza con la URL de la API que estés utilizando

            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Authorization", "Bearer " + apiKey);

            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Procesa la respuesta JSON para obtener las tasas de cambio
                String jsonResponse = response.toString();
                // Realiza las conversiones en tiempo real
            } else {
                System.out.println("Error en la solicitud HTTP: " + responseCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
