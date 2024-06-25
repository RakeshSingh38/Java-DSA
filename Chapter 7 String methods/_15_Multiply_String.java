import java.math.BigInteger;

public class _15_Multiply_String {
    public static void main(String[] args) {
        //System.out.println(multiply("6913259244", "71103343"));
        System.out.println(multiplyString("6913259244", "71103343"));
    }

    public static String multiply(String num1, String num2) {
        BigInteger num3 = new BigInteger(num1);
        BigInteger num4 = new BigInteger(num2);

        BigInteger ans = num3.multiply(num4);

        return ans.toString();
    }

    public static String multiplyString(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int n = num1.length();
        int m = num2.length();
        int[] result = new int[n + m];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + result[i + j + 1];
                result[i + j] += sum / 10;
                result[i + j + 1] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++) {
            if (i == 0 && result[i] == 0) {
                continue;
            }
            sb.append(result[i]);
        }
        return sb.toString();
    }
}
