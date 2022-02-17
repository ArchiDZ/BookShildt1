package Glava6.ctp223;
/*
    В этом примере реализуется отказаустойчевый массив,
    предотвращающий ошибки времени выполнения
* */
public class FailSoftArray {
    private int a[];      //Ссыылка на массив

    private  int errval; // значение возвращаемое в случае возникновения
                        // ошибки при выполнении метода get()

    public int length; // Открытая переменная

    /*
    * Конструктору данного класса передается размер массива
    * и значение, которое должен возвращать метод get()
    * при возникновении ошибки.
    * */

    public FailSoftArray(int size, int errv){
        a = new int[size];
        errval = errv;
        length = size;
    }

    // Возврат значения элемента массива с заданным индексом
    public int get(int index){
        if(indexOK(index))
            return a[index];
        return errval;
    }
    //Установка значения элемента с заданным индексом.
    // Если возникнет ошибка, вернуть логическое значение false.

    public boolean put(int index, int val){
        if (indexOK(index)){
            a[index] = val;
            return true;
        }
        return false;
    }

    // Возврат логического значения true,
    // если индекс не выходит за приделы массива

    private boolean indexOK(int index){
        if (index>=0 & index<length)
            return true;
        return false;
    }

}
