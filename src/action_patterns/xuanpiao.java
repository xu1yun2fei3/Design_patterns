package action_patterns;

import java.util.Random;

public class xuanpiao {
    public static void main(String[] args) {
        Random n= new Random();
        int i=n.nextInt(2);
        if (i==0){
            System.out.println("曾泽伦");
        }else if(i==1){
            System.out.println("王睿");
        }else {
            System.out.println("许云飞");
        }

    }
}
