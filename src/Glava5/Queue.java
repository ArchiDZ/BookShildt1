package Glava5;
/*
 *Упражнение 5.2

 * Класс , реализующий очередь для хранения символов

 */

public class Queue {
    char q[];               // Массив для хранения элементов очереди
    int putloc,getloc;  // индексы для вставки и извлечения
                            // элементов очереди

    Queue(int size){
        q = new char[size]; // Выделение памяти для очереди
        putloc = getloc= 0;
    }
    //Помещение символа в очередь
    void put(int ch){
        if(putloc==q.length){
            System.out.println(" - Очередь заполнена");
            return;
        }
        q[putloc++] = (char) ch;
    }
    // Извлечение символа из очереди
    char get(){
        if(getloc == putloc){
            System.out.println(" - Очередь пуста ");
            return (char)0;
        }
        return q[getloc++];
    }
}
