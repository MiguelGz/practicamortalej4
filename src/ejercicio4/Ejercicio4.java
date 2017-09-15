/*
 *Desarrolle una aplicación que genere un número aleatorio 
y permita al usuario encontrar el número generado mostrando
si el número ingresado es mayor o menor
*/
package ejercicio4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 *
 * @author MiguelGz
 */

public class Ejercicio4 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    public static void main(String[] args) throws IOException
    
    {
    //Crearemos un random llamado aleatorio y creamos su biblioteca
    Random aleatorio=new Random();
    
    //Ingresamos un entero y asu su vez el numero 
    //a adivinar ademas de las pruebas e intentos
    
    int numero, secreto,intento, pruebas,intentos;
    
    //Ingresaremos un bufferedreades ademas de crear su biblioteca
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    
        //Numero de intentos que te queda
        intentos=10;
    
        //Numero de veces que puedes jugar
        pruebas=10;
    
        //Numero de intentos que costo adivinar
        intento=0;
    
        //Creamos nuestra variable aleatoria secreta que estara entre el 1 a 100
        secreto=aleatorio.nextInt(100);
        
         do
            {
              System.out.println
                                (
                                "Introduzca un numero:   "
                                );
             
        numero=Integer.parseInt(entrada.readLine());
    
        /*
         Con cada jugada el intento va aumentando y si 
         logras adivinar el numero te dice en que intento lo lograste
        */
        intento++;
        
        //Con cada jugada el numero de intentos que te queda se va reduciendo
        intentos--;
        
            //Insertaremos un ciclo o bucle..
                //Si el numero insertado es igual al secreto entonces..
                if (numero==secreto){
                        System.out.println
                                            (
                                              "Adivinaste"
                                            );
                        System.out.println
                                            (
                                              "Felicitaciones; acertaste en tan solo "
                                              +intento+" intentos!"
                                            );
                    
                }
                
                //Si el numero insertado es mayor al secreto entonces.
                else if (numero>secreto){
                    System.out.println
                                        (
                                          "¡El numero es menor!"
                                        );
                    
                    //Si no lo adivinas entonces..
                    System.out.println
                                        (
                                          "Te quedan "+intentos+" intentos"
                                        );
                }
                
                //Si el numero insertado es menor al secreto entonces.
                else{
                    System.out.println
                                        (
                                          "El numero es mayor"
                                        );
                    
                 //Si no lo adivinas entonces..
                    System.out.println
                                        (
                                          "Te quedan "+intentos+"intentos"
                                        );
                }
                pruebas--;
                
            }
                while
                    (
                        (pruebas>0) 
                      ||(secreto==numero)
                    );
         
         //Si el numero de pruebas llega a 0 entonces..
                if
                    (pruebas==0)
                    {
                        System.out.println
                                            (
                                              "Se Acabo tus intentos"
                                             );
                    }

           }

}