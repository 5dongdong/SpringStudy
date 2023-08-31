package hello.core.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService(); //static 영역에 이해가 안가면 따로 다시 공부하자

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService(){

    }

    public void logic() {
        System.out.println("싱글톤 객체 로작 호출");
    }

}
