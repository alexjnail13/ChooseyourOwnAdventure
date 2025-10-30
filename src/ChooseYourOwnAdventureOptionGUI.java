import javax.swing.JOptionPane;



public class ChooseYourOwnAdventureOptionGUI {
    public static void main(String[] args)
    {

        boolean play = true;
        boolean game = false;
        int choice1;
        int choice2;
        int choice3;
        int choice4;
        int choice5;
        int choice6;
        int choice7;



        while(play)
        {

            JOptionPane.showMessageDialog(null, "Welcome to Purdue as a student you will be navigating the complex life of college and have to make many decisions", "Purdue Adventure", JOptionPane.INFORMATION_MESSAGE);



                String[] options1 = {"Yes", "No"};
                choice1 = JOptionPane.showOptionDialog(null, "You are invited to go to third street during BGR by one of your friends","do you accept?", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, options1, options1[0]);





            if (choice1 == 0)
            {

                    String[] options2 = {"Sleep in", "Go to Class"};
                    choice2 = JOptionPane.showOptionDialog(null, "You have fun with your friends all night and get a few peoples instas but you are extremely tired the next morning when you have a 7:30 class.\nDo you want to sleep in and skip class or go to class tired",
                            "Third Street", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null, options2, options2[0]);



                if(choice2 == 0)
                {

                        String[] options3 = {"TA", "move on"};
                        choice3 = JOptionPane.showOptionDialog(null, "You have a nice slumber put you wake up to a notification that says you got a 0 on a lecture quiz and you start off the year on a bad note with an F in a class\nYou then must decide should you go to your TA and beg for a grade change or go to your next class and move on", "TA Or Move On",
                                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options3, options3[0]);



                    if(choice3 == 0)
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
                    else if(choice3 == 1)
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
                else if(choice2 == 1)
                {

                        String[] options4 = {"Yes", "No"};
                        choice4 = JOptionPane.showOptionDialog(null, "You go to your lecture and there's a surprise quiz since you were paying attention you ace it and start off the year with an A in your class\nOne of your new friends in class offers a study session do you accept?"
                        , "Lecture", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,null,options4,options4[0]);




                    if(choice4 == 0)
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
                    else if(choice4 == 1)
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

            if(choice1 == 1)
            {

                    String[] options5 = {"Yes", "No"};
                    choice5 = JOptionPane.showOptionDialog(null, "One of your other friends offer to go to the corec and get a late night pump do you accept?",
                            "Co-Rec Pump?", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options5, options5[0]);



                if(choice5 == 0)
                {

                        String[] options6 = {"Yes", "No"};
                        choice6 = JOptionPane.showOptionDialog(null, "You get jacked with your friend and slam a bunch of protein drinks and then you see people playing basketball do you join?"
                        ,"Basketball?",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,options6, options6[0]);


                    if(choice6 == 0)
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
                    else if(choice6 == 1)
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
                else if(choice5 == 1)
                {
                    
                        String[] options7 = {"Dance", "Dorm"};
                        choice7 = JOptionPane.showOptionDialog(null, "You instead go to the dining hall and stuff your face full of Mexican food and ice cream \n You then decide whether to dance the night away or go back to your dorm"
                        , "Dance or Dorm?", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, null, options7, options7[0]);



                    if(choice7 == 0)
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
                    else if(choice7 == 1)
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
