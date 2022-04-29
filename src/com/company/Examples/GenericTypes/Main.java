package com.company.Examples.GenericTypes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//        list.add("linijka a");
//        list.add("linijka 2");
//        String s = list.get(1);
//        System.out.println(s.toUpperCase());

//        List list = new ArrayList();
//        list.add("Kitek");
//        list.add(123);
//        for (int i = 0; i < list.size(); i++){
//            String s = (String) list.get(i);    // nawet podczas rzutowania wyskoczy błąd innego typu
//            System.out.println(s);
//        }

//        Wrapper<Integer> wrapper = new Wrapper<>();
//        wrapper.add(123);       // gdy przypisujemy Integera to nie da się dodać np Stringa i odwrotnie
//        wrapper.add(456);
//        wrapper.displayAll();

//        Pair<Double, String> estimateValuePair = estimateBMI(78, 178);
//        System.out.println(estimateValuePair.getValue1());
//        System.out.println(estimateValuePair.getValue2());      // metoda oblicza BMI, ale para zwraca Double i Stringa z tego co zapisane w metodzie



        ShapeBox<Triangle> triangleBox = new ShapeBox<>();
        triangleBox.add(new Triangle(5, 2));
        triangleBox.add(new Triangle(4, 5));
        System.out.println(triangleBox.getTotalArea());     // jakby pudełko z sumą pól danych figur

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle(10, 15));
        shapes.add(new Triangle(5, 2));
        System.out.println(getTotalArea(shapes));       //inaczej rozpisane kształty tegp co akapit wyżej

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(new Rectangle(10, 5));
        rectangles.add(new Rectangle(20, 10));
        System.out.println(getTotalArea(rectangles));

    }


    public static double getTotalArea(List<? extends Shape> shapes) {
        return shapes.stream().mapToDouble(shape -> shape.getArea()).sum();
    }


//        private static Pair<Double, String> estimateBMI(int weight, int height){
//            double BMI = weight / Math.pow((double) height / 100, 2);
//            String s = BMI < 24.9 && BMI > 18.5
//                    ? "BMI optymalne"
//                    : "BMI nieoptymalne";
//            return new Pair<>(BMI, s);
//        }

}
