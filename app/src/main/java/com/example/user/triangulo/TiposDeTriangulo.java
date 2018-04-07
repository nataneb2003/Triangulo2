package com.example.user.triangulo;

/**
 * Created by User on 24/03/2018.
 */

public enum TiposDeTriangulo {
    ISOSCELES(1),EQUILATERO(2),ESCALENO(3),OBTUSO(4),RETANGULO(5) ;


    public int tipo;

    TiposDeTriangulo(int a){
        tipo = a;
    }
    public String getName(){
        switch (tipo){

            case 1:
                return "Isósceles";
            case 2:
                return "Equilatero";
            case 3:
                return "Escaleno";
            case 4:
                return "Obtuso";
            case 5:
                return "Retangulo";
            default:
                return null;

        }
    }
}
