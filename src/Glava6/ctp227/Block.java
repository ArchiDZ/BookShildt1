package Glava6.ctp227;
//Методам можно передавать обьекты
public class Block {
    int a,b,c;
    int volume;

    Block(int i,int j,int k){
        a = i;
        b = j;
        k = c;
        volume = a*b*c;
    }
    // Возврат логиеского значения  true, если
    // параметр ob определяет тот же параллелипипид

    boolean sameBlock(Block ob){
        if ((ob.a == a)&(ob.b == b)&(ob.c==c))
            return true;
        else return false;
    }
    // Возврат логического значения true, если
    // параметр  ob определяет параллелепипед  того же обьема

    boolean sameVolume (Block ob){
        if (ob.volume == volume)
            return true;
        else return false;
    }
}
