package Jobsheet_11;
import java.util.Scanner;

public class Kasus13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan ukuran : ");
        int ukuran = sc.nextInt();

        for (int i = 0; i < ukuran; i++) {
            for (int j = 0; j < ukuran; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

