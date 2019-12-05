import java.util.Scanner;

public class Cowsay {
        String cows;




        public static void main(String[] args) {


            Cow[] name = HeiferGenerator.getCows();
            Cow[] name2= HeiferGenerator.getFileCows();
            Scanner scanner = new Scanner(System.in);




            if (args.length == 1 && args[0].equals("-1")) {//lists the available cows

                System.out.println("Regular cows available: " + name[0].getName() + " " + name[1].getName() + " " + name[2].getName() +" "+name[3].getName());
                System.out.println("File Cows available: "+ name2[0].getName() + " " + name2[1].getName() + " " + name2[2].getName() +" "+name2[3].getName() );
            }

            else if(args.length > 1 && args[0].equals("-f")&& args[1].equals("moose")){
                for (int y = 2; y < args.length; y++) {
                    System.out.print(args[y] + " ");
                }
                System.out.print("\n");

                        System.out.println(name2[1].getImage());




            }
            else if(args.length > 1 && args[0].equals("-f")&& args[1].equals("turkey")){
                for (int y = 2; y < args.length; y++) {
                    System.out.print(args[y] + " ");
                }
                System.out.print("\n");

                        System.out.println(name2[3].getImage());





            }
            else if(args.length > 1 && args[0].equals("-f")&& args[1].equals("turtle")){
                for (int y = 2; y < args.length; y++) {
                    System.out.print(args[y] + " ");
                }
                System.out.print("\n");

                        System.out.println(name2[2].getImage());




            }
            else if(args.length > 1 && args[0].equals("-f")&& args[1].equals("tux")){
                for (int y = 2; y < args.length; y++) {
                    System.out.print(args[y] + " ");
                }
                System.out.print("\n");

                        System.out.println(name2[0].getImage());

                }




            else if(args.length > 1 && args[0].equals("-f")){
                System.out.println("Could not find " + args[1] + " " + "cow!");
            }
            else if (args.length > 1 && !args[0].equals("-n")&&!args[0].equals("-f")) {//Prints out the MESSAGE using the default cow
                for (int i = 0; i < args.length; i++) {
                    System.out.print(args[i] + " ");
                }
                System.out.print("\n");
                System.out.println(name[0].getImage());

            } else if (args.length > 1&&args[0].equals("-n")) {
                if (!args[1].equals(name[0].getName()) && !args[1].equals(name[1].getName()) && !args[1].equals(name[2].getName())&& !args[1].equals(name[3].getName())) {//prints out could not find when can not find certain cow.

                    System.out.println("Could not find " + args[1] + " " + "cow!");
                } else if (args[1].equals((name[0]).getName())&&args[0].equals("-n")) {//prints out the corresponding cow image and the message.
                    for (int l = 2; l < args.length; l++) {
                        System.out.print(args[l] + " ");
                    }
                    System.out.print("\n");
                    System.out.println(name[0].getImage());

                } else if (args[1].equals(name[1].getName())) {
                    for (int y = 2; y < args.length; y++) {
                        System.out.print(args[y] + " ");
                    }
                    System.out.print("\n");
                    System.out.println(name[1].getImage());

                }
                else if (args[1].equals(name[2].getName())) {
                    for (int y = 2; y < args.length; y++) {
                        System.out.print(args[y] + " ");
                    }
                    System.out.print("\n");
                    System.out.println(name[2].getImage());
                    if (( ((Dragon) name[2]).canBreatheFire())) {//judge whether the dragon can breathe fire or not.
                        System.out.println("This dragon can breathe fire.");
                    }


                } else if (args[1].equals(name[3].getName())) {
                    for (int y = 2; y < args.length; y++) {
                        System.out.print(args[y] + " ");
                    }
                    System.out.print("\n");
                    System.out.println(name[3].getImage());
                    if ( ((Dragon) name[3]).canBreatheFire()==false) {
                        System.out.println("This dragon cannot breathe fire.");
                    }
                }
            }
        }
    }

