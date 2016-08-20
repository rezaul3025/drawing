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
public class Line extends Shape{

    private int x1;
    
    private int y1;
    
    private int x2;
    
    private int y2;
    
    public Line(){
        
    }
    
    public Line(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    /**
     *
     * @param canvas
     * @return
     */
    @Override
    public Canvas draw(Canvas canvas) {
        
        String canvusLine = canvas.getContainer();
        if(y1 == y2){
            for(int l=x1;l<=x2;l++){
                String xy = "("+l+","+y1+")";
                //sb.deleteCharAt(sb.indexOf(xy));
                //sb.insert(sb.indexOf(xy), "X");
                canvusLine = canvusLine.replace(xy, "X");
            }
            /*String lineHCanvus = canvus;
            for(int lh = 0;lh<=h;lh++){
                for(int lw=0;lw<=w;lw++){
                    String lhlw = "("+lw+","+lh+")";
                    lineHCanvus = lineHCanvus.replace(lhlw, " ");
                }
            }
            
            System.out.println(lineHCanvus);*/
        }
        
        
        
        
        if(x1 == x2){
            for(int l=y1;l<=y2;l++){
                String xy = "("+y1+","+l+")";
                //sb.deleteCharAt(sb.indexOf(xy));
                //sb.insert(sb.indexOf(xy), "X");
                canvusLine = canvusLine.replace(xy, "X");
            }
            
            /*String lineVCanvus= canvus;
            
            for(int lh = 0;lh<=h;lh++){
                for(int lw=0;lw<=w;lw++){
                    String lhlw = "("+lw+","+lh+")";
                    lineVCanvus = lineVCanvus.replace(lhlw, " ");
                }
            }
            
            System.out.println(lineVCanvus);*/
        }
        
        canvas.setContainer(canvusLine);
        
        return canvas;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
}
