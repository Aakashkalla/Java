import java.util.Arrays;

public class DividePlayersEqualSkill {
    public static void main(String[] args){
        int[] skill = {1,2,3,4,5,3};
        System.out.println(dividePlayer(skill));
    }
    public static long dividePlayer(int[] skill){
        Arrays.sort(skill);
        int left=0;
        int right = skill.length-1;
        long chemistry = 0;
        int perfectskill = skill[left] + skill[right]; 
        while(left<right){
            if(perfectskill==skill[left] + skill[right]){
                chemistry = chemistry + (skill[left] * skill[right]);
                left++;
                right--;
            }
            else{
                return -1;
            }     
        }
        return chemistry;
    }
}
