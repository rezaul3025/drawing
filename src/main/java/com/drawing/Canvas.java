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
        this.h = h;
        this.w = w;
    }

    public Canvas create() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        StringBuffer canvasContainer = new StringBuffer();

        for (int i = 0; i <= h; i++) {
            for (int j = 0; j <= w; j++) {
                if (i == 0) {
                    canvasContainer.append("*");
                    if (j == w) {
                        //sb.append("*");
                        canvasContainer.append("\n");
                    }
                } else if (i > 0 && i < h - 1) {
                    if (j == 0) {
                        canvasContainer.append("*");
                    } else if (j == w) {
                        canvasContainer.append("*");
                        canvasContainer.append("\n");
                    } else {
                        canvasContainer.append("(" + j + "," + i + ")");
                    }

                } else if (i == h) {
                    canvasContainer.append("*");
                    if (j == w) {
                        canvasContainer.append("\n");
                    }
                }
            }
        }

        this.setContainer(canvasContainer.toString());

        return this;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
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
        String canvusDisplay = this.container;
        for (int x = 0; x <= h; x++) {
            for (int y = 0; y <= w; y++) {
                String xy = "(" + y + "," + x + ")";
                canvusDisplay = canvusDisplay.replace(xy, " ");
            }
        }
        return canvusDisplay;
    }

}
