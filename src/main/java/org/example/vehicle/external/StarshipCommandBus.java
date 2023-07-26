package org.example.vehicle.external;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StarshipCommandBus {
    int count;
    String next;
    String previous;
    List<Results> results;

    public static List<StarshipCommandBus> fetchAllStarshipsCommand() {
        try {
            //Ca fonctionne pas la désérialisation pour une sombre raison
//            URL url = new URL("https://swapi.dev/api/starships/?format=json");
//            URLConnection conn = url.openConnection();
//            StringBuilder body = new StringBuilder();
//            BufferedReader in = new BufferedReader(
//                    new InputStreamReader(
//                            conn.getInputStream()));
//            String inputLine;
//
//            while ((inputLine = in.readLine()) != null)
//                body.append(inputLine);
//            in.close();
//            StarshipCommandBus item = new ObjectMapper().readValue(body.toString(), StarshipCommandBus.class);
//
//            System.out.println(item);

            List<Results> res = new ArrayList<>();
            res.add(new Results("CR90 corvette", "CR90 corvette", "Corellian Engineering Corporation"));

            List<StarshipCommandBus> starshipCommandBuses = new ArrayList<>();
            starshipCommandBuses.add(new StarshipCommandBus(2,
                    "https://swapi.dev/api/starships/?page=2&format=json",
                    null,
                    res
            ));
            return starshipCommandBuses;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static StarshipCommandBus fetchOneStarshipCommand() {
        try {
            List<Results> res = new ArrayList<>();
            res.add(new Results("CR90 corvette", "CR90 corvette", "Corellian Engineering Corporation"));

            return new StarshipCommandBus(2,
                    "https://swapi.dev/api/starships/?page=2&format=json",
                    null,
                    res
            );

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
