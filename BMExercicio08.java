public class BMExercicio08 {
    public static void main(String[] args) {
        int divisor=3;
        System.out.println("Os multiplos de " + divisor + " entre 1 e 100 são: ");
        for (int i = 0; i <= 100; i++) {
            if(i%divisor == 0){
                System.out.print(i+ ", ");
            }
        }
        
    }
}
