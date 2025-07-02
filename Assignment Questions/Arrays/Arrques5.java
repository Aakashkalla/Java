package Arrays;

public class Arrques5 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 1, 4 };
        System.out.println(freqf(nums));
    }

    static int freqf(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        int sum = 0;
        int maxfreq = 0;
        for (int i = 0; i < nums.length; i++) {
            if(visited[i]) continue;
            int freq = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    freq = freq + 1;
                    visited[i]=true;
                }
            }
            if(freq==maxfreq){
                sum+=freq;
            }
            else if(freq>maxfreq){
                maxfreq = freq;
                sum = freq;
            }
            
        }
        return sum;
    }
}
