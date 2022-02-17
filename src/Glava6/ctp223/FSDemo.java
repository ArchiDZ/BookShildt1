package Glava6.ctp223;

/*
* Демонстрация работы с отказоустойчевым массивом
* */

public class FSDemo {
    public static void runFsDemo(){
        FailSoftArray fs = new FailSoftArray(5,-1);
        int x;

        //Демонстрация корректной обработки ошибок

        System.out.println("Обработка ошибок без вывода отчета.");
        for (int i=0;i<(fs.length)*2;i++)
            fs.put(i,i*10); // Для обращения к элементам массива должны
                                // использоваться его методы доступа
        for(int i=0;i<(fs.length)*2;i++) {
            x = fs.get(i);// Для обращения к элементам массива должны
                           // использоваться его методы доступа

            if(x!=-1)
                System.out.println(x+" ");
        }
        System.out.println(" ");

        //Обработка ошибок
        System.out.println("Обработка ошибок с выводом отчета");
        for (int i=0;i<(fs.length*2);i++)
            if(!fs.put(i,i*10))
                System.out.println("Индекс "+i+" вне диапазона");
        for(int i=0;i<(fs.length*2);i++){
            x= fs.get(i);
            if(x!=-1)
                System.out.print(x+" ");
            else
                System.out.println("Индекс "+i+" вне диапазона");
        }
    }
}
