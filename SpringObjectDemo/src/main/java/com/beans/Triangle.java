package com.beans;

public class Triangle {
private Point pointA;
private Point pointB;
private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }
    public  void display(){
        System.out.println("************Triangle************");
        System.out.println("PointA X="+pointA.getX()+" an the y ="+pointA.getY());
        System.out.println("PointB X="+pointB.getX()+" an the y ="+pointB.getY());
        System.out.println("PointC X="+pointC.getX()+" an the y ="+pointC.getY());
    }
}
