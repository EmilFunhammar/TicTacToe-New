import java.util.ArrayList;

import java.util.Scanner;

class Main {
public static void main(String[] args) {
// This variable is a 2D array of characters that will be representative of the // three-by-three board of a the game.
    
Scanner sc= new Scanner(System.in);
String answer = "ja";
while(answer.equals("ja")){
Board board = new Board();
    

// Prints Player 1
System.out.println("Welcome enter your name player 1 to Start the Game:");

// Prints Player 2
String p1 = sc.nextLine(); 
    
System.out.println("Welcome enter your name player 2 to Start the Game: ");

String p2 = sc.nextLine(); 
Player player1 = new Player(p1, 'X');
Player player2 = new Player(p2, 'O');
   
board.draw();
    

// place out p1 piece
System.out.println(player1.getName() + " "+ player1.getSymbol());


  
// Prints who won and if Schedule/gameplan is Full
boolean isFull = false;

boolean win = false;

boolean contin = true;// If none of the values ​​listed above match, the Game continues.
  

// Prints whose turn it is;
Player currentPlayer = player1;

while(contin){// if the game continues we change players;
if( currentPlayer == player1){
currentPlayer = player2;
} 
else {
currentPlayer = player1;
      }
   //Print out player and symbol in awhile loop;   
System.out.println(currentPlayer.getName() + " "+ currentPlayer.getSymbol() +" Välj Ett nr mellan (1-9:)");


// The method that checks whether the game box is busy or not
int pos = sc.nextInt();
 
sc.nextLine();
boolean occupide;
occupide = board.occupide(pos);
while 
(occupide == true) {
System.out.println("Upptagen ange ny placering:");
pos = sc.nextInt();
          
occupide = board.occupide(pos);
           }

board.placeMarker(currentPlayer.getSymbol(), pos );
board.draw();


     
      
win = board.checkWinner(); // ska returnera om det är en vinst eller ej;
isFull = board.isBoardFull();
if(win || isFull){
contin = false;
      }
System.out.println("........................");
      
    
}

// Check if the game board is full and unfinished;
if(isFull){
System.out.println("Tack För Spelt Spelplanen är Full:Det vart ovagjort");
System.out.println("Spela igen");
System.out.println("ja");
System.out.println("nej");
/* answer=sc.nextLine(); */
if(answer.equals("nej")){
System.out.println("Välkomen åter"); 
answer=sc.nextLine();
}
      
    

}
//Prints out the winner text or if you want to play again: 
else if(win){
System.out.println("Tack För Spelt, Du vann:😍 " + currentPlayer.getName());
System.out.println("Spela igen");
System.out.println("ja");
System.out.println("nej");
answer=sc.nextLine();
     


}
}
}
}


   
