package com.beans;

public class Circle {
    private float radius;
    private Point centre;

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }
    public  void display(){
        System.out.println("**********Circle*************");
        System.out.println("the radius is"+radius);
        System.out.println("the centre is x="+centre.getX()+" y ="+centre.getY());
    }
}
