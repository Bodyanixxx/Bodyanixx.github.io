public class Russia {	public static void main(String[] args) {
    System.out.println("Система расчёта штрафов");

    int carSpeed = 162;
    boolean isTown = false;

    int fineFor20to40 = 500;
    int fineFor40to60 = 1000;
    int fineFor60to80 = 2000;
    int fineFor80andMore = 5000;

    int townSpeed = 60;
    int countrySpeed = 90;
    int overSpeed;
    
    // в городе
    if (isTown) { 
        overSpeed = carSpeed - townSpeed;
    }
    
    // за городом
    else { 
        overSpeed = carSpeed - countrySpeed;
    }


    if(overSpeed < 20) {
        System.out.println("Скорость не превышена или превышена незначительно");
    }
    else if(overSpeed >= 20 && overSpeed < 40) {
        System.out.println("Штраф: " + fineFor20to40 + "р");
    }
    else if(overSpeed >= 40 && overSpeed < 60) {
        System.out.println("Штраф: " + fineFor40to60 + "р");
    }
    else if(overSpeed >= 60 && overSpeed < 80) {
        System.out.println("Штраф: " + fineFor60to80 + "р");
    }
    else if(overSpeed >= 80) {
        System.out.println("Штраф: " + fineFor80andMore + "р");
    }
}
}
