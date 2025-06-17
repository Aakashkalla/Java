class RichCusWea {
    public static void main(String[] args) {
        int [][] accounts = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0;i<accounts.length;i++){
            int sum = 0;
            for(int j = 0;j<accounts[i].length;j++){
                 sum = sum + accounts[i][j];
            }
            //  max = Math.max(max,sum);
            if(sum>max){
                max = sum; 
            }
            
        }
        return max;
    }
}