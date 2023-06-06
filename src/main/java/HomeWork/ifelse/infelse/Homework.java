package HomeWork.ifelse.infelse;


public class Homework {
    public static void main(String[] args) {
        boolean isWeekend = true;
        boolean isRain = false;
        boolean canWalk = isWeekend && !isRain;
        if (canWalk) {
            System.out.println("You can Wolk");
        } else {
            System.out.println("You can´t wolk today");
        }





        boolean isEdekaOpen = true;
        boolean isReweOpen = true;

        boolean canBuy = canBuy(isEdekaOpen, isReweOpen);
        if(canBuy){
            System.out.println("i can buy food: " + canBuy);
        }else
            System.out.println("i can buy food" + false);




        int temperatur1 = 100;
        int temperatur2 = 100;
        boolean working = verific(temperatur1, temperatur2);
        System.out.println(verific(110,99));



    }
    public static boolean verific(int temperature1, int temperature2) {
        return temperature1 > 100 && temperature2 < 100;
    }
    public static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen || isReweOpen;
    }



}




