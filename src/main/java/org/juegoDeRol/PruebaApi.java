package org.juegoDeRol;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class PruebaApi {
    public static void main(String[] args) {

        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("https://randomuser.me/api/");

        try {
            HttpResponse response = httpClient.execute(request);
            HttpEntity entity = response.getEntity();

            if (entity != null) {
                String responseBody = EntityUtils.toString(entity);
                JSONObject json = new JSONObject(responseBody);

                JSONArray results = json.getJSONArray("results");
                if (results.length() > 0) {
                    JSONObject user = results.getJSONObject(0);
                    JSONObject name = user.getJSONObject("name");

                    String firstName = name.getString("first");
                    String lastName = name.getString("last");

                    System.out.println("Nombre aleatorio: " + firstName + " " + lastName);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
