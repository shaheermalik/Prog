import java.util.Scanner;



public class Main {



    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        Film[] filmArray = new Film[10];

        int numberOfFilms = 0;

        int option;



        do {

            System.out.println("Press 1 to add a Film");

            System.out.println("Press 2 to look at all the existing Films ");

            System.out.println("Press 3 to end the program");

            option = keyboard.nextInt();

            keyboard.nextLine();



            if(option == 1) {

                System.out.println("What is the name of the film?");

                String filmName = keyboard.nextLine();



                System.out.println("Who is the director of this film?");

                String directer = keyboard.nextLine();



                System.out.println("In what year this move realised?");



                int year = keyboard.nextInt();



                Film currentFilm = new Film(filmName,directer,year);



                if(numberOfFilms < filmArray.length) {



                    boolean duplicate = false;

                    int index = 0;

                    while(!duplicate && index < numberOfFilms) {

                        if(filmArray[index].equals(currentFilm)) {

                            duplicate = true;

                        }



                        index++;

                    }



                    if(!duplicate) {

                        filmArray[numberOfFilms] = currentFilm;

                        numberOfFilms++;

                    }

                    else {

                        System.out.println("!!!!!!  ಠ_ಠ  CAUTION   ಠ_ಠ   !!!!!! ");

                        System.out.println("This Film already exists!"+ "\n" +" pleas do not store it again! ");

                        System.out.println("");

                    }

                }

                else {

                    System.out.println("Sorry, You can not store more than 10 films!");

                }

            }

            else if(option == 2) {

                for(int index = 0; index < numberOfFilms; index++) {



                    System.out.println("Name of the Film:  " +  filmArray[index].getNameOfFilm());

                    System.out.println("Directer of the film: "+ filmArray[index].getNameOfDirector());

                    if (filmArray[index].getYearOfRelease()>= 1890){

                        System.out.println("Year of the film realised: " + filmArray[index].getYearOfRelease() + "\n");

                    } else System.out.println("Realise of year is not correct! " +

                            "User input was " +filmArray[index].getYearOfRelease()+ "\n"+" All film made after 1889! (ᵔᴥᵔ) ");

                    System.out.println("");

                }

            }

            else if(option == 3) {

                System.out.println("Thank you for using the program!");

            }

            else {

                System.out.println("Error! Invalid option! Try again!" +"\n");



            }



        }while(option != 3);



    }



}
