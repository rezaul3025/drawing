/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drawing;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author rkarim
 */
public class Drawing {

    public static void main(String[] arg) {
        /*int prex1 = 3, prey1 = 6, prex2 = 3, prey2 = 10;
        int x1 = 3, y1 = 6, x2 = 10, y2 = 6;
        int h = 20, w = 40;
        Canvas canvas = new Canvas(h, w);
        canvas = canvas.create();

        System.out.println(canvas);

        Line lineV = new Line(prex1, prey1, prex2, prey2, canvas);

        lineV.draw();

        System.out.println(lineV);

        Line lineH = new Line(x1, y1, x2, y2, canvas);

        lineH.draw();

        System.out.println(lineH);

        if (prex1 == x1 && prey1 == y1) {
            lineH.fillRectangleCreatedByLines(x1, y1, x2, prey2);
        }

        Rectangle rectangle = new Rectangle(14, 3, 30, 6, canvas);

        rectangle.draw();

        System.out.println(rectangle);

        System.out.println(canvas.fill(3, 5, "o"));*/

        Scanner inputScanner = new Scanner(System.in);
        
        do {
            System.out.print("enter command:");
            String inputLine = inputScanner.nextLine();
            Canvas canvas = null;

            if (inputLine != null && !inputLine.isEmpty()) {
                String[] commandArr = inputLine.split(" ");
                char commandPrefix = commandArr[0].charAt(0);
                switch (commandPrefix) {
                    case 'C':
                        if (commandArr.length == 3) {
                            if (isInt(commandArr[1]) && isInt(commandArr[2])) {
                                int h = Integer.parseInt(commandArr[1]);
                                int w = Integer.parseInt(commandArr[2]);
                                canvas = new Canvas(h, w);
                                canvas = canvas.create();
                                System.out.println(canvas);
                            } else {
                                System.out.println("Invalid command, canvas h,w must integer");
                            }
                        } else {
                            System.out.println("Invalid command");
                        }
                        break;
                    case 'Q':
                        System.exit(0);
                    default:
                        System.out.println("Invalid command");
                        System.exit(0);
                }
            }

        } while (true);

    }

    private static boolean isInt(String value) {
        String numberOnlyRegex = "\\d+";
        Pattern p = Pattern.compile(numberOnlyRegex);
        Matcher m = p.matcher(value);
        return m.matches();
    }
}
