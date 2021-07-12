package greedy;

/**
 *
 * p.87
 *
 * 거스름 돈
 *
 */


/*

    500 , 100, 50, 10 원의 동전이 무한히  존재할때
    손님에게 거슬러 줘야할 돈이 n 일때 거슬러 줘야 할 동전의 최소 개수를 구하라

    n 은 10의 배수다

 */

public class Greedy01 {

    public static void main(String[] args) {

        System.out.println(solution(1260));
    }

    public static int solution(int n) {

        if(n == 500 || n == 100 || n == 50 || n ==10) { // 딱 맞아 떨어지는것들
            return 1;
        }

        int[] moneys = {500,100,50,10};


        int answer = 0;

        for(int i=0; i<moneys.length; i++) {

            int share = n / moneys[i];

            n -= moneys[i] * share;

            answer += share;
        }

        return answer;
    }

}
