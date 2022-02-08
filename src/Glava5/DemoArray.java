package Glava5;

public class DemoArray {
    public static void sampleArr()

    {
        int sample[] = new int[10];
        int i;

        for ( i = 0; i < 10; i++)
            sample[i] = i;

        for(i=0;i<10;i=i+1)
            System.out.println("Элемент [ "+i+" ] : "+sample[i]);
    }
}
