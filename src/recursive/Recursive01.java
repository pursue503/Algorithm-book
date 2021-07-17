package recursive;

/**
 *
 * 재귀 함수 01
 *
 * 100까지 더하기
 *
 */
public class Recursive01 {


    public static void main(String[] args) {
        Recursive01 recursive01 = new Recursive01();
        recursive01.recursive(1);
    }

    public void recursive(int i) {

        if(i == 100) {
            return;
        }

        System.out.println(i + "번째 재귀 함수에서 " + (i + 1) + "번째 재귀함수를 호출합니다.");
        recursive(i + 1);
        System.out.println(i + "번째 재귀 함수를 종료합니다.");
    }


}
