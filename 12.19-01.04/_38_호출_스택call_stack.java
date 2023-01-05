public class _38_호출_스택call_stack {
    public static void main(String[] args) {
// 스택(stack): 밑이 막힌 상자. 위에 차곡차곡 쌓인다.


//ch6-22 호출 스택(call stack)
        // 메서드 수행에 필요한 메모리가 제공되는 공간
        // 메서드가 호출되면, 호출스택에 메모리 할당, 종료되면 해제

        // 아래 있는 메서드가 위의 메서드를 호출한 것
        // 맨 위의 메서드 하나만 실행 중, 나머지는 대기중

        /*
          초기      =>        println 작성 시    => println 실행 후
        |      |             |         |            |      |
        |      |             |         |            |      |
        |      |             | println |            |      |
        | main |             | mian    |            | main |
        ㅡㅡㅡㅡㅡ             ㅡㅡㅡㅡㅡㅡ             ㅡㅡㅡㅡ

        */

    }
}
