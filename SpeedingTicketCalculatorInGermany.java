public class Main {
    public static void main(String[] args) {
        System.out.println("Система расчёта штрафов в Германии");

       int CarSpeed = 155;
       boolean isTown = false;

        int fineFor1to10 = 30 ;
        int fineFor11to15 = 50;
        int fineFor16to20 = 70;
        int fineFor21to25 = 115;
        int fineFor26to30 = 180;
        int fineFor31to40 = 260;
        int fineFor41to50 = 400;
        int fineFor51to60 = 560;
        int fineFor61to70 = 700;
        int fineFor70andMore = 800;





        int townSpeed = 50;
        int countrySpeed = 90;
       int overSpeed ;

        // в городе
        if (isTown) { 
            overSpeed = CarSpeed - townSpeed;
        }
        
        // за городом
        else   { 
            overSpeed = CarSpeed - countrySpeed;
        }


        if(overSpeed < 1) {
            System.out.println("Скорость не превышена или превышена незначительно");
        }
        else if(overSpeed >= 1 && overSpeed < 10) {
            System.out.println("Штраф: " + fineFor1to10 + " euro");
        }
        else if(overSpeed >= 11 && overSpeed < 15) {
            System.out.println("Штраф: " + fineFor11to15 + " euro");
        }
        else if(overSpeed >= 16 && overSpeed < 20) {
            System.out.println("Штраф: " + fineFor16to20 + " euro");
        }
        else if(overSpeed >= 21 && overSpeed < 25) {
            System.out.println("Штраф: " + fineFor21to25 + " euro");
        }
        else if(overSpeed >= 26 && overSpeed < 30) {
            System.out.println("Штраф: " + fineFor26to30 + " euro");
        }
        else if(overSpeed >= 31 && overSpeed < 40) {
            System.out.println("Штраф: " + fineFor31to40 + " euro");
        }
        else if(overSpeed >= 41 && overSpeed < 50) {
            System.out.println("Штраф: " + fineFor41to50 + " euro");
        }
        else if(overSpeed >= 51 && overSpeed < 60) {
            System.out.println("Штраф: " + fineFor51to60 + " euro");
        }
        else if(overSpeed >= 61 && overSpeed < 70) {
            System.out.println("Штраф: " + fineFor61to70 + " euro");
        }
        else if(overSpeed >= 70 ) {
            System.out.println("Штраф: " + fineFor70andMore + " euro");
        }



    }

}
