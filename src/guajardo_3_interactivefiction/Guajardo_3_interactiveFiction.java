/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guajardo_3_interactivefiction;
import java.util.Scanner;

/**
 *
 * @author rguajardo0103
 */
public class Guajardo_3_interactiveFiction {

    static Scanner input = new Scanner (System.in);
    static String answer;
    static boolean goodAnswer = false;
    
    public static void main(String[] args) {
          theStart();
        }
        
        public static void theStart() {
    
        System.out.println("Do you want to play the best game ever!!!!");
            answer = input.nextLine().toLowerCase();
        if (answer.contains("y")){
        
            System.out.println("That's great let's start!!!!");
                System.out.println("======================================================");
            introduction();
            
        }else if (answer.contains("n")){
            
            System.out.println("See ya later!!!");
                 System.out.println("======================================================");
        }else{
            System.out.println("");
            System.out.println("I don't quite understand !!!!!!!!!!");
            theStart();
        }
     }   
        
        //Part one of the game getting out of the hospital
        public static void introduction(){
         System.out.println(
            "Introduction\n"
                + "Your name is Carlitos.\n "
                        + "You been in a coma because of an car "
                        + "accident that you were in.A  tragic incident"
                        + "has occurred while you out.\n"
                        + "You wake up and nobody's there to help"
                        + "you.Get up and go outside "
                
                + "Type 'Go' to procede\n"
                    
         );
        answer = input.nextLine().toLowerCase();
        if(answer.contains("g")){
            
                 System.out.println("======================================================");
            hallWay();
                
        }
    }
        
        public static void hallWay(){
    
        System.out.println(
                "You go outside and everything is out of place there's"
                        + "blood everywhere.You keep walking yo check things out.\n"
                        + "You see dead people laying on the floor, there organs\n"
                        + "are all out if like someone ate them.\n"
                        + "something attacks you it's a human but the only thing\n"
                        + "is that it doesn't look human!!! You push\n"
                        + "it to the ground and go back to the room."
                );
                System.out.println("======================================================");
               backToTheRoom(); 
                
}
       public static void backToTheRoom(){
           System.out.println(
                   "You are scare you don't know what is going on.\n"
                           + "You are nervous and wonder if your family is okay.\n"
                           + "You want to go home.You get dress and a you want\n"
                           + "to pick up a weapon.\n If you want to take a knife\n"
                           + "type 'knife' if you want a to take a banana as your choise\n"
                           + "type in 'Banana' Pick whistle!!!"
           );
           System.out.println("======================================================");
           answer = input.nextLine().toLowerCase();
                if(answer.contains("k")){
                    knief();
                        System.out.println("======================================================");
                       
        }else if (answer.contains("b")){
            
                    banana();
 System.out.println("======================================================");        
        }else{
            System.out.println("");
            System.out.println("I don't quite understand !!!!!!!!!!");
                 System.out.println("======================================================");
                        backToTheRoom();

        }
           System.out.println("======================================================");
       } 
       
       public static void knief(){
           System.out.println(
                   "You head out scared but you head out\n"
                           + "anyways. You keep walking to the exit of the hospital\n"
                           + "You run into no one but three of those thing that attacked\n"
                           + "you earlier. You know you can take them down with a knife\n"
                           + "You see a sledgehammer right by the creatures.\n"
                           + "Do you take your chance that they will eat you or\n"
                           + "go thru the back exit\n"
                           + "Type 'YOLO' to get the hammer\n"
                           + "Type 'Back Exit To take a different rout\n"
                           + "Pick the best choice!!!!"
           );
           System.out.println("======================================================");
             answer = input.nextLine().toLowerCase();
                if(answer.contains("y")){
                    YOLO();
                        System.out.println("======================================================");
                       
        }else if (answer.contains("b")){
            
                    backExit();
 System.out.println("======================================================");        
        }else{
            System.out.println("");
            System.out.println("I don't quite understand !!!!!!!!!!");
                 System.out.println("======================================================");
                        knief();

        }
           System.out.println("======================================================");
       }
       
       public static void YOLO(){
           System.out.println(
                   "You throw a random tool to the other side to distract them.\n"
                           + "It works they go check out the noise and you\n"
                           + "run to the sledge hammer and you get it but by\n"
                           + "the time you get it they see you and they attack you\n"
                           + "but you're ready for them and kill them all you chop "
                           + "their heads one by one!!!\n"
                           + "Straight up savage!!!!!!!!!!!!!!!!!!!\n"
                           + "You head out to the street to go home!!!!!!"
                   
           );
           System.out.println("======================================================");
           outInTheWorld1();
       }
       
       public static void backExit(){
           System.out.println(
                   "You leave and go to the back exit.Back there you ran into\n"
                           + "even more trouble those creatures came out of nowhere \n"
                           + "and you couldn't defend yourself they kill you \n"
                           + "Type 'Start' to restart this level\n"
                           + "Type 'Quit' to quit the game "
                   
           );
           System.out.println("======================================================");
           
           answer = input.nextLine().toLowerCase();
                if(answer.contains("s")){
                    knief();
                        System.out.println("======================================================");
                       
        }else if (answer.contains("q")){
            
                    System.out.println(
                   "================\n"
                           + "|| Game Over ||\n"
                           + "================"
           );
       }
 

        }
       
                              
       
       public static void banana(){
           System.out.println(
                   "You go out all nevers scared of the thing that attack you\n "
                           + "earlier. You keep walking toward the exit of the hospital\n"
                           + "but you run into not just one but three of them!!!\n"
                           + "They see you and they run toward you. You run but you trip over a chair \n"
                           + "And they eat you alive!!!!!!!!!!!!!!"
           );
           System.out.println("Type 'Start' to play again\n"
                   + "Type 'Quit' to end the the game.");
                   
           answer = input.nextLine().toLowerCase();
                if(answer.contains("s")){
                    backToTheRoom();
                        System.out.println("======================================================");
                       
        }else if (answer.contains("q")){
            
                    System.out.println(
                   "================\n"
                           + "|| Game Over ||\n"
                           + "================"
           );
       }
 

        }
       
       //Part 2 of the gamemeating new apeople and going home    
       public static void outInTheWorld1(){
           System.out.println(
                   "You see a bunch of those same thing that you just kill\n"
                           + "You want to call them zombies but its sounds to crazy\n"
                           + "You are scared to go out there, there's to many\n"
                           + "but out of nowhere you hear gun fires coming to the right\n"
                           + "of you .All the zombies are heading towards \n"
                           + "the noise and it leaves the the whole street\n"
                           + "all by itself\n"
                           + "Type 'Go Check It Out' to see what was it\n "
                           + "Type 'Keep Going' to keep heading home\n"
                           + "Pick the best choice"                 
           );
           System.out.println("======================================================");
           
           answer = input.nextLine().toLowerCase();
                if(answer.contains("o")){
                     goCheckItOut();
                        System.out.println("======================================================");
                       
        }else if (answer.contains("e")){
            
                    keepGoin();
 System.out.println("======================================================");        
        }else{
            System.out.println("");
            System.out.println("I don't quite understand !!!!!!!!!!");
                 System.out.println("======================================================");
                        outInTheWorld1();

        }
       } 
       
       public static void goCheckItOut(){
           System.out.println(
                   "You start heading towards the noise and on the way\n"
                           + "there you run into some of them and you chop their head off.\n"
                           + "You reach the people and they look like they needed some help\n"
                           + "you help  the out and tell you to get in the Truck to leave \n"
                           + "you just go with it."
                           + "Ask them what is goin on type in 'What is going on' "
                           + "Stay quiet type in 'shock' "
           );
           System.out.println("======================================================");
           
       }
       
      public static void wahtIsGoinOn(){
          System.out.println(
                  "What is goin on? What are does thuigs that we tried to kill us?\n"
                          + "There responds is that it started  as a desies and\n "
                          + "it spread fast. It turn people in to human eating zombies.\n"
                          + "The deases past down by a bite from someone that was infected.\n"
                          + "The only way to kill them is by a shoting them in the head."
                          + "You then tell them whats your doing and that your are berly waking up from\n"
                          + ""
          
          );
      } 
       
       
       
       
       
       
       
       
       
       
       
       
       public static void keepGoin(){
           System.out.println(
                   "you kept walking and ignore the noises but you didn't know what you were\n"
                           + "running into.It was really bad.You thought you were okay\n"
                           + "but out of nowhere there a bunch of them came out. They\n"
                           + "corner you and next thing you know they started ti attack\n"
                           + "you and kill you!!!!!!!!!!!"
                           + " Type 'Start' to play again\n"
                           + "Type 'Quit' to end the the game."
           );
           System.out.println("======================================================");
           
           answer = input.nextLine().toLowerCase();
                if(answer.contains("s")){
                    backToTheRoom();
                        System.out.println("======================================================");
                       
        }else if (answer.contains("q")){
            
                    System.out.println(
                   "================\n"
                           + "|| Game Over ||\n"
                           + "================"
           );
       }
       }
       
 }

        



