import java.util.Scanner;

public class ATM {

    private static double balance = 1000.00;
    private static final int PIN = 1234;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("       ATM'ye Hoş Geldiniz   ");
        System.out.println("=============================");

        System.out.print("PIN'inizi girin: ");
        int enteredPin = scanner.nextInt();

        if (enteredPin != PIN) {
            System.out.println("Hatalı PIN! İşlem sonlandırıldı.");
            return;
        }

        System.out.println("Giriş başarılı!");

        boolean running = true;
        while (running) {
            System.out.println("\n--- MENÜ ---");
            System.out.println("1. Bakiye Sorgula");
            System.out.println("2. Para Yatır");
            System.out.println("3. Para Çek");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminiz: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Bakiyeniz: " + balance + " TL");
                    break;

                case 2:
                    System.out.print("Yatırılacak miktar: ");
                    double deposit = scanner.nextDouble();
                    if (deposit <= 0) {
                        System.out.println("Geçersiz miktar!");
                    } else {
                        balance += deposit;
                        System.out.println(deposit + " TL yatırıldı. Yeni bakiye: " + balance + " TL");
                    }
                    break;

                case 3:
                    System.out.print("Çekilecek miktar: ");
                    double withdraw = scanner.nextDouble();
                    if (withdraw <= 0) {
                        System.out.println("Geçersiz miktar!");
                    } else if (withdraw > balance) {
                        System.out.println("Yetersiz bakiye!");
                    } else {
                        balance -= withdraw;
                        System.out.println(withdraw + " TL çekildi. Yeni bakiye: " + balance + " TL");
                    }
                    break;

                case 4:
                    System.out.println("Güle güle!");
                    running = false;
                    break;

                default:
                    System.out.println("Geçersiz seçim!");
            }
        }
        scanner.close();
    }
}