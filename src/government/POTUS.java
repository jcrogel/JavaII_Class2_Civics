package government;

public class POTUS { // Singleton
    private static POTUS instance;

    private POTUS(){

    }

    public static POTUS getInstance(){
        if(instance == null){
            instance = new POTUS();
        }
        return instance;
    }

    public static void impeach(){
        instance = null;
    }

}
