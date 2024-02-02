
public class _1_masking {
    public static void main(String[] args) {
        int and = 36;

        // 1. Set the ith bit
        System.out.println("Setting the ith bit\n");
        int i = 3;
        int mask = 1 << i;
        System.out.println(Integer.toBinaryString(mask));
        System.out.print("Mask to switch ON the ith bit: ");
        System.out.println(mask | and);
        // 1st we make a mask of 1 and shift it by given i
        // then we ( OR ) it with the mask

        // 2. Unset the ith bit
        System.out.println("\nUnsetting the ith bit\n");
        int or = 36;
        i = 5;
        mask = ~(1 << i);
        System.out.println(Integer.toBinaryString(mask));
        System.out.print("Mask to switch OFF the ith bit: ");
        System.out.println(mask & or);

        // 1st we make a mask of 1 and shift it by given i 
        // then we take the complement of the mask and then ( AND ) it with the number

        // toggle the ith bit
        System.out.println("\nToggling the ith bit\n");
        int xor = 36;
        i = 5;

        int tmask = 1 << i;

        // 1st we make a mask of 1 and shift it by given i
        // then we ( XOR ) it with the mask
        System.out.println(Integer.toBinaryString(tmask));
        System.out.println(xor ^ tmask);

        // check if the ith bit is set or not

        System.out.println("\nChecking if the ith bit is set or not\n");
        int check = 36;
        i = 5;
        mask = 1 << i;
        System.out.println(Integer.toBinaryString(mask));
        // 1st we make a mask of 1 and shift it by given i
        // then we ( AND ) it with the mask
        if ((check & mask) != 0)
            // can also be written as (check & mask) == 0
            System.out.println("The ith bit is set");
        else
            System.out.println("The ith bit is not set");
        //System.out.println((check & mask) != 0);

    }
}
