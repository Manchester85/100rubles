public class Main {
    public static void main(String[] args) {
        int account = 100;
        int amount = 1500;
        if (amount > 1000) {
            int bonus = amount * 1 / 100;
            System.out.println(account + amount + bonus);
        } else {
            System.out.println(account + amount);
        }
    }
}
