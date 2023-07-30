package tic_tak_too;

import java.util.ArrayList;
import java.util.Scanner;

public class display {
    public  static ArrayList<Character> value;
    Scanner scan =new Scanner(System.in);
    display(){
        value = new ArrayList<>();
        value.add('1');
        value.add('2');
        value.add('3');
        value.add('4');
        value.add('5');
        value.add('6');
        value.add('7');
        value.add('8');
        value.add('9');}

    public static void displayer(){
        // char a='1',b='2',c='3',d='4',e='5',f='6',g='7',h='8',i='9';

        System.out.println(value.get(0)+" | "+value.get(1)+" | "+value.get(2));
        System.out.println("---------");
        System.out.println(value.get(3)+" | "+value.get(4)+" | "+value.get(5));
        System.out.println("---------");
        System.out.println(value.get(6)+" | "+value.get(7)+" | "+value.get(8));
    }
    public void setValue_X(int valueee){
        if(value.get(valueee-1)!='Y' && value.get(valueee-1)!='X'){
            value.set(valueee-1,'X');
        displayer();}
        else{
            System.out.println("Enter the value is already exist Player X:");
            int x = scan.nextInt();
            setValue_X(x);
        }
        return;
    }
    public void setValue_Y(int valueee){
        if(value.get(valueee-1)!='X' && value.get(valueee-1)!='Y'){
        value.set(valueee-1,'Y');
        displayer();}
        else {
            System.out.println("Enter the value is already exist :");
            int y = scan.nextInt();
            setValue_Y(y);
        }
        return;
    }
    public boolean check(char ch){
        for(int i=0;i<3;i++){
        if(value.get(i*3) == ch && value.get((i*3)+1) == ch && value.get((i*3)+2) == ch){
            return true;
        }}
        for(int i=0;i<3 ;i++){
        if(value.get(i) == ch && value.get((i*3)+i) == ch && value.get((2*3)+i) == ch){
            return true;
        }}
        if(value.get(0) == ch && value.get(4) == ch && value.get(8) == ch){
            return true;
        }
        if(value.get(2) == ch && value.get(4) == ch && value.get(6) == ch){
            return true;
        }

        return false;
    }

}
