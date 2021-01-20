import government.Congress;
import government.Justices;
import government.POTUS;

import java.util.Scanner;

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

        int k = 1;
        while (k<=553){
            Scanner myObj = new Scanner(System.in);
            String member_input = myObj.nextLine();
            Congress c = Congress.getInstance();
            c.setMember(member_input);
            if (k ==1){
                if ((member_input.equals("Senator")) || (member_input.equals("Congressman"))){
                    System.out.println("The "+ member_input + " no.1:");
                    System.out.println(c);
                    if (member_input.equals("Senator")){
                        c.setSenator();
                    } else if (member_input.equals("Comgressman")){
                        c.setCongressman();
                    }
                } else {
                    System.out.println("Please enter 'Senator' or 'Congressman':");
                    k--;
                }
            } else {
            }
            k++;
        }

        int m = 2;
        while (m<=11){
            Justices j = Justices.getInstance();

            System.out.println(j);
            j.setJustices(m);
            m++;
        }

    }
}
