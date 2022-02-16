package Glava5;

public class StringArr {
    public static void stringAsArray(){
        String strs [] = {"Эта","Строка","Является","Текстом"};

        System.out.println("Исходный Массив--> ");
        for (String s : strs)
            System.out.print(s+" ");
        System.out.println("\n");

        // Изменение строки
        strs[2]="также является";
        strs[3]="ТеКсТоМ!!!";

        System.out.println("Измененный массив--> ");
        for(String s : strs)
            System.out.print(s+" ");
    }
    public static void SubStr(){
        String origStr = "Java - двигатель Интернета!";

        // Сформировать подстроку
        String subStr = origStr.substring(7,25);
        System.out.println("origStr "+origStr);
        System.out.println("subStr "+subStr);
    }
}
