import java.util.Random; //import random

public class DrunkardsWalk {
    public static void main(String args[]){
        Random rand=new Random();
        System.out.println("A drunkard stumbles by ... Let's see where he goes!");
        int x=0;
        int y=0;
        for(int count=0; count<100; count++){
            int direction=rand.nextInt(4);
            if(direction==0){
                //south
                y=y-1;
                System.out.println("He moves south, his location is now: ("+x+" , "+y+")");
            }
            else if(direction==1){
                //west
                x=x-1;
                System.out.println("He moves west, his location is now: ("+x+" , "+y+")");
            }
            else if(direction==3){
                //north
                y=y+1;
                System.out.println("He moves north, his location is now: ("+x+" , "+y+")");
            }
            else{ //direction==4
                //east
                x=x+1;
                System.out.println("He moves east, his location is now: ("+x+" , "+y+")");
            }
        }
        System.out.println("The final location of the drunkard is: ("+x+" , "+y+")");
    }
}
