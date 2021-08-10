package data;

public class Movie {
    private int id;
    private String title;
    private int year;
    private String director;
    private String actors;
    private int rating;
    private String poster;
    private String genre;
    private String plot;

    public Movie() {
    }

    public Movie(int id, String title, int rating, int year, String poster,  String genre, String actors, String director, String plot ) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.year = year;
        this.poster = poster;
        this.genre = genre;
        this.actors = actors;
        this.director = director;
        this.plot = plot;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }
}
