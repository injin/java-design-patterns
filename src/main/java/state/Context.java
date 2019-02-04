package state;

// 금고의 상태를 관리하고 경비센터와 연락을 취하는 인터베이스
public interface Context {
    void setColock(int hour);               // 시간 설정
    void changeState(State state);          // 상태 전환 
    void callSecurityCenter(String msg);    // 경비센터 호출
    void recordLog(String msg);             // 경비센터 기록
}
