import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * @author Josh Elliott
 * @version 11/7/17
 */

public class PowerBallTicket
{
    /**
     * main method.
     * @param args String[]
     * @throws IOException throws
     */
    
    public static void main(String[] args) throws IOException
    {
        Scanner kb = new Scanner(System.in);
        
               
        System.out.println("What is the file name?");
        String name = kb.nextLine();
        
        System.out.println("How many PowerBall tickets do you want?");
        int count = Integer.parseInt(kb.nextLine());
        
        PowerBall pb = new PowerBall();
        
        PrintWriter writer = new PrintWriter(name);
        
        while (count > 0)
        {
            pb.generateLotteryPicks();
            writer.println(pb.toString());
            count--;
        }
        
       
        writer.close();
               
    }
}
