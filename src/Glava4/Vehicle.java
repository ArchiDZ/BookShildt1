package Glava4;

public class Vehicle {
    int passegers;// количество пасажиров
    int fuelcap;// емкость топливного бака
    int mpg; //потребление топлива в милях на галлон

    //отображение дальности поездки транспортного средства
    int range(){
       return mpg*fuelcap;
        // System.out.println("Дальность  - "+fuelcap*mpg+" миль");
    }
    //Расчет количества топлива, необходимого транспортному средству
    //для преодоления заданного расстояния.
    double fuelneded(int miles){
        return (double) miles/mpg;
    }
}
