package com.elrincon;
import clases.teacherClass;
public class clasecolor {

    public static final String PRIMER_PARAMETRO = "Primer parametro: ";
    private static String color;

    public static void main(String[] args) {
        teacherClass teacher = new teacherClass();
        color = teacher.preguntaColor();
        String mensaje = "La respuesta recibida es:";
        System.out.println(mensaje + color);

		imprimirParams(10, 5);
    }
	
    public static void imprimirParams(int iParamUno, int iParamDos){
        System.out.println(PRIMER_PARAMETRO + iParamUno);
        System.out.println("Segundo  parametro: " + iParamDos);
    }	
}
