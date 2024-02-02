public class _2_maximum_wealth_of_a_person {

    public static void main(String[] args) {
        int nums[][]={
        {1,2,3,4},
        {4,6,7}
    };
    System.out.println(maximumWealth(nums));
}

    static int maximumWealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum=0;
            for (int account = 0; account < accounts[person].length; account++) {
                //System.out.println([person][accounts]);
                sum+=accounts[person][account];
            }
            if(sum>ans) ans= sum;
        }
        return ans;
    }


}
