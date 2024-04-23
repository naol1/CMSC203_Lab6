import java.util.Scanner;

/** 
 * This class tests the Television class
 */
public class TelevisionDemo {
    public static void main(String[] args) {
        // Create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner(System.in);
        
        // Declare variables
        int station; // the user’s channel choice
        
        // Declare and instantiate a television object
        Television bigScreen = new Television("Toshiba", 55);
        
        // Turn the power on
        bigScreen.power();
        
        // Display the state of the television
        System.out.println("A " + bigScreen.getScreenSize() + "-inch " +
                           bigScreen.getManufacturer() + " has been turned on.");
        
        // Prompt the user for input and store into station
        System.out.print("What channel do you want? ");
        station = keyboard.nextInt();
        
        // Change the channel on the television
        bigScreen.setChannel(station);
        
        // Increase the volume of the television
        bigScreen.increaseVolume();
        
        // Display the current channel and volume of the television
        System.out.println("Channel: " + bigScreen.getChannel() +
                           ", Volume: " + bigScreen.getVolume());
        System.out.println("Too loud!! I am lowering the volume.");
        
        // Decrease the volume of the television
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        
        // Display the current channel and volume of the television
        System.out.println("Channel: " + bigScreen.getChannel() +
                           ", Volume: " + bigScreen.getVolume());
        System.out.println(); // for a blank line
        
        // Task #5 Creating another instance of a Television
        // Declare another Television object called portable.
        Television portable;
        
        // Instantiate portable to be a Sharp 19 inch television.
        portable = new Television("Sharp", 19);
        
        // Use a call to the power method to turn the power on.
        portable.power();
        
        // Use calls to the accessor methods to print what television was turned on.
        System.out.println("A " + portable.getScreenSize() + "-inch " + portable.getManufacturer() + " has been turned on.");
        
        // Use calls to the mutator methods to change the channel to the user’s preference and decrease the volume by two.
        System.out.print("What channel do you want? ");
        int portableChannel = keyboard.nextInt();
        portable.setChannel(portableChannel);
        portable.decreaseVolume();
        portable.decreaseVolume();
        
        // Use calls to the accessor methods to print the changed state of the portable.
        System.out.println("Channel: " + portable.getChannel() + ", Volume: " + portable.getVolume());
    }
}
