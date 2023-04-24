import java.util.*;

public class day12q1{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n= input.nextInt();

        String tw = "2000 Notes";

        String fi = "500 Notes";

        String on = "100 Notes";

        String[] arr = new String[3];

        if(n>0&&n<20000){

            int two =0;

            int five=0;

            int one=0;

            int twoh=0;

            int note =0;

            if(n%100==0){

                note =(int)n/2000;

                if(note>0){

                    two =note;

                }

                n=n-note*2000;

                note=(int)n/500;

                if(note>0){

                    five=note;

                }

                n=n-500*note;

                note=(int)n/200;

                if(note>0){

                    twoh=note;

                }

                n=n-200*note;

                note=(int)n/100;

                if(note>0){

                    one=note;

                }

                if(one>=1){

                    System.out.println(one+" "+on);

                }

                if(twoh>=1){

                    System.out.println(twoh+" 200 Notes");

                }

                if(five>=1){

                    System.out.println(five+" "+fi);

                }

                if(two>=1){

                    System.out.println(two+" "+tw);

                }

            }

            else{

                System.out.println("Invalid Input");

            }

        }

        else{

            System.out.println("Invalid Input");

        }

    }
    }





