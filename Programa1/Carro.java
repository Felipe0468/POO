public class Carro{

  private static String color;
  private static String marca;

  public static void main (String[] argv){
    Valores("Azul","Suzuki");
    System.out.print(" Esto es un carro de color "+color+" De marca "+marca);
  }
  public static void Valores(String col,String marc){
    color=col;
    marca=marc;
  }
}