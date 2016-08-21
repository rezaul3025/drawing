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
        int prex1 = 3, prey1=6, prex2=3,prey2=10;
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
        
        if(prex1==x1 && prey1==y1){
            lineH.fillRectangleCreatedByLines(x1,y1,x2,prey2);
        }

        Rectangle rectangle = new Rectangle(14, 3, 30, 6, canvas);

        rectangle.draw();

        System.out.println(rectangle);
        
        System.out.println(canvas.fill(3,5,"o"));

    }
}
