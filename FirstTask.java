public class FirstTask {

    public static void main(String[] args) {
        if (check(105, 99)) System.out.println("The equipment WORKS fine");
        else System.out.println("The equipment DOESN'T work fine");


    }

    public static boolean check(int temprature1, int temprature2) {
        if (temprature1 > 100 && temprature2 < 100) return true;
        else return false;
    }
}
