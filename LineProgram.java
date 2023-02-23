package com.assigenement.day_3.line_comparision;

public class LineProgram {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison  Program");

        // co-ordinates of point 1
        double x1 = 1;
        double y1 = 1;

        // co-ordinates of point 2
        double x2 = 2;
        double y2 = 2;

        double length1 = Math.sqrt((Math.pow((x2-x1), 2)) + Math.pow((y2-y1), 2));
        System.out.println("Length of Line 1 : " + length1);

    }
}
