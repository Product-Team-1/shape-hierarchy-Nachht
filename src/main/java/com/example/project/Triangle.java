package com.example.project;

public class Triangle implements Shape {

    private double base;
    private double height;

    public Triangle(double base, double height) {

        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {

        // si la base o height(alto) es 0, retorna 0 ya que no tendria un area.
        if (base <= 0 || height <= 0){
            return 0;
        }
        // base se multiplica por height y el resultado se divide en 2, es decir base por altura
        // el resultado se divide entre 2 y retorna el area.
        return (base * height) / 2;
    }
}
