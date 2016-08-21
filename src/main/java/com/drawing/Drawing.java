/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drawing;

/**
 *
 * @author rkarim
 */
public class Drawing {

    public static void main(String[] arg) {
        StringBuffer sb = new StringBuffer();
        int x1 = 3, y1 = 3, x2 = 3, y2 = 10;
        int h = 20, w = 40;
        Canvas canvas = new Canvas(h, w);
        canvas = canvas.create();

        System.out.println(canvas);

        Line lineV = new Line(x1, y1, x2, y2, canvas);

        lineV.draw();

        System.out.println(lineV);

        Line lineH = new Line(3, 10, 10, 10, canvas);

        lineH.draw();

        System.out.println(lineH);

        Rectangle rectangle = new Rectangle(14, 3, 30, 6, canvas);

        rectangle.draw();

        System.out.println(rectangle);
        
        System.out.println(canvas.fill(3,5,"o"));

    }
}
