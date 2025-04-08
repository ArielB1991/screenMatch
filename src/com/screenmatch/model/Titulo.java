package com.screenmatch.model;

public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;

    private int duracionEnMinutos;
    private boolean incluidaEnPlan;

    private double sumaDeEvaluaciones;

    private int totalEvaluaciones;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidaEnPlan(boolean incluidaEnPlan) {
        this.incluidaEnPlan = incluidaEnPlan;
    }

    public int getTotalEvaluaciones(){
        return totalEvaluaciones;
    }

    double getSumaDeEvaluaciones(){
        return  sumaDeEvaluaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento(int i) {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidaEnPlan() {
        return incluidaEnPlan;
    }

    public void muestraFichaTecnica(){
        System.out.println("Mi pelicula es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("La duracion es: " +getDuracionEnMinutos());
    }

    public void evalua(double nota){
        sumaDeEvaluaciones += nota;
        totalEvaluaciones++;
    }

    public double calcularMedia(){
        return  sumaDeEvaluaciones / totalEvaluaciones;
    }

}
