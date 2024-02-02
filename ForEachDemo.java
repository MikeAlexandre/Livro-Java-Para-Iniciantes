public class ForEachDemo {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9,};
        int sum = 0;


        // usa o laço for de estilo for-each para exibir e somar os valores.
        for (int x: nums) {
            System.out.println("Value is: " + x);
            sum += x;

        }
    }
}
