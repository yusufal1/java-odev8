import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1, n2, islemTuru;
        int secim;

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");

        System.out.print("Seçiminiz :");
        secim = input.nextInt();

        System.out.print("1.sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("2.sayıyı giriniz: ");
        n2 = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1*n2);
                break;
            case 4:
                if (n2 != 0)
                    System.out.println(n1/n2);
                else
                    System.out.println("Bir sayıyı 0'a bölemezsiniz!");
                break;
            default:
                System.out.println("Bir sorun oluştu!");
        }

    }
}