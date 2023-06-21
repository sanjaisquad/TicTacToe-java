package tic_tak_too;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char a='y';


    while(a=='y') {
            System.out.println("Welcome to the tic tak tok game ......................");
            display n= new display();
            n.displayer();


            for (int i = 0; i < 9; i++) {
                if (i == 0 || (i & 1) != 1) {
                    System.out.println("player X :");
                    int x = scan.nextInt();
                    n.setValue_X(x) ;
                    if (i >= 4) {
                        if (n.check('X')) {
                            System.out.println("player X win the match \n.......................................");
                            break;
                        }
                    }
                } else {
                    System.out.println("player Y:");
                    int y = scan.nextInt();
                    n.setValue_Y(y);
                    if (i >= 5) {
                        if (n.check('Y')) {
                            System.out.println("player y win the match \n...........................................");
                            break;
                        }
                    }
                }
                
            }

            System.out.println("Do you want to continue :");
            a=scan.next().charAt(0);


        }

    }

}
