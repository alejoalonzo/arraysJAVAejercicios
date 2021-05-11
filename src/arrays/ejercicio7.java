package arrays;
import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
                
        String[] alumnos = {"Torito","Pepito","Fulanito","Concha","Chirajita"};
        int[] notas = {5,8,3,7,10};
       
        String buscar = "";
        System.out.println("Ingrese nombre del alumno: ");
        buscar = teclado.nextLine();
        
        //for(int i = 0; i < alumnos.length; i++)
        //for(int j = 0; j < notas.length; j++)
            
        //if(buscar.equals(alumnos[i])){
            if (buscar.equals(alumnos[0])){
               System.out.println("Su nota es: " + notas[0]); 
            }else if (buscar.equals(alumnos[1])){
               System.out.println("Su nota es: " + notas[1]);  
            }else if (buscar.equals(alumnos[2])){
               System.out.println("Su nota es: " + notas[2]);
            }else if (buscar.equals(alumnos[1])){
               System.out.println("Su nota es: " + notas[1]);
            }else if (buscar.equals(alumnos[3])){
               System.out.println("Su nota es: " + notas[3]);
            }else System.out.println("Su nota es: " + notas[4]);
         //}else{
           // System.out.println("Este alumno no se encuentra en nuestra base de datos");
        //}
    }
}

//No está terminado...
