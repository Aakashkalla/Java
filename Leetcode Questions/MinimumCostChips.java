public class MinimumCostChips {
    public static void main(String[] args){
        int[] position = {1,2,3};
        System.out.println(minchips(position));
    }
    public static int minchips(int[] position){
        int odd = 0;
        int even  = 0;
        for(int i = 0; i<position.length;i++){
            if(position[i]%2==0){
                even++;
            }   
            else{
                odd++;
            }
        }
        return Math.min(odd,even);
    }
}
