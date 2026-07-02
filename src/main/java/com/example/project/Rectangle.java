package com.example.project;

public class Rectangle implements Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {

        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {

        // si width(ancho) o height(alto) es 0, retorna 0 ya que no tendria un area.
        if (width <= 0 || height <= 0){
            return 0;
        }

        // se multiplica width por height, en español ancho por alto y  se obtiene el area del rectangulo
        return width * height;
    }
}
