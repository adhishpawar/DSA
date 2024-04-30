public class interinjavamultipleinheritance {
    public static void main (String args[]){
    Queen q = new Queen();

    q.moves();
    
}
}

interface ChessPlayer{
    void moves();

}

class Queen implements ChessPlayer{
    public void moves(){

    System.out.println("up,down,left,right,diagonal (in all four direaction)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){

    System.out.println("up,down,left,right");
    }
}

class king implements ChessPlayer{
    public void moves(){

    System.out.println("up,down,left,right,diagonal -(by one step)");
    }
}


