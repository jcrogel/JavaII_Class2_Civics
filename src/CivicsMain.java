import government.POTUS;

public class CivicsMain {
    public static void main(String args[]){
        POTUS p = POTUS.getInstance();
        System.out.println(p);
        p = POTUS.getInstance();
        System.out.println(p);
        POTUS.impeach();
        p = POTUS.getInstance();
        System.out.println(p);
        p = POTUS.getInstance();
        System.out.println(p);
    }
}
