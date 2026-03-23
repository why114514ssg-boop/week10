package com.example.week10;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private TextView errorText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        errorText = findViewById(R.id.tv_error);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        loadMovies();
    }

    private void loadMovies() {
        List<Movie> movies = JsonUtility.loadMoviesFromJson(this);
        if (movies == null || movies.isEmpty()) {
            errorText.setVisibility(View.VISIBLE);
            recyclerView.setVisibility(View.GONE);
        } else {
            errorText.setVisibility(View.GONE);
            recyclerView.setVisibility(View.VISIBLE);
            recyclerView.setAdapter(new MovieAdapter(this, movies));
        }
    }
}
