package Glava5;

public class MinMaxInArr {
    public static void minMax(){
        int num[] = {99,-10,100123,18,-978,5623,463,-9,287,49};
        int min,max;

        min=max=num[0];
        for(int i=1;i<10;i++){
            if(num[i]<min) min=num[i];
            if(num[i]>max) max = num[i];
        }
        System.out.println("min: => " +min+" max: => "+max);
    }
}
