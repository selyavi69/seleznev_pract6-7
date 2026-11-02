class Book implements Printable{
    @Override
    public void print(){
        System.out.println("Книга");
    }
}

class Magazine implements Printable{
    @Override
    public void print(){
        System.out.println("Журнал");
    }
}



public class Main{

    public static void main(String[] args){
        Printable[] items = {
                new Book (),
                new Book (),
                new Magazine(),
                new Book(),
                new Book(),
                new Magazine(),
                new Book(),
                new Book(),
                new Magazine(),
                new Book(),
                new Magazine()

        };

        for (Printable item: items ){
            item.print();
        }
    }
}

