import java.util.Scanner;

public class Level2 implements Levels{
    Scanner scan = new Scanner(System.in);
    public String doors = "close";

    public Level2() {
        System.out.println("You are at level 2 now ");

    }

    public void Mainmenu() {
        while (true) {
            System.out.println("Choose what you want to do");
            System.out.println("1: Open doors");
            System.out.println("2: Exit elevator");
            System.out.println("3: Go to another level");
            System.out.println("4: Close doors");
            System.out.println("5: What level am i on?");
            System.out.println("6: Exit program");
            int Choice = scan.nextInt();

            switch (Choice) {
                case 1:
                    Doors("open");
                    break;

                case 2:
                    ExitElevator();
                    break;
                case 3:
                    level();
                    break;
                case 4:
                    Doors("close");
                    break;
                case 5:
                    FloorLevelMessage();
                    break;
                case 6:
                    System.exit(5);
            }
            Choice = scan.nextInt();

        }
    }


    public String Doors(String doors){
        this.doors = doors;

        if(doors.equals("open")){
            System.out.println("Doors are open..");
            Mainmenu();
        }else if (doors.equals("close")){
            System.out.println("Doors are closed.");
            Mainmenu();

        }
        return doors;
    }


    public void EnterElevator(){
        if(doors.equals("open")){
            System.out.println("Entering the elevator");
            System.out.println("Choose what you want to do");
            System.out.println("1: go to level 1");
            System.out.println("2: go to level 3");
            System.out.println("3: go to level 4");
            System.out.println("4: Exit the elevator");
            int Choice = scan.nextInt();
            switch(Choice){
                case 1:
                    System.out.println("Going down to level 1....");
                    Lobby level1 = new Lobby();
                    level1.level();
                case 2:
                    System.out.println("Going up to level 3....");
                    Level3 level3 = new Level3();
                    level3.Mainmenu();
                case 3:
                    System.out.println("Going up to level 4....");
                     Level4 level4 = new Level4();
                     level4.Mainmenu();

                case 4:
                    ExitElevator();
            }
        } else{
            System.out.println("Doors are Closed! you need to open the doors first.");



        }
    }

    public void ExitElevator() {
        if(doors.equals("open")){
            System.out.println("Exiting the elevator");
            System.out.println("Choose what you want to do");
            System.out.println("1: Enter elevator");
            System.out.println("2: Exit program.");

            int Choice = scan.nextInt();
            switch(Choice){
                case 1:
                    EnterElevator();
                case 2:
                    System.exit(2);
            }
             }else{
            System.out.println("Cannot exit the elevator, you need to open the doors.");
            Mainmenu();
        }

    }

    public void level(){

        System.out.println("1: go to level 1");
        System.out.println("2: go to level 3");
        System.out.println("3: go to level 4");
        System.out.println("4: Exit the elevator");
        int Choice = scan.nextInt();
        switch(Choice){
            case 1:
                System.out.println("Auto-Closing doors...");
                System.out.println("Going down to level 2....");
                Lobby level1 = new Lobby();
                level1.level();
            case 2:
                System.out.println("Auto-Closing doors...");
                System.out.println("Going up to level 3....");
                Level3 level3 = new Level3();
            case 3:
                System.out.println("Auto-Closing doors...");
                System.out.println("Going up to level 4....");
                Level4 level4 = new Level4();

            case 4:
                ExitElevator();
            }
    }


    @Override
    public int FloorLevel() {
        return 1;
    }

    @Override
    public String FloorLevelMessage() {
        return "You are at level 1";
    }



}

