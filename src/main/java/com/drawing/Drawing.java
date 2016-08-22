/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drawing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author rkarim
 */
public class Drawing {

    public static void main(String[] arg) {
        /* Test data
        
        int prex1 = 3, prey1 = 6, prex2 = 3, prey2 = 10;
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
        Canvas canvas = null;

        int plx1 = 0, ply1 = 0, plx2 = 0, ply2 = 0;
        int nlx1 = 0, nly1 = 0, nlx2 = 0, nly2 = 0;

        do {
            System.out.println("Enter 'Q' to exit");
            System.out.print("enter command:");
            String inputLine = inputScanner.nextLine();

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
                            System.out.println("Invalid command for canvas creation");
                        }
                        break;
                    case 'L':
                        if (commandArr.length == 5 && isInt(commandArr[1]) && isInt(commandArr[2]) && isInt(commandArr[3]) && isInt(commandArr[4])) {
                            int x1 = Integer.parseInt(commandArr[1]);
                            int y1 = Integer.parseInt(commandArr[2]);
                            int x2 = Integer.parseInt(commandArr[3]);
                            int y2 = Integer.parseInt(commandArr[4]);
                            Line line = createLine(x1, y1, x2, y2, canvas);

                            if (plx1 == 0) {
                                plx1 = x1;
                                ply1 = y1;
                                plx2 = x2;
                                ply2 = y2;
                            } else if (nlx1 == 0) {
                                nlx1 = x1;
                                nly1 = y1;
                                nlx2 = x2;
                                nly2 = y2;
                            }

                            if (plx1 != 0 && nlx1 != 0 && line != null) {
                                if (plx1 == nlx1 && ply1 == nly1) {
                                    if (ply1 == ply2) {
                                        line.fillRectangleCreatedByLines(plx1, ply1, plx2, nly2);
                                    } else {
                                        line.fillRectangleCreatedByLines(plx1, ply1, nlx2, ply2);
                                    }
                                } else if (plx2 == nlx1 && ply2 == nly1) {
                                    if (ply1 == ply2) {
                                        line.fillRectangleCreatedByLines(plx1, ply1, plx2, nly2);
                                    } else {
                                        line.fillRectangleCreatedByLines(plx1, ply1, nlx2, ply2);
                                    }
                                }
                            }

                        } else {
                            System.out.println("Invalid command for line creation");
                        }
                        break;
                    case 'R':
                        if (commandArr.length == 5 && isInt(commandArr[1]) && isInt(commandArr[2]) && isInt(commandArr[3]) && isInt(commandArr[4])) {
                            int x1 = Integer.parseInt(commandArr[1]);
                            int y1 = Integer.parseInt(commandArr[2]);
                            int x2 = Integer.parseInt(commandArr[3]);
                            int y2 = Integer.parseInt(commandArr[4]);
                            createRectangle(x1, y1, x2, y2, canvas);
                        } else {
                            System.out.println("Invalid command for rectangle creation");
                        }
                        break;
                    case 'B':
                        if (commandArr.length == 4 && isInt(commandArr[1]) && isInt(commandArr[2])) {
                            if (canvas != null) {
                                int x = Integer.parseInt(commandArr[1]);
                                int y = Integer.parseInt(commandArr[2]);
                                String color = commandArr[3];
                                String filledCanvas = canvas.fill(x, y, color);
                                System.out.println(filledCanvas);
                            } else {
                                System.out.println("Cannot fill canvas. Because, it's not created");
                            }
                        } else {
                            System.out.println("Invalid command for filling entire canvas");
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

    private static Line createLine(int x1, int y1, int x2, int y2, Canvas canvas) {
        if (canvas != null) {
            Line line = new Line(x1, y1, x2, y2, canvas);
            line.draw();
            System.out.println(line);
            return line;
        } else {
            System.out.println("Canvas not created. Please, create canvas in order to create line.");
        }

        return null;
    }

    private static void createRectangle(int x1, int y1, int x2, int y2, Canvas canvas) {
        if (canvas != null) {
            Rectangle rectangle = new Rectangle(x1, y1, x2, y2, canvas);
            rectangle.draw();
            System.out.println(rectangle);
        } else {
            System.out.println("Canvas not created. Please, create canvas in order to create rectangle.");
        }
    }

    private static boolean isInt(String value) {
        String numberOnlyRegex = "\\d+";
        Pattern p = Pattern.compile(numberOnlyRegex);
        Matcher m = p.matcher(value);
        return m.matches();
    }
}
