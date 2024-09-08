package de.example.films.entity;

public class Films {
    private String title;
    private String genre;



    public Films(String genre, String title) {
        this.genre = genre;

        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
}
