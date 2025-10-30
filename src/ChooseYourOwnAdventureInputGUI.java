import javax.swing.*;

public class ChooseYourOwnAdventureInputGUI {
    public static void main(String[] args)
    {

        boolean play = true;
        boolean game = false;
        boolean input;
        String choice1;
        String choice2;
        String choice3;
        String choice4;
        String choice5;
        String choice6;
        String choice7;



        while(play)
        {

            JOptionPane.showMessageDialog(null, "Welcome to Purdue as a student you will be navigating the complex life of college and have to make many decisions", "Purdue Adventure", JOptionPane.INFORMATION_MESSAGE);

            do{


                choice1 = JOptionPane.showInputDialog(null, "You are invited to go to third street during BGR by one of your friends do you accept? (y/n)", "Third Street",JOptionPane.QUESTION_MESSAGE);
                try {
                    if (choice1.equals("y") || choice1.equals("n")) {
                        input = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a valid input!", "Error: Invalid Input!", JOptionPane.ERROR_MESSAGE);
                        input = false;
                    }
                } catch (NullPointerException e){
                    System.out.println("Left With An Empty Message!");
                    input = true;
                    System.exit(0);

                }

            } while(!input);



            if (choice1.equals("y"))
            {
                do{

                    choice2 = JOptionPane.showInputDialog(null, "You have fun with your friends all night and get a few peoples instas but you are extremely tired the next morning when you have a 7:30 class.\n" +
                                    "Do you want to sleep in and skip class or go to class tired? (s/g)", "Skip Class or Go" ,JOptionPane.QUESTION_MESSAGE);
                    try {
                        if (choice2.equals("s") || choice2.equals("g")) {
                            input = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Please enter a valid input", "Error Invalid Input!", JOptionPane.ERROR_MESSAGE);
                            input = false;
                        }
                    } catch (NullPointerException e){
                        System.out.println("Left With An Empty Message!");
                        input = true;
                        System.exit(0);

                    }
                } while(!input);
                if(choice2.equals("s"))
                {
                    do{

                        choice3 = JOptionPane.showInputDialog(null, "You have a nice slumber put you wake up to a notification that says you got a 0 on a lecture quiz and you start off the year on a bad note with an F in a class\n" +
                                        "You then must decide should you go to your TA and beg for a grade change or go to your next class and move on (TA/mv)",
                                "TA or Move On",JOptionPane.QUESTION_MESSAGE);
                        try {
                            if (choice3.equals("TA") || choice3.equals("mv")) {
                                input = true;
                            } else {
                                JOptionPane.showMessageDialog(null, "Please enter a valid input", "Error Invalid Input!", JOptionPane.ERROR_MESSAGE);
                                input = false;

                            }
                        } catch (NullPointerException e){
                            System.out.println("Left With An Empty Message!");
                            input = true;
                            System.exit(0);

                        }

                    } while(!input);
                    if(choice3.equals("TA"))
                    {
                        JOptionPane.showMessageDialog(null,"You beg and plead with your TA but she says you missed the lecture so your grade won't change you walk away realizing you need to lock in and attend class",
                                "Begging and Pleading With TA", JOptionPane.INFORMATION_MESSAGE);

                        game = true;
                        while(game)
                        {
                            int choice = JOptionPane.showConfirmDialog(null, "Do you want to play again?","Play Again?", JOptionPane.YES_NO_OPTION);
                            if (choice == JOptionPane.YES_OPTION){
                                game = false;
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "Thanks for playing!","Goodbye",JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }

                        }

                    }
                    else if(choice3.equals("mv"))
                    {
                        JOptionPane.showMessageDialog(null,"You move on and head to your next classes and do great in them.\nYou also notice a career fair and go to that and get valuable experience talking to recruiters. \n Your college life is off to a great start",
                                "Career Fair Success", JOptionPane.INFORMATION_MESSAGE);

                        game = true;
                        while(game)
                        {
                            int choice = JOptionPane.showConfirmDialog(null, "Do you want to play again?","Play Again?", JOptionPane.YES_NO_OPTION);
                            if (choice == JOptionPane.YES_OPTION){
                                game = false;
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "Thanks for playing!","Goodbye",JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }

                        }
                    }



                }
                else if(choice2.equals("g"))
                {
                    do {

                        choice4 = JOptionPane.showInputDialog(null, "You go to your lecture and there's a surprise quiz since you were paying attention you ace it and start off the year with an A in your class\n" +
                                "One of your new friends in class offers a study session do you accept? (y/n)", "Study Session", JOptionPane.QUESTION_MESSAGE);
                        if (choice4.equals("y") || choice4.equals("n")){
                            input = true;
                        }
                        else {
                            JOptionPane.showMessageDialog(null, "Please enter a valid input!", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                            input = false;
                        }


                    } while(!input);
                    if(choice4.equals("y"))
                    {
                        JOptionPane.showMessageDialog(null,"You have a great time studying with your friends and you do great on your next quiz and midterm\\nYou feel confident with the start of your college life" );
                        game = true;
                        while(game)
                        {
                            int choice = JOptionPane.showConfirmDialog(null, "Do you want to play again?","Play Again?", JOptionPane.YES_NO_OPTION);
                            if (choice == JOptionPane.YES_OPTION){
                                game = false;
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "Thanks for playing!","Goodbye",JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }

                        }
                    }
                    else if(choice4.equals("n"))
                    {
                        JOptionPane.showMessageDialog(null, "You decide to just spend your time playing video games and not study for your big midterm you fail the midterm and your college career is off to a bad start"
                                , "Bad Start With Midterm", JOptionPane.INFORMATION_MESSAGE);

                        game = true;
                        while(game)
                        {
                            int choice = JOptionPane.showConfirmDialog(null, "Do you want to play again?","Play Again?", JOptionPane.YES_NO_OPTION);
                            if (choice == JOptionPane.YES_OPTION){
                                game = false;
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "Thanks for playing!","Goodbye",JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }

                        }
                    }
                }


            }

            else if(choice1.equals("n"))
            {
                do{
                    choice5 = JOptionPane.showInputDialog(null, "One of your other friends offer to go to the corec and get a late night pump do you accept? (y/n)"
                    ,"Late Night Pump",JOptionPane.QUESTION_MESSAGE);
                    if (choice5.equals("y") || choice5.equals("n")){
                        input = true;
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Please enter a valid input!",
                                "Invalid Input", JOptionPane.ERROR_MESSAGE);
                        input = false;
                    }

                } while(!input);
                if(choice5.equals("y"))
                {
                    do{
                        choice6 = JOptionPane.showInputDialog(null, "You get jacked with your friend and slam a bunch of protein drinks and then you see people playing basketball do you join? (y/n)"
                        , "Basketball",JOptionPane.QUESTION_MESSAGE);

                        if(choice6.equals("y") || choice6.equals("n"))
                        {
                            input = true;
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Please enter a valid input!",
                                    "Invalid Input", JOptionPane.ERROR_MESSAGE);
                            input = false;
                        }
                    } while(!input);
                    if(choice6.equals("y"))
                    {
                        JOptionPane.showMessageDialog(null, "You hoop hitting threes like curry and impress everyone as you hit the game winner and you made some new friends along the way"
                                , "Hooping", JOptionPane.INFORMATION_MESSAGE);

                        game = true;
                        while(game)
                        {
                            int choice = JOptionPane.showConfirmDialog(null, "Do you want to play again?","Play Again?", JOptionPane.YES_NO_OPTION);
                            if (choice == JOptionPane.YES_OPTION){
                                game = false;
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "Thanks for playing!","Goodbye",JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }

                        }
                    }
                    else if(choice6.equals("n"))
                    {   JOptionPane.showMessageDialog(null, "You decide to unlock your inner David Goggins and go for a 5 mile run late into the night running around the campus taking in the beautiful sights\nThis is the year where you become extremely fit"
                            , "David Goggins Unlocked", JOptionPane.INFORMATION_MESSAGE);

                        while(game)
                        {
                            int choice = JOptionPane.showConfirmDialog(null, "Do you want to play again?","Play Again?", JOptionPane.YES_NO_OPTION);
                            if (choice == JOptionPane.YES_OPTION){
                                game = false;
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "Thanks for playing!","Goodbye",JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }
                        }
                    }
                }
                else if(choice5.equals("n"))
                {
                    do{

                        choice7 = JOptionPane.showInputDialog(null, "You instead go to the dining hall and stuff your face full of Mexican food and ice cream \n " +
                                "You then decide whether to dance the night away or go back to your dorm (dance/dorm)",
                                "Dance or Dorm", JOptionPane.QUESTION_MESSAGE);


                        if(choice7.equals("dance") || choice7.equals("dorm"))
                        {
                            input = true;
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Please enter a valid input!",
                                    "Invalid Input", JOptionPane.ERROR_MESSAGE);
                            input = false;
                        }
                    } while(!input);
                    if(choice7.equals("dance"))
                    {
                        JOptionPane.showMessageDialog(null, "You griddy your way back to your dorm and everyone notices and celebrates in appreciation you're officaly the talk of the town in a good way"
                                , "Griddying", JOptionPane.INFORMATION_MESSAGE);

                        game = true;
                        while(game)
                        {
                            int choice = JOptionPane.showConfirmDialog(null, "Do you want to play again?","Play Again?", JOptionPane.YES_NO_OPTION);
                            if (choice == JOptionPane.YES_OPTION){
                                game = false;
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "Thanks for playing!","Goodbye",JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }

                        }
                    }
                    else if(choice7.equals("dorm"))
                    {
                        JOptionPane.showMessageDialog(null, "You go back to your dorm and relax and take a nice warm shower and hop on Fortnite with one of your boys from back home \n You will lock in tomorrow hopefully"
                                , "Fortnite and Chill", JOptionPane.INFORMATION_MESSAGE);

                        game = true;
                        while(game)
                        {
                            int choice = JOptionPane.showConfirmDialog(null, "Do you want to play again?","Play Again?", JOptionPane.YES_NO_OPTION);
                            if (choice == JOptionPane.YES_OPTION){
                                game = false;
                            }
                            else {
                                JOptionPane.showMessageDialog(null, "Thanks for playing!","Goodbye",JOptionPane.INFORMATION_MESSAGE);
                                System.exit(0);
                            }

                        }
                    }


                }

            }

        }






    }
}
