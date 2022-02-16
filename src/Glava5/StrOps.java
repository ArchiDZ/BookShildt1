package Glava5;

public class StrOps {
    // Некоторые операции над строками
    public static void strDemo(){
        String str1 ="Java - лидер Интернета";
        String str2 = new String(str1);
        String str3 ="Строки в Java эффективны.";
        int result, indx;
        char ch;

        System.out.println("Длинна str1--> "+str1.length());
        // Отображение строки str1 по символьно
        for(int i=0;i<str1.length();i++)
            System.out.print(str1.charAt(i));
        System.out.println();

        if(str1.equals(str2))
            System.out.println("Строка 1 эквивалентна Строке 2");
        else
            System.out.println("Строка 1 не эквивалентна строке 2");

        if(str1.equals(str3))
            System.out.println("Строка 1 эквивалентна Строке 3");
        else
            System.out.println("Строка 1 не эквивалентна строке 3");

        result = str1.compareTo(str3);
        if(result == 0)
            System.out.println("Строка 1 и Строка 3 равны");
        else if (result<0)
            System.out.println("Строка 1 меньше Строки 3");
        else
            System.out.println("Строка 1 больше Строки 3");

        // Присваиваем переменной str2 новую строку
        str2 = "One Two Three One";

        indx = str2.indexOf("One");
        System.out.println("Индекс первого вхождения One-->"+indx);
        indx = str2.lastIndexOf("One");
        System.out.println("Индекс последнего вхождения One-->"+indx);
    }
    /*
    * Использование строк для управления конструкций switch
    */
    public static void StringSwitch(){
        String command = "cancel";

        switch (command){
            case "connect":
                System.out.println("Подключение");
                break;
            case "disconnect":
                System.out.println("Отключение");
                break;
            case "cancel":
                System.out.println("Отмена");
                break;
            default:
                System.out.println("Неверная команда");
                break;


        }
    }

}
