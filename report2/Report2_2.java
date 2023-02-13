package report2;
//3-2. 다음 연산의 결과와 그 이유를 적으세요.
public class Report2_2 {
    public static void main(String[] args){
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);
        // x는 0보다 작지도 않고 2보다 크지도 않는데 y가 5랑 같거나 큰 or조건에 하나라도 만족해서 true이다.
        System.out.println(y += 10 - x++);
        // x++ 부분은 후위연산이여서 먼저 값이 적용 후 +1이 됨. 5+8 이됨
        System.out.println(x += 2);
        // 바로 위 코드에서 x가 증감연산으로 3이 되고 +2가 되어 5가 됨.
        System.out.println(!('A' <= c && c <= 'Z'));
        // c는 'A' 아스티코드 65이다. and연산 으로 A와 A는 같고 A보다 Z가 큰게 맞아서 true이다.
        // 하지만 NOT연산 !로 인해 true가  false로 바뀜.
        System.out.println('C' - c);
        // C는 아스키코드 67이다. A는 아스키코드 65이다. 67-65 = 2이다.
        System.out.println('5' - '0');
        // 5는 아스키코드 53이고 0은 아스키코드 48이다. 53-48 = 5이다.
        System.out.println(c + 1);
        // 'A'는 아스키코드 65이다. 65+1 = 66이다.
        System.out.println(++c);
        // 전위연산으로 65+1이 되어 B가 된다.
        System.out.println(c++);
        // 후위연산으로 B값이 출력되고 +1이 된다.
        System.out.println(c);
        // 위에 코드에서 +1되어(66+1) 아스키코드67의 C가 나온다.
    }
}
