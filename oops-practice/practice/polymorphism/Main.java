class Parent {
    void add(){
        System.out.println("i am Parent");
    }
}

class Child extends Parent {

   
    void add() {
        System.out.println("i am  Child " );
    }


}

public class Main {
    public static void main(String[] args) {

        Parent c = new Child();

        c.add();             
                    
      
    }
}