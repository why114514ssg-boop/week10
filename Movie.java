package com.example.week10;

public class Movie {
    private String title;
    private String year;
    private String genre;
    private int posterResId;

    public Movie(String title, String year, String genre, int posterResId) {
        this.title = (title == null || title.trim().isEmpty()) ? "Unknown Title" : title;
        this.year = (year == null || year.trim().isEmpty()) ? "Unknown Year" : year;
        this.genre = (genre == null || genre.trim().isEmpty()) ? "Unknown Genre" : genre;
        this.posterResId = (posterResId <= 0) ? android.R.drawable.ic_menu_gallery : posterResId;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public int getPosterResId() {
        return posterResId;
    }
}
