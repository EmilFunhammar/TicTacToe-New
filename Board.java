public class Board {   
char[] gameBoard ;
  

//Drawing out gameBoard;
public Board() {
gameBoard = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ',' ' };
    
}

//Drawing out the symbols X and O;
public void placeMarker(char symbol, int pos) {
this.gameBoard[pos-1] =symbol;
  }


//Drawing out the posistin in the gameBoard
 public void draw (){
 System.out.println(gameBoard[0] + "|" + gameBoard[1] + "|" + gameBoard [2]);
 System.out.println("-+-+- ");
 System.out.println(gameBoard[3] + "|" + gameBoard[4] + "|" + gameBoard [5]);
 System.out.println("-+-+- ");
 System.out.println(gameBoard[6] + "|" + gameBoard[7] + "|" + gameBoard [8]);

   
}
// Checks through all cells of the board and if one is found to be empty (contains char '-') then return false. // Otherwise the board is full.
public boolean isBoardFull(){
for(int i = 0; i < gameBoard.length; i++) {
if (gameBoard[i] == ' ') {
return false;
    }
  }
return true;

}
//Checking whether the box is occupide or not;
public boolean occupide(int pos){
if(gameBoard[pos -1] == ' '){
return false;

  }
return true;
}


   
//Checks all the rows,cols and diogonal;
public boolean checkWinner(){

//Check true through rows and see if any are winners.
if(check(gameBoard[0],gameBoard[1],gameBoard[2])){
    return true;
  }
if(check(gameBoard[3],gameBoard[4],gameBoard[5])){
    return true;
  }
  if(check(gameBoard[6],gameBoard[7],gameBoard[8])){
  return true;
  }

  //Check Coloums
  if(check(gameBoard[0],gameBoard[3],gameBoard[6])){
    return true;
   }
  if(check(gameBoard[1],gameBoard[4],gameBoard[7]))
    return true;

  if(check(gameBoard[2],gameBoard[5],gameBoard[8]))  return true;

//Check Diogonalt
   if(check(gameBoard[6],gameBoard[4],gameBoard[2])){
     return true;
   }
  if(check(gameBoard[0],gameBoard[4],gameBoard[8])) return true;

   //If the are no winners the pogram returns false;
  return false;
  }


//Checks if the check box has a winner
private boolean check(char a, char b, char c){
  if(a==b && b == c && c !=' '){
    
    return true;
  }
  return false;
 
}

}
                          