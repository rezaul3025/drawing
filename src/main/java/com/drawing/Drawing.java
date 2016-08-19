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
        int x1=2,y1=3,x2=14,y2=3;
        int h = 10, w = 20;
        for (int i = 0; i <=h; i++) {
            for (int j = 0; j <=w; j++) {
                if (i == 0) {
                    sb.append("*");
                    if (j == w) {
                        //sb.append("*");
                        sb.append("\n");
                    }
                } else if (i > 0 && i < h - 1) {
                    if (j == 0){
                        sb.append("*");
                    } 
                    else if(j == w){
                        sb.append("*");
                        sb.append("\n");
                    }
                    else {
                        sb.append("("+j+","+i+")");
                    }
                     
                } else if (i == h) {
                    sb.append("*");
                    if (j == w) {
                        sb.append("\n");
                    }
                }
            }
        }
        //sb.deleteCharAt(23);
        //sb.insert(23, "X");
        //sb.deleteCharAt(24);
        //sb.insert(24, "Y");
        //sb.append("\n*").append("\n*").append("\n*").append("*****").append("\n*").append("\n*").append("\n*");
        String lineCanvus= sb.toString();
        if(y1 == y2){
            for(int l=x1;l<x2;l++){
                String xy = "("+l+","+y1+")";
                //sb.deleteCharAt(sb.indexOf(xy));
                //sb.insert(sb.indexOf(xy), "X");
                lineCanvus = lineCanvus.replace(xy, "X");
            }
            for(int lh = 0;lh<=h;lh++){
                for(int lw=0;lw<=w;lw++){
                    String lhlw = "("+lw+","+lh+")";
                    lineCanvus = lineCanvus.replace(lhlw, " ");
                }
            }
        }
        System.out.println(lineCanvus);
    }
}
