
public class _3_Reverse_bits {
    public static void main(String[] args) {
        long n = 964176192L;
        System.out.println(Integer.toBinaryString((int) n));

        System.out.println(reverseBits((int) n));
    }

    static int reverseBits(int n) {
        //String output = Integer.toBinaryString((int) n);
        //StringBuilder sb = new StringBuilder();
        //sb.append(output);
        //sb.reverse();
        ////System.out.println(sb.toString());
        //System.out.println(sb);
        //return Integer.parseInt(sb.toString(), 2);
                return Integer.toBinaryString(n).replaceAll("0", "").length();

    }
}
