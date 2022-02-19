package Glava6.ctp227;

public class PassOb {
    public static void runPassOb(){
        Block ob1 = new Block(10,2,5);
        Block ob2 = new Block(10,2,5);
        Block ob3 = new Block(5,2,10);

        System.out.println("Обьект 1 имеет теже размеры, что и Обьект 2-->"+
                ob1.sameBlock(ob2));
        System.out.println("Обьект 1 имеет теже размеры, что и Обьект 3-->"+
                ob1.sameBlock(ob3));
        System.out.println("Обьект 1 имеет тот же обьем, что и Обьект 3-->"+
                ob1.sameBlock(ob2));
    }
}
