package com.assigenement.day_3.line_comparision;

import java.util.Objects;

public class LineProgram {
    public static void main(String[] args) {
        double x1 = 1;
        double y1 = 1;

        // co-ordinates of point 2
        double x2 = 2;
        double y2 = 2;

        // co-ordinates of point 3
        double x3 = 3;
        double y3 = 3;

        // co-ordinates of point 4
        double x4 = 4;
        double y4 = 4;

        double length1 = Math.sqrt((Math.pow((x2-x1), 2)) + Math.pow((y2-y1), 2)); // FORMULA : Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)
        double length2 = Math.sqrt((Math.pow((x4-x3), 2)) + Math.pow((y4-y3), 2)); // FORMULA : Length of a Line = sqrt( (x2 - x1) ^ 2 + (y2- y1) ^ 2)

        System.out.println("Length of Line 1 : " + length1);
        System.out.println("Length of Line 2 : " + length2);
        boolean result = Objects.equals(length1, length2); // comparing using equals method
        System.out.println("BOTH LINES ARE EQUAL ? " +result);

    }
}
