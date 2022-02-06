package Glava4;

/*
* программа в которой используется класс Vehicle.
* И обьявляется обьект типа Vehicle*/

public class VehicleDemo {
    public static void frVehicle(){
        Vehicle minivan = new Vehicle();
        int range;

        //присваивание значений полям в обьекте minivan
        minivan.passegers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //расчет дальности поездки с полным баком горючего
        range = minivan.fuelcap* minivan.mpg;
        System.out.println("Минифургон может перевезти "+
        minivan.passegers+ " пасажиров на расстояние "+range+" миль");
    }

    public static void retMeth(){
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();

        int range1,range2;

        //присваиваем значения полям обьекта minivan
        minivan.passegers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //присваиваем значения полям обьекта sportcar
        sportcar.passegers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;
        //получаем дальность поездки для разных транспортных средств
        range1 = minivan.range();
        range2 = sportcar.range();

        System.out.println("Минифургон может перевезти "+minivan.passegers+
                " пасажиров на расстояние "+range1+" миль");
        System.out.println("Спорткар может перевезти "+sportcar.passegers+
                " пасажиров на расстояние "+range2+" миль");
    }

    /*
     * Добавление параметризированного метода, в котором выполняется
     * расчет обьема топлива,нужного для преодоления заданного расстояния
     */

    public  static void comFuel(){
        Vehicle minivan = new Vehicle();
        Vehicle sportcar = new Vehicle();
        double gallons;
        int distance = 252;

        //присваиваем значение полям обьекта minivan
        minivan.passegers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //присваиваем значения полям обьекта sportcar
        sportcar.passegers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        gallons = minivan.fuelneded(distance);
        System.out.println("Для преодоления "+distance+" миль минифургону требуется "+
                gallons+" галлонов топлива");
        gallons= sportcar.fuelneded(distance);
        System.out.println("Для преодоления "+distance+" миль спорткару требуется "+
                gallons+" галлонов топлива");

    }
    public static void vehCons(){
        //Завершение создания обьектов транспортных средств
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportcar = new Vehicle(2,14,12);
        double gallons;
        int dist = 550;//St.Peter---Ventspils

        gallons=minivan.fuelneded(dist);
        System.out.println("Для преодоления "+dist+" миль минифургону требуется "+
                gallons+" галлонов топлива");
        gallons= sportcar.fuelneded(dist);
        System.out.println("Для преодоления "+dist+" миль спорткару требуется "+
                gallons+" галлонов топлива");
    }
}
