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
public class Rectangle extends Shape {

    private int x1;

    private int y1;

    private int x2;

    private int y2;

    private Canvas canvas;

    public Rectangle() {

    }

    public Rectangle(int x1, int y1, int x2, int y2, Canvas canvas) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.canvas = canvas;
    }

    @Override
    public Canvas draw() {
        String canvusRectangle = canvas.getContainer();
        //System.out.println(canvusRectangle);
        for(int i= x1;i<=x2;i++){
            canvusRectangle = canvusRectangle.replace("(" + i + "," + y1 + ")", "x");
        }
        
        for(int i= x1;i<=x2;i++){
            canvusRectangle = canvusRectangle.replace("(" + i + "," + y2 + ")", "x");
        }
        
        for(int j= y1;j<=y2;j++){
            canvusRectangle = canvusRectangle.replace("(" + x1 + "," + j + ")", "x");
        }
        
        for(int j= y1;j<=y2;j++){
            canvusRectangle = canvusRectangle.replace("(" + x2 + "," + j + ")", "x");
        }
        /*for(int i= y1;i<=x2;i++){
            canvusRectangle = canvusRectangle.replace("(" + y2 + "," + i + ")", "x");
        }
        /*for (int i = y1; i <= y2; i++) {
            for (int j = x1; j <= x2; j++) {
                if (i == y1) {
                    canvusRectangle = canvusRectangle.replace("(" + i + "," + j + ")", "x");
                    if (j == x2 - x1) {
                       
                        canvusRectangle = canvusRectangle.replace("(" + i + "," + j + ")", "\n");
                    }
                } else if (i > y1 && i < y2 - y1 - 1) {
                    if (j == x1) {
                        String xy = "(" + j + "," + i + ")";
                        canvusRectangle = canvusRectangle.replace(xy, "x");
                    } else if (j == x2 - x1) {
                        String xy = "(" + j + "," + i + ")";
                        canvusRectangle = canvusRectangle.replace(xy, "x");
                        canvusRectangle = canvusRectangle.replace("(" + j+1 + "," + i+1 + ")", "\n");
                    } else {
                        String xy = "(" + j + "," + i + ")";
                        canvusRectangle = canvusRectangle.replace(xy, "");
                    }

                } else if (i == y2 - y1) {
                    String xy = "(" + i + "," + j + ")";
                    canvusRectangle = canvusRectangle.replace(xy, "x");
                    if (j == x2 - x1) {
                        canvusRectangle = canvusRectangle.replace("(" + i + "," + j + ")", "\n");
                    }
                }
            }
        }*/

        canvas.setContainer(canvusRectangle);

        return canvas;
    }

    @Override
    public String toString() {
        String lineDisplay = this.canvas.getContainer();

        for (int lh = 0; lh <= this.canvas.getH(); lh++) {
            for (int lw = 0; lw <= this.canvas.getW(); lw++) {
                String lhlw = "(" + lw + "," + lh + ")";
                lineDisplay = lineDisplay.replace(lhlw, " ");
            }
        }

        return lineDisplay;
    }

}
