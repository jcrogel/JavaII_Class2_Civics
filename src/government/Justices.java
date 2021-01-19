package government;

public class Justices {
    private static Justices instance;
    static int i = 1;

    private Justices(){
    }

    public void setJustices(int number_input){
        i = number_input;
    }

    public static Justices getInstance(){
        if (i <= 9){
            System.out.println("The Justices no." + i + " :");
            instance = new Justices();
//            i++;
        } else {
            System.out.println("You've already had 9 justices!");
            System.out.println("You cannot add more!");
        }
        return instance;
    }
}
