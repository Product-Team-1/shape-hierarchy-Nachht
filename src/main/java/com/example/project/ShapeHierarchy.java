package com.example.project;

public class ShapeHierarchy {
    public static void main(String[] args) {

        // Todas las clases implementan la interfaz Shape, entonces un arreglo de Shape puede almacenar
        // cualquiera de las mismas:
        Shape[] shapes = {
                new Circle(5),
                new Rectangle(4, 6),
                new Triangle(8, 3),
                new Circle(-2),
                new Rectangle(10, 2),
                new Triangle(5, 4),
                new Circle(0),
                new Circle(-2),
                new Rectangle(0, 5),
                new Triangle(-3,8)
        };

        //Shape es el tipo de dato de cada elemento en el arreglo
        //figura es variable temporal, en cada vuelta del ciclo for, va tomando un elemento diferente de cada arreglo
        // los ":" dice que recorra todos los elementos de, en este caso del arreglo shapes

        for (Shape figura : shapes) {
            System.out.println("El area es: " + figura.getArea());
        }
    }
}
