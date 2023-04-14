import java.util.Random;
import java.util.Scanner;

class Game
{
    int computer;
    public Game()
    {
        Random rand = new Random();
        computer = rand.nextInt(100);
        System.out.println("Guess the Number from 1 to 100");
    }
    public int computerNo()
    {
        return  computer;
    }
}
public class GuessNum
{
    static int takeUserInput()
    {
        int user;
        System.out.println("Enter ");
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
        return  user;
    }

    static void  isCorrectNumber(int i, int j)
    {
        if(i==j)
        {
            System.out.println("Correct No. Guess");
        } else if (i>j)
        {
            System.out.println("Your No. is Big than computer No.");
        }
        else
        {
            System.out.println("Your No. is small than computer No.");
        }
    }
    public  static  void  main(String Arg[])
    {
        int user=0, computer =0, iteration = 0;
        Game g = new Game();
        do
        {
            user = takeUserInput();
            computer =g.computerNo();
            isCorrectNumber(user,computer);
            iteration++;
        }while (user!=computer);
        System.out.println("YOU GUESSED NUMBER IN "+ iteration+" ITERATIONS");

    }
}
