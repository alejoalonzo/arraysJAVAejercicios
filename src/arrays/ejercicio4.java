package arrays;

import java.util.Scanner;

public class ejercicio4 {
      public static void main(String[] args) {
     
          Scanner in = new Scanner(System.in);
          
          float decimal, decimal2, decimal3, decimal4, decimal5;
          
          System.out.println("Ingrese un numero decimal");
          decimal = in.nextFloat();
           System.out.println("Ingrese otro numero decimal");
          decimal2 = in.nextFloat();
           System.out.println("Ingrese otro numero decimal");
          decimal3 = in.nextFloat();
           System.out.println("Ingrese otro numero decimal");
          decimal4 = in.nextFloat();
           System.out.println("Ingrese otro numero decimal");
          decimal5 = in.nextFloat();
          
          float floatArray[];
          floatArray = new float[5];
          
          floatArray[0]= decimal;
          floatArray[1]= decimal2;
          floatArray[2]= decimal3;
          floatArray[3]= decimal4;
          floatArray[4]= decimal5;
          
          /*System.out.println("Los decimales introducidos son: ");
          for(int i = 0; i < floatArray.length; i++)
             System.out.println(floatArray[i]); 
          */
          System.out.println("Los elementos introducidos en la linea 2 y 5 son: " + floatArray[1] + "   " + floatArray[4]);
          
    }
}
