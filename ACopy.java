// Usa a variável length para ajudar na cópia de um array
public class ACopy {
    public static void main(String[] args) {
        int i;
        int nums1[] = new int[10];
        int nums2[] = new int[10];

        for(i = 0; i < nums1.length; i ++)
            nums1[i] = i;

        // copia nums1 para nums2
        if(nums2.length >= nums1.length) // usa length para comparar tamanhos de arrays
            for(i = 0; i < nums1.length; i ++)
                nums2[i] = nums1[i];
        // exibe nums2
        System.out.print("Here is nums2: ");
        for(i = 0; i < nums2.length; i ++)
            System.out.print(nums2[i] + " ");
        // exibe nums1
        System.out.println();
        System.out.print("Here is nums1: ");

        for(i = 0; i < nums1.length; i ++)
            System.out.print(nums1[i] + " ");
    }

}
