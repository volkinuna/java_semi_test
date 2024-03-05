package java_02.quiz3;

public class Marine {
    /*
    다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다.이 클래스의 멤버중에 static을 붙여야
    하는 것은 어떤 것들이고 그 이유는 무엇인지 서술하세요. (단, 모든 병사의 공격력과 방어력은 같아야
    한다.)(10점)
    */
    int x = 0, y = 0; // Marine의 위치좌표(x,y)
    int hp = 60; // 현재 체력
    static int weapon = 6; // 공격력
    static int armor = 0; // 방어력
    static void weaponUp() {
        weapon++;
    }
    static void armorUp() {
        armor++;
    }
    void move(int x, int y) {
        this.x = x; // this.x는 인스턴스 변수, x는 지역변수
        this.y = y; // this.y는 인스턴스 변수, y는 지역변수
    }

    // 현재 static이 붙은 필드와 메소드
    // 객체 생성 없이 사용 가능한 키워드인 static는
    // 공유해서 사용해야하는 필드와 메소드에 붙여서 사용한다.
}
