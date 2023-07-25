package com.sk00sha.requestGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import com.google.gson.Gson;
public class RequestSender<T> {
    private final HttpURLConnection connection;
    public RequestSender(String url) throws IOException {

        this.connection = setUpConnection(url);
    }
    public void sendRequest(T myObject,String URL ){
        try {
            String jsonPayload = new Gson().toJson(myObject);

            // Send the JSON payload
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonPayload.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Read the response
            try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                System.out.println("Response code: " + connection.getResponseCode());
                System.out.println("Response body: " + response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    private HttpURLConnection setUpConnection(String myURL) throws IOException {
        URL url = new URL(myURL);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("POST");
        conn.setRequestProperty("Content-Type", "application/json");
        conn.setDoOutput(true);
        return conn;
    }






}
