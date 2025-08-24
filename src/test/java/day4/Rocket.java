package day4;

public class Rocket {
    int fuel;
    boolean isNavigationEnabled;

    public Rocket(int fuel, boolean isNavigationEnabled) {
        this.fuel = fuel;
        this.isNavigationEnabled = isNavigationEnabled;
    }
    public Rocket(){
        this.fuel = 120;
        this.isNavigationEnabled = false;
    }
    public void launch(){
        checkSystems();
        igniteEngines();
        liftOff();
    }
    public void checkSystems() {
        if (checkFuel() && checkNavigation()) {
            System.out.println("Все системы ок");
        } else {
            System.out.println("Ошибка! Системы не готовы.");
            System.exit(0);
        }
    }

    public boolean checkFuel() {
        if (fuel > 100) {
            System.out.println("Проверка топлива завершена");
            return true;
        } else {
            System.out.println("Недостаточно топлива!");
            return false;
        }
    }

    public boolean checkNavigation() {
        if (isNavigationEnabled) {
            System.out.println("Навигационная система в норме");
        } else {
            System.out.println("Навигационная система неисправна!");
        }
        return isNavigationEnabled;
    }
//    public boolean checkNavigation() {
//        if (isNavigationEnabled) {
//            System.out.println("Навигационная система в норме");
//            return true;
//        } else {
//            System.out.println("Навигационная система неисправна!");
//            return false;
//        }
//    }
    public void igniteEngines() {
        System.out.println("Двигатели запущены.");
    }

    public void liftOff() {
        System.out.println("Ракета взлетела!");
    }

    public static void main(String[] args) {
        Rocket rocket1 = new Rocket(200, true);
        rocket1.launch();

        System.out.println();

        Rocket rocket2 = new Rocket();
        rocket2.launch();
    }
}
