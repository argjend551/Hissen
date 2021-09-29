import java.util.Random;
import java.util.Scanner;

public class Menu {
    Scanner scan = new Scanner(System.in);
    int rand;
    public int MainMeny(){
        System.out.println("1: Press button to call the elevator");

        int Choice = scan.nextInt();
        switch(Choice){
            case 1:
                CallElevator();
                break;


        }
return Choice;
    }


    public void CallElevator(){
        setLevel(Randomlevel(1,5));
        System.out.println("Elevator is at level " + getLevel());
        System.out.println("Elevator coming down...");

        for (int i = getLevel(); i > 0; i--) {
            System.out.println("Level: " + i + "...");
        }

        Lobby level1 = new Lobby();
        level1.Mainmenu();
    }

    public int getLevel() {

        return rand;
    }

    public void setLevel(int num) {

        rand = Randomlevel(1,5);
    }




    public int Randomlevel(int Min, int Max)
    {
        return (int) (Math.random()*(Max-Min))+Min;
    }





    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.MainMeny();
    }
}
