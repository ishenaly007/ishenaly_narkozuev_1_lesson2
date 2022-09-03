import java.util.Random;

public class Main {
    public static void main(String[] args) {
      /*  ageAndTemperature(7, -25);
        ageAndTemperature(45, 31);
        ageAndTemperature(20, 25);
        ageAndTemperature(45, -11);
        ageAndTemperature(1, 15);
        ageAndTemperature(generateRandomAge(), 15);
        ageAndTemperature(generateRandomAge(), 15);
        System.out.println(generateRandomAge());
        ageAndTemperature(generateRandomAge(),25);
        // ??? * true = ???*/
        System.out.println(ageAndTemperature(20,10));
        System.out.println(ageAndTemperature(generateRandomAge(),10));
    }
    public static String ageAndTemperature(double age , double temperature) {
        // возвращаемый метод c входящими параметрами

        if (age >= 20 && age < 46 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять1";
        } else if (age <= 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять2";
        } else if (age > 45 && temperature > -11 &&  temperature < 26 ) {
            return "Можно идти гулять3";
        } else {
            return "Оставайтесь дома!";
        }

    }

    public static int generateRandomAge() {
        // double randomAge = Math.random()*151;
        int randomAge = new Random().ints(1, 1, 100).findFirst().getAsInt();
        return randomAge;
    }
}