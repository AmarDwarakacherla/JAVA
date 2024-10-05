package com.Amar;

public class Movie {
    String movieName;
    String company;
    String genere;
    int budget;

    public Movie(String movieName, String company, String genere, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genere = genere;
        this.budget = budget;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    @Override
    public String toString(){
      return "Movie{MovieName: "+movieName+" Company: "+ company + " genere: "+genere+ " Budget: "+budget+"}\n";
    }
}
