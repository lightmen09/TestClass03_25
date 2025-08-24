public class LengthAnalize {
    public static void main(String[] args) {
        int vozrast = 80;

        if (vozrast > 18) {
            if(vozrast < 70 ) {
                System.out.println("Доступ предоставлен");
            }
            else {
                System.out.println("Отказ в доступе");
            }
        } else {
            System.out.println("Отказ в доступе");

        }
    }
}