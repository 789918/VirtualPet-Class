// VirtualPetApplication.java
import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of your virtual pet: ");
        String petName = scanner.nextLine();

        VirtualPet pet = new VirtualPet(petName);

        System.out.println("Welcome to Virtual Pet: " + pet.getName());

        while (true) {
            System.out.println("----------------------------");
            System.out.println("1. Feed " + pet.getName());
            System.out.println("2. Water " + pet.getName());
            System.out.println("3. Play with " + pet.getName());
            System.out.println("4. Quit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    pet.feed();
                    break;
                case 2:
                    pet.water();
                    break;
                case 3:
                    pet.play();
                    break;
                case 4:
                    System.out.println("Thank you for playing!");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Try again.");
            }


            pet.tick();

            System.out.println(pet.getName() + "'s hunger: " + pet.getHunger());
            System.out.println(pet.getName() + "'s thirst: " + pet.getThirst());
            System.out.println(pet.getName() + "'s boredom: " + pet.getBoredom());
        }
    }
}


