import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.apache.http.client.utils.URIBuilder;

public class Main {
    public static void main(String[] args) {
        try {
            // Adresse de l'API GitLab
            String gitlabApiUrl = "https://gitlab.com/api/v4/projects/";
            Scanner scanner= new Scanner(System.in);
            System.out.println("Identifiant du projet?");
            String projectId = scanner.nextLine();

            // Construction de l'URL
            URIBuilder uriBuilder = new URIBuilder(gitlabApiUrl + projectId);

            URL url = uriBuilder.build().toURL();

            // Ouverture de la connexion HTTP
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Lecture de la réponse
            int responseCode = connection.getResponseCode();

            if (responseCode == 200) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                reader.close();

                // La réponse contient des informations sur le projet, y compris la description.
                System.out.println("Réponse de l'API GitLab : " + response.toString());
            } else {
                System.out.println("Échec de la requête. Code de réponse : " + responseCode);
            }

            // Fermeture de la connexion
            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
