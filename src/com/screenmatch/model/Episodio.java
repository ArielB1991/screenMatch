package com.screenmatch.model;

public class Episodio implements Clasificable{
    private int numero;
    private String nombre;
    private Serie serie;
    private int visualizaciones;

    public int getVisualizaciones() {
        return visualizaciones;
    }

    public void setVisualizaciones(int visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificafle() {
        if(visualizaciones > 100){
            return 4;
        }else{
            return 2;
        }
    }
}
