package government;

public class Congress {
    private static Congress instance;
    private static String member = null;
    static int i = 1;
    static int j = 2;

    private Congress(){

    }

    public void setMember(String member_input){
        member = member_input;
    }

    public void setSenator(){
        i++;
    }
    public void setCongressman(){
        j++;
    }

    public static Congress getInstance(){
        if  (member == null){
            instance = new Congress();
        } else if (member.equals("Senator")){
            int max_senator = 100;
            if (i <=max_senator){
                System.out.println("This is Senator no." + i);
                instance = new Congress();
                System.out.println(instance);
                i++;
            } else{
                System.out.println("You cannot have more than "+ max_senator +" senators!");
            }

        } else if (member.equals("Congressman")) {
            int max_congressman = 453;
            if (j <= max_congressman){
                System.out.println("This is Congressman no." + j);
                instance = new Congress();
                System.out.println(instance);
                j++;
            } else{
                System.out.println("You cannot have more than " + max_congressman + " congressmen!");
            }

        }

        return instance;
    }


}
