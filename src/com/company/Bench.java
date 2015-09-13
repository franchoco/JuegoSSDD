package com.company;

import java.awt.*;
import java.util.Random;

/**
 * Created by sebablasko on 9/11/15.
 */
public class Bench {

    int posX, posY;
    int w = 20, h = 10, maxW = 200, maxH = 20;
    double speed;
    Random random = new Random();

    public Bench(int maxX, int maxY, boolean isFloor){
        this.posX = 0;
        this.posY = 30;
        this.speed = 0.2;
        this.w = maxX;
        this.h = 20;
    }

    public Bench(int maxX, int maxY){
        this.posX = random.nextInt(maxX);
        this.posY = 0;
        this.speed = random.nextDouble();
        this.w += random.nextInt(this.maxW);
        this.h += random.nextInt(this.maxH);
    }

    public void draw(Graphics g){
        g.fillRect(this.posX, this.posY, this.w, this.h);
    }

    public int top() {
        return (int) (this.posY + this.h * 0.5);
    }

    public int left() {
        return (int) (this.posX - this.w * 0.5);
    }

    public int bottom() {
        return (int) (this.posY - this.h * 0.5);
    }

    public int right() {
        return (int) (this.posX + this.w * 0.5);
    }
}
