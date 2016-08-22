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
public class TestCanvas {
    @Test(expected=IllegalArgumentException.class)
    public void testCanvasHeight(){
        Canvas canvas = new Canvas(0,30);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testCanvasWidth(){
        Canvas canvas = new Canvas(10,-1);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void testCanvasCreate(){
        Canvas canvas = new Canvas(-1,-1);
        canvas.create();
    }
    
    @Test
    public void isCanvasCreated(){
        Canvas canvas = new Canvas(10,20);
        canvas.create();
        Assert.assertTrue(canvas.getContainer().length() > 0);
    }
    
    @Test
    public void testCanvasFill(){
        Canvas canvas = new Canvas(10,20);
        canvas.create();
        String canvasFill = canvas.fill(10, 10, "o");
        Assert.assertTrue(canvasFill.contains("o"));
    }
}
