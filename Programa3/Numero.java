import java.util.Scanner;

class Numero {
  public static void main(String[] args) {
   Scanner leer=new Scanner(System.in);
   System.out.print("Por favor digite el tipo que se quiere realizar con el número que se indica: Impar(1) – Par(2): ");
    int tipo = leer.nextInt();

    System.out.print("Ahora los dos dígitos extremos: ");
    int num1 = leer.nextInt();
    int num2 = leer.nextInt();
    int nume1;

    if (tipo==1){
      nume1=num1;
      while (nume1<=num2){
        if (nume1%2!=0){
          System.out.print(nume1);
          System.out.print(" ");
        }
        nume1=nume1+1;
      }
    }

    if (tipo==2){
      for (nume1=num1;nume1<=num2;nume1++){
        if (nume1%2==0){
          System.out.print(nume1);
          System.out.print(" ");
        }
      }
    }

     
  }
}