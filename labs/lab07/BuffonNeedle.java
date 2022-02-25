import java.util.Random;

public class BuffonNeedle {
    public static void main(String args[]){
        Random rand=new Random();
        int hits=0; //this will keep track of the hits
        for(int count=0; count<10000; count++){
            double lower=(rand.nextDouble()*2);
            double angle=(rand.nextDouble()*180);
            angle=(Math.PI/180)*angle;
            double higher=lower+Math.sin(angle);
            if(higher>=2){
                hits++;
            }
        }
        System.out.println("After 10,000 tried, the needle hit "+hits+" times.");
        System.out.println("The quotient of tries/hits is "+(10000.0/hits));
    }
}
