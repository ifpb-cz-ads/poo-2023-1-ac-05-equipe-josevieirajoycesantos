import java.util.Scanner;

public class BMExercicio07 {
    public static void main(String[] args) {
        int x, y=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um valor para X: ");
        x = scanner.nextInt();

        while(x>1){
            if (x % 2 == 0) { // se x for par
                y = x / 2;
            } 
            else { // se x for impar
                y = 3 * x + 1;
            }
            System.out.println(y); // imprime y
            x=y; // iguala x a y
        }
    }
}
