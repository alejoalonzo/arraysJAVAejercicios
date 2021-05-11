package arrays;

import java.util.Scanner;
public class ejercicio6 {
        public static void main(String[] args) {
     
          Scanner in = new Scanner(System.in);
          
          float decimal, decimal2, decimal3, decimal4, decimal5, decimal6, comprobar;
          
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
          System.out.println("Ingrese otro numero decimal");
          decimal6 = in.nextFloat();
          
          float floatArray[];
          floatArray = new float[6];
          
          floatArray[0]= decimal;
          floatArray[1]= decimal2;
          floatArray[2]= decimal3;
          floatArray[3]= decimal4;
          floatArray[4]= decimal5;
          floatArray[5]= decimal6;
          
          System.out.println("ingrese un número para comprobar si está en el programa");
          comprobar = in.nextFloat();
            
          for(int i = 0; i < floatArray.length; i++)
   
          if(comprobar == floatArray[i]){
              System.out.println("Está en el programa");
          }else{
              System.out.println("No está en el programa");
          }
    }
}
