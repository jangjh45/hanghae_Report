package report5;

//6-7. 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.
//이 클래스의 멤버 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
//(단, 모든 병사의 공격력과 방어력은 같아야 한다.)

// 공격려과 방어력에 static을 붙어야 한다. 왜냐하면 마린이라는 병사의 공격력과 방어력은
// 같은 값으로 유지해야 하므로 static을 붙여야 한다.
// 위치좌표와 현재 체력은 각 병사마다 달라서 인스턴스 변수로 가야한다.
public class Report5_5 {
    public static void main(String[] args) {
        Marine marine = new Marine();
        marine.armorUp();
        marine.weaponUp();
        marine.move(2, 4);
        System.out.println("현재 좌표는 : " + marine.x + "," + marine.y);
        System.out.println("현재 공격력은 : " + marine.weapon + "입니다");
        System.out.println("현재 방어력은 : " + marine.armor + "입니다");

    }
}

class Marine {
    int x = 0, y = 0; //Marine의 위치좌표 (x,y)
    int hp = 60; //현재 체력
    static int weapon = 6; //공격력
    static int armor = 0; //방어력

    static void weaponUp() {
        weapon++;
    }

    static void armorUp() {
        armor++;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}