package Glava6.ctp229;

public class Test {
    // Этот метод не может изменить значение аргументов,
    // передоваемых ему при вызове

    void noChange( int i, int j){
        i = i+j;
        j = -j;
    }
}
