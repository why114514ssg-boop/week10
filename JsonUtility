package com.example.week10;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class JsonUtility {
    public static List<Movie> loadMoviesFromJson(Context context) {
        List<Movie> movieList = new ArrayList<>();
        try {
            InputStream inputStream = context.getAssets().open("movie_data.json");
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            inputStream.close();
            String json = new String(buffer, StandardCharsets.UTF_8);

            JSONArray array = new JSONArray(json);
            for (int i = 0; i < array.length(); i++) {
                JSONObject obj = array.getJSONObject(i);
                String title = obj.optString("title");
                String year = obj.optString("year");
                String genre = obj.optString("genre");
                int poster = obj.optInt("poster", 0);
                movieList.add(new Movie(title, year, genre, poster));
            }
        } catch (Exception e) {
            return null;
        }
        return movieList;
    }
}
