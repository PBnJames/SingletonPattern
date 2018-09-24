public class SingletonDoubleCheckedLockingMethod {
    private volatile static SingletonDoubleCheckedLockingMethod uniqueSingletonDoubleCheckedLockingMethod;

    private SingletonDoubleCheckedLockingMethod(){}

    public static SingletonDoubleCheckedLockingMethod getInstance(){
        if(uniqueSingletonDoubleCheckedLockingMethod == null){
            synchronized (SingletonDoubleCheckedLockingMethod.class){
                if(uniqueSingletonDoubleCheckedLockingMethod == null){
                    uniqueSingletonDoubleCheckedLockingMethod = new SingletonDoubleCheckedLockingMethod();
                }
            }
        }
        return uniqueSingletonDoubleCheckedLockingMethod;
    }
}
