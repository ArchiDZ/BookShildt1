package Glava5;

public class ForEach {
    public static void sumArrWithFor(){
        int nums[] = {10,12,55,4,9,854,3,59,1};
        int sum=0;
        System.out.print("Массив--> ");
        for(int i=0;i< nums.length;i++){
            sum+=nums[i];
        System.out.print(nums[i]+" ");
        }
        System.out.println(" Сумма всех элементов массива: "+sum);
    }

    public static void sumArrWithForEach(){
        int nums[] = {10,12,55,4,9,854,3,59,11};
        int summa = 0;
        // Использование цикла for-each для
        // суммирования и отображения значений массива
        for(int x:nums){
            System.out.println("Значение: "+x);
            summa+=x;
        }
        System.out.println("Сумма всех элементов массива: "+summa);
    }
    public static void sumFiveElements(){
        int nums[] = {10,12,55,4,9,854,3,59,11};
        int summa = 0;
        // Суммирование первых 5ти элементов
        for(int x:nums){
            System.out.println("Значение: "+x);
            summa+=x;
            if(x==9)break;// Прерывание цикла по достижении значения 9
        }
        System.out.println("Сумма всех элементов массива: "+summa);
    }

    public static void forEachArrArrays(){
        // Использование расширенного цикла for
        // для обработки двумерного массива
        int sum = 0;
        int nums [] [] = new int [3][5];
        // Ввод ряда значений в массив  nums
        for(int i=0;i<3;i++)
            for(int j=0;j<5;j++)
                nums[i][j] = (i+1)*(j+1);
        // Использование цикла типа for-each для
        // суммирование и отображения значений.
        for(int x[]:nums){
            for(int y:x){
                System.out.println("Значение: "+y);
                sum+=y;
            }
        }
        System.out.println("Сумма: "+sum);
    }
    public static void search(){
        int nums [] = {6,8,3,7,5,6,1,4};
        int val = 5;
        boolean found = false;

        // Использование цикла for-each для поиска
        // значение переменной val в массиве nums
        for(int x:nums){
            if(x==val){
                found=true;
                break;
            }
        }
        if(found)
            System.out.println("Значение найдено");
    }
}
