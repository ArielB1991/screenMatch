package com.screenmatch.model;

public class Pelicula extends Titulo implements Clasificable{
    private String  director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificafle() {
        return (int) (calcularMedia() / 2);
    }
}

