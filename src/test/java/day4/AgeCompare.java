package day4;

public class AgeCompare {
    public static void main(String[] args) {

        int ageAlice = 25;
        int ageBob = 30;

        String result = (ageAlice > ageBob) ? "Alice" :
                        (ageBob > ageAlice) ? "Bob":
                        "Same";
        System.out.println(result);
    }


}

