public class Operadores{
  public static void main(String args[]){
    int variable_1 = 4;
    int variable_2 = 4;
    int resultado = 0;

    resultado = variable_1 + variable_1 / 2;
    System.out.println("su resultado es: " + resultado);

    resultado = (variable_1 + variable_1) / 2;
    System.out.println("su resultado con parentesis es: " + resultado);

    resultado = variable_1 + variable_1^3 / 2;
    System.out.println("su resultado es exponente: " + resultado);
  }
}
