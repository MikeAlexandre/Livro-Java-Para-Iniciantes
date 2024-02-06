public class StringArrays {
    public static void main(String[] args) {
        String str[] = {"This", "is", "a", "test."};

        System.out.println("Original Array: ");
        for(String a: str)
            System.out.print(a + " ");;
        System.out.println("\n");

        // altera um string
        str[1] = "was";
        str[3] = "test, too!";

        System.out.println("Modifiel array: ");
        for(String a : str)
            System.out.print(a + " ");
        System.out.println("\n");
    }
}
