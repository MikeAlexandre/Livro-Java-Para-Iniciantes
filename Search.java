public class Search {
    public static void main(String[] args) {
        int nums[] = {3,1, 0 ,  5, 22, 6, 5};
        int val = 5;
        boolean found = false;

        for(int x: nums){
            if (nums[x] == val) {
                found = true;
                break;
            }
        }
        if(found)
            System.out.println("Value found: " + val);
    }
}
