package com.example.project;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {

        this.radius = radius;
    }

    @Override
    public double getArea() {

        // si radius(radio) es 0, retorna 0 ya que no tendria un area.
        if (radius <= 0){
            return 0;
        }

        // Math.PI es el valor de PI(π) aproximadamente, entonces se multiplica PI por el radio dos veces
        // es decir PI por el radio elevado al cuadrado. por ejemplo si el radio es de 3:
        // Java calcula 3.14159 * 3 * 3, primer multiplica 3 * 3 = 9 y despues multiplica 3.14159 * 9.
        // Con esto se obtiene el area del circulo
        return Math.PI * radius * radius;
    }
}
