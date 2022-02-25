import java.util.Random;

public class DiceGame {
    public static void main(String args[]){
        Random rand=new Random();
        int numof66=0; //the number of times a double six is rolled
        int numof6=0; //the number of times a six appears in a 4 roll
        int finalcount=0; //24 gamble
        int finalcount2=0; //4 gamble
        int countof6=0; //if you get a 6 in 4 rolls

        for(int i=0; i<1000000; i++){
            for(int j=0; j<24; j++){ //24 gamble
                int jimmydice=rand.nextInt(6); //0,1,2,3,4,5,6
                int happydice=rand.nextInt(1, 7);
                if(jimmydice==5 && happydice==6){ //double 6
                    numof66++;
                }
            }
            if(numof66>=1){ //if there exists a double 6
                finalcount++; //you get a dollar :D
            }
            numof66=0;
            for(int k=0; k<4; k++){ //4 gamble
                int onedice=rand.nextInt(6); //0,1,2,3,4,5,
                if(onedice==5){
                    countof6++;
                }
            }
            if(countof6>=1){ //if a 6 appears
                finalcount2++;
            }
            countof6=0;
        }
        System.out.println("After rolling a pair of dice 24 times a million times, I won $"+finalcount);
        System.out.println("This means that I won "+finalcount+" times, and lost "+(1000000-finalcount)+" times");
        System.out.println("After rolling a singular dice 4 times a million times, the number 6 appeared "+finalcount2+" times");
        System.out.println("This means that I won "+finalcount2+" times, and lost "+(1000000-finalcount2)+" times");
    }
}
