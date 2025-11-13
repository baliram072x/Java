public class Interface {
    public static void main(String[] args){
Queen q =new Queen();
q.moves();
    }
}

interface  chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves(){
        System.out.println("left , up ,down , right , in all four direction");
    }
}

class rook implements chessPlayer{
    public void moves(){
        System.out.println("left , up ,down , right , ");
    }
}

class king  implements chessPlayer{
    public void moves(){
        System.out.println("left , up ,down , right digonal , by one step");
    }
}



// notes====-----=====---====---===--===----===---===>>>>>>>>>>>

/*
interface is blueprint of class

-it impliments multiple inheritace
-to achieve total abstraction
- it is defined by keyword interface
- to inherit interface impliments word is used
-all methods are public , abstract , & without implimentation
- Variables in the interface are final , public and static
 */