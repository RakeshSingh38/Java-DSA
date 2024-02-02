
public class _2_1_maximum_wealth_of_a_person_optimized_code {

    public static void main(String[] args) {
        int[][] nums = {
                { 1, 2, 3, 4 },
                { 4, 6, 7 },
                { 4, 3, 5, 3, 5, 3, 5 }
        };
        System.out.println(maximumWealth(nums));
        //int java;
        //System.out.println(java);
    }

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] person : accounts) {
            int sum = 0;
            for (int account : person) {
                //System.out.println([person][accounts]);
                sum += account;
            }
            if (sum > ans)
                ans = sum;
        }
        return ans;
    }

}
