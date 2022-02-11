package Glava5;

public class AssignRef {
    public static void assRef(){
        int i;

        int num1[] = new int[10];
        int num2[] = new int[10];

        for( i=0;i<10;i++)
            num1[i]=i;

        for(int j=0;j<10;j++)
            num2[j]=-j;

        System.out.println("Массив num1: ");
        for (i=0;i<10;i++)
            System.out.print(num1[i]+" ");
        System.out.println();

        System.out.println("Массив num2[]: ");
        for( i=0;i<10;i++)
            System.out.print(num2[i]+" ");
        System.out.println();

        num2 = num1; // Теперь обе переменные ссылаются
                            // на массив num1

        System.out.println("Массив num2[] после присваивания: ");
        for(i = 0; i<10;i++)
            System.out.print(num2[i]+" ");
        System.out.println();

        /*
        * Выполнение операций над массивом num1
        * через переменную num2
        * */

        num2[3]=99;

        System.out.print("Массив num1[] после изменения через num2[]");
        for ( i =0;i<10;i++)
            System.out.print(num1[i]+" ");
        System.out.println();
    }
}
