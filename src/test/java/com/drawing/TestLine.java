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
public class TestLine {
    
    @Test
    public void isNotValidLine(){
        int h =10,w=30;
        Canvas canvas = new Canvas(10,30);
        canvas.create();
        int x1=10,y1=2,x2=23,y2=29;
        Line line = new Line(10,2,23,29, canvas);
        Assert.assertTrue(x1!=x2 || y1!=y2);
        x1=40;y1=40;x2=50;y2=60;
        Assert.assertTrue(x1>w && y1>h);
    }
    
    @Test
    public void isValidLine(){
        int h =10,w=30;
        Canvas canvas = new Canvas(10,30);
        canvas.create();
        int x1=10,y1=2,x2=23,y2=2;
        Line line = new Line(10,2,23,29, canvas);
        Assert.assertTrue(x1!=x2 || y1!=y2);
        Assert.assertTrue(x1<w && y1<h && x2<w && y2<h);
    }
    
    @Test
    public void isLineCreated(){
        int h =10,w=30;
        Canvas canvas = new Canvas(10,30);
        canvas.create();
        int x1=10,y1=2,x2=23,y2=2;
        Line line = new Line(x1,y1,x2,y2, canvas);
        canvas = line.draw();
        Assert.assertTrue(canvas.getContainer().contains("x"));
    }
}
