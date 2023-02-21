package report5;

//6-5. 다음의 코드에 정의된 변수들을 종류별(클래스 변수,인스턴스 변수, 지역변수)로 구분해서 적으세요.
public class Report5_4 {
    public static void main(String[] args) {
        PlayingCard playingCard = new PlayingCard(1,2);
        System.out.println(playingCard.kind);

    }
}
class PlayingCard {
    int kind; // 인스턴스 변수
    int num; // 인슨턴스 변수
    static int width; // 클래스 변수;
    static int height; // 클래스 변수;

    PlayingCard(int k, int n){ // 지역변수
        this.kind = k; // 지역변수
        this.num = n; // 지역변수
    }

}

