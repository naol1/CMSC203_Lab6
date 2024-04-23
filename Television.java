/** 
 * The purpose of this class is to model a television
 * [Your name and today’s date]
 */

public class Television {
    // Constant fields
    private static final String MANUFACTURER = "Toshiba";
    private static final int SCREEN_SIZE = 55;
    
    // Fields
    private boolean powerOn;
    private int channel;
    private int volume;
    
    // Constructor
    /**
     * Constructs a Television object with given manufacturer and screen size.
     * Initializes powerOn to false (power is off), volume to 20, and channel to 2.
     * @param manufacturer The manufacturer's brand of the television.
     * @param screenSize The size of the television screen.
     */
    public Television(String manufacturer, int screenSize) {
        this.powerOn = false;
        this.volume = 20;
        this.channel = 2;
    }
    
    // Accessor methods
    /**
     * Returns the volume of the television.
     * @return The volume of the television.
     */
    public int getVolume() {
        return this.volume;
    }
    
    /**
     * Returns the channel of the television.
     * @return The channel of the television.
     */
    public int getChannel() {
        return this.channel;
    }
    
    /**
     * Returns the manufacturer of the television.
     * @return The manufacturer of the television.
     */
    public String getManufacturer() {
        return MANUFACTURER;
    }
    
    /**
     * Returns the screen size of the television.
     * @return The screen size of the television.
     */
    public int getScreenSize() {
        return SCREEN_SIZE;
    }
    
    // Mutator methods
    /**
     * Sets the channel of the television.
     * @param channel The channel to be set.
     */
    public void setChannel(int channel) {
        this.channel = channel;
    }
    
    /**
     * Toggles the power of the television.
     */
    public void power() {
        this.powerOn = !this.powerOn;
    }
    
    /**
     * Increases the volume of the television by 1.
     */
    public void increaseVolume() {
        this.volume++;
    }
    
    /**
     * Decreases the volume of the television by 1.
     */
    public void decreaseVolume() {
        this.volume--;
    }
}
