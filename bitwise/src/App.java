import java.util.Scanner;

public class App {
    static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);

        System.out.print("Digite um valor ");
        int num = Integer.parseInt(sc.nextLine());

        int mask = 0b10000;

        if((num & mask) != 0 ){
            System.out.println("6th bit is true!");
        }else {
            System.out.println("6th bit is false!");
        }
        sc.close();
    }
}
