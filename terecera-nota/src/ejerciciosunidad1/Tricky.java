package ejerciciosunidad1;
import java.util.Scanner;
public class Tricky{
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  char [][] board = new char [3][3];
  int boardlength = board.length;
  char rellenar = 'X';
  char  rellenarplayer1 = ' ';
  char  rellenarplayer2 = ' ';
  boolean IsPlaying  = true;
     
    System.out.println("Ingrese el nombre del jugador 1:");
    String player1 = scanner.nextLine();
    System.out.println("Ingrese el nombre del jugador 2:");
    String player2 = scanner.nextLine();
    System.out.println(player1 +  "," + "Desea jugar con X, responda si o no:");
    String eleccion  = scanner.nextLine();
     if(eleccion.equalsIgnoreCase("si")){
     System.out.println("Jugador 1:" + player1 + "," + "juega con X");
     System.out.println("Jugador 2:" + player2 +  "," + "juega con O");
      rellenarplayer1 = 'X';
      rellenarplayer2 = 'O';
    }else if(eleccion.equalsIgnoreCase("no")){
      System.out.println(player2 + "," + "juega con X");
      System.out.println(player1 + ", " + "juega con O");
       rellenarplayer1 = 'O';
      rellenarplayer2 = 'X';
    }else{
       System.out.println("Responda si o no");
      }
  for (int i=0; i<boardlength; i++){
    for (int j=0; j<boardlength; j++){
      board[i][j]= ' ';
    }
  }
  System.out.println();
  do{
      System.out.println(" " + board[0][0]  + " " + "|" +  " " + board[0][1] + " " + "|" + " " + board[0][2]);
      System.out.println("-----------");
      System.out.println(" " + board[1][0]  + " " + "|" +  " " + board[1][1] + " " + "|" + " " + board[1][2]);
      System.out.println("-----------");
      System.out.println(" " + board[2][0]  + " " + "|" +  " " + board[2][1] + " " + "|" + " " + board[2][2]);
      System.out.println();
      if (rellenar == rellenarplayer1){
      System.out.println("escoga una posicion jugador 1:" + player1);
      }else{
        System.out.println("escoga una posicion jugador 2:" + player2);
      }
      System.out.println();
      System.out.print("escoga una fila (1-3):");
      int posicionfila = scanner.nextInt()-1;
      if (posicionfila<0 || posicionfila>=boardlength){
        System.out.println("Posicion invalida");
        continue;
      }
      System.out.print("escoga una columna (1-3):");
      int posicioncolumna = scanner.nextInt()-1;
      System.out.println();
      if (posicioncolumna<0 || posicioncolumna>=boardlength){
        System.out.print("Posicion invalida intente de nuevo");
        continue;
      }
      if (board[posicionfila][posicioncolumna] != ' '){
        System.out.println("Esta casilla esta ocupada intente de nuevo"); 
        continue;
      }

        board[posicionfila][posicioncolumna]  = rellenar;
      if (
        (board[0][0]==rellenar && board[0][1]==rellenar && board[0][2]==rellenar) ||
        (board[1][0]==rellenar && board[1][1]==rellenar && board[1][2]==rellenar) ||
        (board[2][0]==rellenar && board[2][1]==rellenar && board[2][2]==rellenar) ||
        (board[0][0]==rellenar && board[1][0]==rellenar && board[2][0]==rellenar) ||
        (board[0][1]==rellenar && board[1][1]==rellenar && board[2][1]==rellenar) ||
        (board[0][2]==rellenar && board[1][2]==rellenar && board[2][2]==rellenar) ||
        (board[0][0]==rellenar && board[1][1]==rellenar && board[2][2]==rellenar) ||
        (board[0][2]==rellenar && board[1][1]==rellenar && board[2][0]==rellenar)
      ) {
          if (rellenar == rellenarplayer1){
            System.out.println();
            System.out.println("Gano jugador: " + player1 + ", con las: " + rellenarplayer1);

          }
          else {
            System.out.println();
            System.out.println("Gano jugador: " + player2 + ", con las: " + rellenarplayer2);
            
          }
          IsPlaying = false;
          break;
        }
        boolean full = true;
        for(int i=0; i < boardlength; i++){
          for (int j=0; j < boardlength; j++){
            if (board[i][j] == ' '){
              full = false;
              break;
            }
          }
        }
            if (full){
              System.out.println();
              System.out.println("Empate");
             IsPlaying = false;
             break;
            }
        if (rellenar == 'X' ){
          rellenar = 'O';
        }else{
          rellenar = 'X';
        }

  }while(IsPlaying);
  scanner.close();
  }
}









