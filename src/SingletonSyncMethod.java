public class SingletonSyncMethod {
    private static SingletonSyncMethod uniqueSingletonSynchMethod;

    private SingletonSyncMethod(){}

    public static synchronized SingletonSyncMethod getInstance(){
        if(uniqueSingletonSynchMethod == null){
            uniqueSingletonSynchMethod = new SingletonSyncMethod();
        }
        return uniqueSingletonSynchMethod;
    }

}
