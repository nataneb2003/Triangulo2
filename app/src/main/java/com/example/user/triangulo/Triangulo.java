package com.example.user.triangulo;

/**
 * Created by User on 24/03/2018.
 */

public class Triangulo {

    private double degree;
    private double degree2;
    private double degree3;
    private double B;
    private double A;
    private double C;
    private TiposDeTriangulo tipo;
    public Triangulo(double A,double B,double degree){
        this.A = A;
        this.B = B;
        this.degree = degree;

        /////////////////////
        //Pegar a medida do C


        this.C = Math.sqrt((Math.pow(B,2)+Math.pow(A,2)-(2 * B * A * Math.cos(Math.toRadians(degree)))));


        ////////////////////
        //Pegar o cos dos angulos

        this.degree2 = Math.toDegrees(Math.cosh((Math.pow(A,2)+Math.pow(C,2)-Math.pow(B,2))/(2*A*C)));

        this.degree3 = Math.toDegrees(Math.cosh((Math.pow(B,2)+Math.pow(C,2)-Math.pow(A,2))/(2*C*B)));

        ////////////////////
        //Classificar o triangulo



    }
    public double getArea(){
        return A*B/2;
    }
    public String getTriangle(){

        return "A:" + A + " B:"+B+" C:" + C
                +"Angles: " + degree + " " +degree2 +" "+ degree3;
    }
    public double[] getAll(){
        double[] all = {A,B,C,degree,degree2,degree3};
        return all;
    }
}
