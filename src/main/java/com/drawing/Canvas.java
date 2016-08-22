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
public class Canvas {

    
    private int h;

    private int w;

    private String container;

    public Canvas() {

    }

    public Canvas(int h, int w) {
        this.setH(h);
        this.setW(w);
    }

    public Canvas create() {

        if (h > 1 && w > 1) {
            
            StringBuffer canvasContainer = new StringBuffer();

            for (int i = 0; i <= h; i++) {
                for (int j = 0; j <= w; j++) {
                    if (i == 0) {
                        canvasContainer.append("-");
                        if (j == w) {
                            canvasContainer.append("\n");
                        }
                    } else if (i > 0 && i < h - 1) {
                        if (j == 0) {
                            canvasContainer.append("|");
                        } else if (j == w) {
                            canvasContainer.append("|");
                            canvasContainer.append("\n");
                        } else {
                            canvasContainer.append("(" + j + "," + i + ")");
                        }

                    } else if (i == h) {
                        canvasContainer.append("-");
                        if (j == w) {
                            canvasContainer.append("\n");
                        }
                    }
                }
            }

            this.setContainer(canvasContainer.toString());
        }
        else{
            throw new IllegalArgumentException("Cannot create canvas with heigth:"+h+" and width:"+w);
        }
        
        return this;
    }

    public String fill(int x, int y, String color) {
        String canvasFill = this.container;

        for (int i = 0; i <= h; i++) {
            for (int j = 0; j <= w; j++) {
                String xy = "(" + j + "," + i + ")";
                canvasFill = canvasFill.replace(xy, color);
            }
        }

        return canvasFill;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        if (h < 1) {
            throw new IllegalArgumentException("Not a valid height of canvas");
        }
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        if (w < 1) {
            throw new IllegalArgumentException("Not a valid width of canvas");
        }

        this.w = w;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    @Override
    public String toString() {
        String canvasDisplay = this.container;
        for (int x = 0; x <= h; x++) {
            for (int y = 0; y <= w; y++) {
                String xy = "(" + y + "," + x + ")";
                canvasDisplay = canvasDisplay.replace(xy, " ");
            }
        }
        return canvasDisplay;
    }

}
