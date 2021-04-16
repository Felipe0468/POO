import java.util.Scanner;

public class Calculadora {
  
  public static void main(String[] args) {

   Scanner leer=new Scanner(System.in);

    System.out.print("Por favor digite la operación que se quiere realizar con el número que se indica: Suma(1) – Resta (2) – Multiplicación (3) – División (4): ");
    int operador = leer.nextInt();

    System.out.print("Ahora los dos dígitos a operar: ");
    float num1 = leer.nextFloat();
    float num2 = leer.nextFloat();
    

    if (operador==1){
      System.out.print("El resultado de la operación es: "+suma(num1,num2));
    }

    if (operador==2){
      System.out.print("El resultado de la operación es: "+resta(num1,num2));
    }

     if (operador==3){
      System.out.print("El resultado de la operación es: "+multiplicacion(num1,num2));
    }

     if (operador==4){
       if (num2!=0){
        System.out.print("El resultado de la operación es: "+division(num1,num2));
       }else{
         System.out.print("El resultado presenta una indeterminación");
       }
      }

  }
  
 
  public static float suma(float a,float b){
    return a+b;
  }

  public static float resta(float a,float b){
    return a-b;
  }

  public static float multiplicacion(float a,float b){
    return a*b;
  }

  public static float division(float a,float b){
    return a/b;
  }

}


