public class mainClass
{
    public static void main (String[] args)
    {
        // run constructor
        new mainClass();
    }
    
    public mainClass()
    {
        // create new instance of gui
        GUI newGUI = new GUI();
        newGUI.show(); //show the gui/make it visible
    }
}