import java.util.Scanner;
public class ChooseYourOwnAdventure
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        boolean play = true;
        boolean game = false;
        boolean input;
        String thirdStreet;
        String classes;
        String react;
        String studySession;
        String pump;
        String basketball;
        String d;


        while(play)
        {

            System.out.println("Welcome to Purdue as a student you will be navigating the complex life of college and have to make many decisions");
            do{
                System.out.println("You are invited to go to third street during BGR by one of your friends do you accept? (y / n)");
                thirdStreet = s.next();
                if(thirdStreet.equals("y") || thirdStreet.equals("n"))
                {
                    input = true;
                }
                else{
                    System.out.println("Please enter a valid input");
                    input = false;
                }
            } while(!input);



            if (thirdStreet.equals("y"))
            {
                do{
                    System.out.println("You have fun with your friends all night and get a few peoples instas but you are extremely tired the next morning when you have a 7:30 class.\nDo you want to sleep in and skip class or go to class tired (s / g)");
                    classes = s.next();
                    if(classes.equals("s") || classes.equals("g"))
                    {
                        input = true;
                    }
                    else
                    {
                        System.out.println("Please enter a valid input");
                        input = false;
                    }
                } while(!input);
                if(classes.equals("s"))
                {
                    do{
                        System.out.println("You have a nice slumber put you wake up to a notification that says you got a 0 on a lecture quiz and you start off the year on a bad note with an F in a class\nYou then must decide should you go to your TA and beg for a grade change or go to your next class and move on (TA/mv)");
                        react = s.next();
                        if(react.equals("TA") || react.equals("mv"))
                        {
                            input = true;
                        }
                        else
                        {
                            System.out.println("Please enter a valid input");
                            input = false;
                        }
                    } while(!input);
                    if(react.equals("TA"))
                    {
                        System.out.println("You beg and plead with your TA but she says you missed the lecture so your grade won't change you walk away realizing you need to lock in and attend class");
                        game = true;
                        while(game)
                        {
                            System.out.println("Do you want to play again (y / n)");


                            String playAgain = s.next();
                            if (playAgain.equals("y"))
                            {

                                game = false;

                            }
                            else if(playAgain.equals("n"))
                            {
                                play = false;
                                game = false;

                            }
                            else
                            {
                                System.out.println("Please enter a valid input");

                            }
                        }

                    }
                    else if(react.equals("mv"))
                    {
                        System.out.println("You move on and head to your next classes and do great in them.\nYou also notice a career fair and go to that and get valuable experience talking to recruiters. \n Your college life is off to a great start");
                        game = true;
                        while(game)
                        {
                            System.out.println("Do you want to play again (y / n)");
                            String playAgain = s.next();
                            if (playAgain.equals("y"))
                            {

                                game = false;
                            }
                            else if(playAgain.equals("n"))
                            {
                                play = false;
                                game = false;
                            }
                            else
                            {
                                System.out.println("Please enter a valid input");
                            }
                        }
                    }



                }
                else if(classes.equals("g"))
                {
                    do {
                        System.out.println("You go to your lecture and there's a surprise quiz since you were paying attention you ace it and start off the year with an A in your class\nOne of your new friends in class offers a study session do you accept? (y/n)");
                        studySession = s.next();
                        if(studySession.equals("y") || studySession.equals("n"))
                        {
                            input = true;
                        }
                        else
                        {
                            System.out.println("Please enter a valid input");
                            input = false;
                        }
                    } while(!input);
                    if(studySession.equals("y"))
                    {
                        System.out.println("You have a great time studying with your friends and you do great on your next quiz and midterm\nYou feel confident with the start of your college life");
                        game = true;
                        while(game)
                        {
                            System.out.println("Do you want to play again (y / n)");
                            String playAgain = s.next();
                            if (playAgain.equals("y"))
                            {

                                game = false;
                            }
                            else if(playAgain.equals("n"))
                            {
                                play = false;
                                game = false;
                            }
                            else
                            {
                                System.out.println("Please enter a valid input");
                            }
                        }
                    }
                    else if(studySession.equals("n"))
                    {

                        System.out.println("You decide to just spend your time playing video games and not study for your big midterm you fail the midterm and your college career is off to a bad start");
                        game = true;
                        while(game)
                        {
                            System.out.println("Do you want to play again (y / n)");
                            String playAgain = s.next();
                            if (playAgain.equals("y"))
                            {

                                game = false;
                            }
                            else if(playAgain.equals("n"))
                            {
                                play = false;
                                game = false;
                            }
                            else
                            {
                                System.out.println("Please enter a valid input");
                            }
                        }
                    }
                }


            }

            else if(thirdStreet.equals("n"))
            {
                do{
                    System.out.println("One of your other friends offer to go to the corec and get a late night pump do you accept? (y/n)");
                    pump = s.next();
                    if(pump.equals("y") || pump.equals("n"))
                    {
                        input = true;
                    }
                    else
                    {
                        System.out.println("Please enter a valid input");
                        input = false;
                    }
                } while(!input);
                if(pump.equals("y"))
                {
                    do{
                        System.out.println("You get jacked with your friend and slam a bunch of protein drinks and then you see people playing basketball do you join? (y/n)");
                        basketball = s.next();
                        if(basketball.equals("y") || basketball.equals("n"))
                        {
                            input = true;
                        }
                        else{
                            System.out.println("Please enter a valid input");
                            input = false;
                        }
                    } while(!input);
                    if(basketball.equals("y"))
                    {
                        System.out.println("You hoop hitting threes like curry and impress everyone as you hit the game winner and you made some new friends along the way");
                        game = true;
                        while(game)
                        {
                            System.out.println("Do you want to play again (y / n)");
                            String playAgain = s.next();
                            if (playAgain.equals("y"))
                            {

                                game = false;
                            }
                            else if(playAgain.equals("n"))
                            {
                                play = false;
                                game = false;
                            }
                            else
                            {
                                System.out.println("Please enter a valid input");
                            }
                        }
                    }
                    else if(basketball.equals("n"))
                    {
                        System.out.println("You decide to unlock your inner David Goggins and go for a 5 mile run late into the night running around the campus taking in the beautiful sights\nThis is the year where you become extremely fit");
                        while(game)
                        {
                            System.out.println("Do you want to play again (y / n)");
                            String playAgain = s.next();
                            if (playAgain.equals("y"))
                            {

                                game = false;
                            }
                            else if(playAgain.equals("n"))
                            {
                                play = false;
                                game = false;
                            }
                            else
                            {
                                System.out.println("Please enter a valid input");
                            }
                        }
                    }
                }
                else if(pump.equals("n"))
                {
                    do{
                        System.out.println("You instead go to the dining hall and stuff your face full of Mexican food and ice cream \n You then decide whether to dance the night away or go back to your dorm (dance/dorm)");
                        d = s.next();
                        if(d.equals("dance") || d.equals("dorm"))
                        {
                            input = true;
                        }
                        else
                        {
                            System.out.println("Please enter a valid input");
                            input = false;
                        }
                    } while(!input);
                    if(d.equals("dance"))
                    {
                        System.out.println("You griddy your way back to your dorm and everyone notices and celebrates in appreciation you're officaly the talk of the town in a good way");
                        game = true;
                        while(game)
                        {
                            System.out.println("Do you want to play again (y / n)");
                            String playAgain = s.next();
                            if (playAgain.equals("y"))
                            {

                                game = false;
                            }
                            else if(playAgain.equals("n"))
                            {
                                game = false;
                                play = false;
                            }
                            else
                            {
                                System.out.println("Please enter a valid input");
                            }
                        }
                    }
                    else if(d.equals("dorm"))
                    {
                        System.out.println("You go back to your dorm and relax and take a nice warm shower and hop on Fortnite with one of your boys from back home \n You will lock in tomorrow hopefully");
                        game = true;
                        while(game)
                        {
                            System.out.println("Do you want to play again (y / n)");
                            String playAgain = s.next();
                            if (playAgain.equals("y"))
                            {

                                game = false;
                            }
                            else if(playAgain.equals("n"))
                            {
                                play = false;
                                game = false;
                            }
                            else
                            {
                                System.out.println("Please enter a valid input");
                            }
                        }
                    }


                }

            }

        }




        System.out.println("Thanks for playing hope you play again soon!");
        s.close();
    }

}



