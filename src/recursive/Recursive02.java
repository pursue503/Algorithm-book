package recursive;

/**
 *
 *
 * 재귀함수02
 *
 * 팩토리얼
 *
 */

public class Recursive02 {

    public static void main(String[] args) {
        Recursive02 recursive02 = new Recursive02();
        System.out.println(recursive02.factorial(5));
        System.out.println(recursive02.recursiveFactorial(5));
    }

    public int factorial(int f) {

        int answer = 1;
        for (int i=1; i<=f; i++) {
            answer *= i;
        }

        return answer;
    }

    public int recursiveFactorial(int f) {

        if(f <= 1) {
            return 1;
        }

        return f * recursiveFactorial(f -1);
    }

}
