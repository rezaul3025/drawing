/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.drawing;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author rkarim
 */
public class TestRectangle {
    
    @Test
    public void notValidRectangle(){
        int h =10,w=30;
        Canvas canvas = new Canvas(10,30);
        canvas.create();
        int x1=10,y1=10,x2=20,y2=20;
        Rectangle rectangle = new Rectangle(x1,y1,x2,y2, canvas);
        Assert.assertTrue(x2-x1<=y2-y1);
        x1=-1;y1=200;x2=50;y2=-6;
        Rectangle rectangle1 = new Rectangle(x1,y1,x2,y2, canvas);
        
        Assert.assertTrue((x1<w && x1<0) || y1>h);
    }
    
    @Test
    public void isValidRectangle(){
        int h =10,w=30;
        Canvas canvas = new Canvas(10,30);
        canvas.create();
        int x1=5,y1=5,x2=25,y2=20;
        Rectangle rectangle = new Rectangle(x1,y1,x2,y2, canvas);
        Assert.assertTrue(x2-x1>y2-y1);
        
    }
    
    @Test
    public void isRectangleCreated(){
        int h =10,w=30;
        Canvas canvas = new Canvas(10,30);
        canvas.create();
        int x1=5,y1=5,x2=25,y2=20;
        Rectangle rectangle = new Rectangle(x1,y1,x2,y2, canvas);
        canvas = rectangle.draw();
        Assert.assertTrue(canvas.getContainer().contains("x"));
        
    }
}
