package Glava3;
/*Упражнение 3.2
* Расширенная справочная система, в которой для обработки
* результатов выбора используется цикл do-while*/

import java.io.IOException;

public class Help2 {
    public static void menu2() throws IOException {

        char choice,ignore;

        System.out.println("Справка: ");
        System.out.println("1.if");
        System.out.println("2.switch");
        System.out.println("3.for");
        System.out.println("4.while");
        System.out.println("5.do-while\n");
        System.out.println("Выберите: ");
        choice = (char) System.in.read();

        System.out.println("\n");

        switch(choice){
            case'1':
                System.out.println("Инструкция if:\n");
                System.out.println("if(условие) инструкция;");
                System.out.println("else инструкция;");
                break;
            case '2':
                System.out.println("Инструкция switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println("case константа:");
                System.out.println("   последовательность инструкций");
                System.out.println("   break;");
                System.out.println("   // ... ");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Цикл for:\n");
                System.out.println("for(инициализация;условие;итерация)");
                System.out.println("инструкция");
                break;
            case '4':
                System.out.println("Цикл While:\n");
                System.out.println("while (условие) инструкция;");
                break;
            case '5':
                System.out.println("Цикл do-while:\n");
                System.out.println("do {");
                System.out.println("  инструкция;");
                System.out.println("} while (условие);");
                break;
            default:
                System.out.println("Запрос не найден");
        }
    }
}
