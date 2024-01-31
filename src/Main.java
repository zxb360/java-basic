//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    String vamos = "Valor do array = ";

    int soma = 0;

    //    tipos primitivos em java
    int[] arrayDeNumber = new int[5];
    arrayDeNumber[0] = 40;
    arrayDeNumber[1] = 50;
    arrayDeNumber[2] = 22;
    arrayDeNumber[3] = 88;
    arrayDeNumber[4] = 5;

//   String no java e do tipo nao primitivo
    String[] arrayDeString = new String[2];
    arrayDeString[0] = "Esse valor";
    arrayDeString[1] = "Somado com ";
    arrayDeString[2] = "Somado com tudo";

    soma = arrayDeNumber[0] + arrayDeNumber[3];
    System.out.println(vamos + arrayDeNumber[3] + arrayDeNumber[1] + arrayDeString[1] + soma);

//    meios de criar array alem do metodo a cima
    String[] testChaves = {"ola", "mundo", "!"};

    int[] numberes = {1, 4, 6, 9};

    int[][] matriz = {{1, 3}, {2, 9}};

    System.out.println(testChaves[0]);
    System.out.println(numberes[1]);
    System.out.println(matriz[0][1]);
  }
}