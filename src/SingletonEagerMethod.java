public class SingletonEagerMethod {
    private static SingletonEagerMethod uniqueSingletonEagerMethod = new SingletonEagerMethod();

    private SingletonEagerMethod(){}

    public static synchronized SingletonEagerMethod getInstance(){
        return uniqueSingletonEagerMethod;
    }
}
