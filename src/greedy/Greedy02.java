package greedy;

import java.util.Arrays;

public class Greedy02 {

    public static void main(String[] args) {

        System.out.println(solution(new int[]{2,4,5,4,6}, 8, 3));
        System.out.println(solution(new int[]{3,4,3,4,3}, 7, 2));

    }

    public static int solution(int[] nums, int m,  int k) {

        int answer = 0;

        Arrays.sort(nums);

        int first = nums[nums.length -1];
        int second = nums[nums.length -2];
        boolean flag = true;
        while (m >= 0 ) {
            if(m > k) {
                if(flag) {
                    answer += first * k;
                    m -= k;
                    flag = false;
                } else {
                    answer += second;
                    m -= 1;
                    flag = true;
                }

            } else {
                if(flag) {
                    answer += first * m;
                    m -= k;
                    flag = false;
                } else {
                    answer += second;
                    m -= 1;
                    flag = true;
                }
            }
        }

        return answer;
    }


}
