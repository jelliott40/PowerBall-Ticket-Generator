import java.util.Random;


/**
 * @author Josh Elliott
 * @version 11/7/17
 */

public class PowerBall
{
    public static final int MAX_LOTTERY_NUMBER = 59;
    public static final int MAX_POWER_BALL_NUMBER = 35;
    private Random randomGenerator;
    private int number0;
    private int number1;
    private int number2;
    private int number3;
    private int number4;
    private int powerBall;
    
    /**
     * constructor.
     * 
     */
    
    public PowerBall()
    {
        randomGenerator = new Random();
        number0 = 0;
        number1 = 0;
        number2 = 0;
        number3 = 0;
        number4 = 0;
        powerBall = 0;
    }
    
    /**
     * generateLotteryNumber.
     * @return int
     */
    
    public int generateLotteryNumber()
    {
        int n = randomGenerator.nextInt(MAX_LOTTERY_NUMBER) + 1;
        return n;
    }
    
    /**
     * generatePowerBallNumber.
     * @return int
     */
    
    public int generatePowerBallNumber()
    {
        int p = randomGenerator.nextInt(MAX_POWER_BALL_NUMBER) + 1;
        return p;
    }
    
    /**
     * getRandomGenerator.
     * @return int
     * 
     */
    
    public Random getRandomGenerator()
    {
        return randomGenerator;
    }
        
    /**
     * setRandomGenerator.
     * @param r Random
     */
    
    public void setRandomGenerator(Random r)
    {
        randomGenerator = r;
    }
    
    /**
     * getNumber0.
     * @return int
     */
    
    public int getNumber0()
    {
        return number0;
    }
    
    /**
     * getNumber1.
     * @return int
     */
    
    public int getNumber1()
    {
        return number1;
    }
    
    /**
     * getNumber2.
     * @return int
     */
    
    public int getNumber2()
    {
        return number2;
    }
    
    /**
     * getNumber3.
     * @return int
     */
    
    public int getNumber3()
    {
        return number3;
    }
    
    /**
     * getNumber4.
     * @return int
     */
    
    public int getNumber4()
    {
        return number4;
    }
    
    /**
     * getPowerBall.
     * @return int
     */
    
    public int getPowerBall()
    {
        return powerBall;
    }
    
    /**
     * setNumber0.
     * @param n0 int
     */
    
    public void setNumber0(int n0)
    {
        number0 = n0;
    }
    
    /**
     * setNumber1.
     * @param n1 int
     */
    
    public void setNumber1(int n1)
    {
        number1 = n1;
    }
    
    /**
     * setNumber2.
     * @param n2 int
     */
    
    public void setNumber2(int n2)
    {
        number2 = n2;
    }
    
    /**
     * setNumber3.
     * @param n3 int
     */
    
    public void setNumber3(int n3)
    {
        number3 = n3;
    }
    
    /**
     * setNumber4.
     * @param n4 int
     */
    
    public void setNumber4(int n4)
    {
        number4 = n4;
    }
    
    /**
     * setPowerBall.
     * @param pb int
     */
    public void setPowerBall(int pb)
    {
        powerBall = pb;
    }
    
    /**
     * isDuplicateLotteryNumber.
     * @return int
     * @param newNumber int
     */
    
    public boolean isDuplicateLotteryNumber(int newNumber)
    {
        return (newNumber == number0 || newNumber == number1 
                || newNumber == number2 || newNumber == number3
                || newNumber == number4);
    }
    
    /**
     * nextLotteryNumber.
     * @return int
     */
    
    public int nextLotteryNumber()
    {
        int newNumber = generateLotteryNumber();
        
        while (isDuplicateLotteryNumber(newNumber))
        {
            newNumber = generateLotteryNumber();
        }
        
        return newNumber;
    }
    
    /**
     * reset.
     */
    
    public void reset()
    {
        number0 = 0;
        number1 = 0;
        number2 = 0;
        number3 = 0;
        number4 = 0;
        powerBall = 0;
    }
    
    /**
     * generateLotteryPicks.
     */
    
    public void generateLotteryPicks()
    {
        reset();
        powerBall = generatePowerBallNumber();
        number0 = nextLotteryNumber();
        number1 = nextLotteryNumber();
        number2 = nextLotteryNumber();
        number3 = nextLotteryNumber();
        number4 = nextLotteryNumber();
    }
    
    /**
     * toString.
     * @return String
     */
    
    public String toString()
    {
        return String.format("%02d, %02d, %02d, %02d, %02d, "
            + "Powerball %02d", number0, number1, number2, number3,
            +number4, powerBall); 
    }
}
