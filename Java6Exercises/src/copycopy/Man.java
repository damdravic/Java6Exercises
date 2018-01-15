
package copycopy;



/**Class Man: notifies wife when her soap opera is starting on TV. 
 * @author Lori
 * @version 1.0 December 2017
 */
public class Man extends Thread {
    // an instance of TV
    final TV tv;
    
    // passing a TV to the constructor
    public Man(TV existingTV) {
        tv = existingTV;
    }
    
    /** Method for Man to announce the woman that the show has started */    
    public void wakeHerUp(){
       System.out.println("Wake up woman, your crappy soap it's on!");
    }
    
    /** @Override method inherited from superclass Thread that implements Runnable. */    @Override
    public void run(){
        try{
            // Put thread to sleep for 1 second, to be sure that woman's thread runs first
            Thread.sleep(1000);
            // synchronizing on the tv object
            synchronized(tv){
                // TV is running but her show didn't started yet
                tv.showOff();
                
                // Show has started so we unblock the woman's thread
                tv.notify();
            }
        } catch(InterruptedException e){
                e.getStackTrace();}
        try {
            // Pausing the man's thread for 2 seconds, so the woman's thread continue
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.getStackTrace(); }
       
        // Announcing the women that her show has tarted
        // Using a synchronized block, gives more chances that th threads will execute in the desired order
        synchronized(this){
           wakeHerUp();
        }
    }   
}

