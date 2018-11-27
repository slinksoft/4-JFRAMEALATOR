import javax.swing.JOptionPane;
public class functions
{
    public double plusFunction(double a, double b)
    {
        return a+b;
    }
    public double minusFunction(double a, double b)
    {
        return a-b;
    }
    public double multiplyFunction(double a, double b)
    {
        return a*b;
    }
    public double divideFunction(double a, double b)
    {
        return a/b;
    }
    
    public void openMessageBox()
    {
        String text = "This program was purely developed for practice. All the code involved were some units learned in\n my Programming 1 class; including defining/creating classes and methods,\n creating new instance of classes and calling them in from another class, passing variables through\n methods, and more. GUI/JFrame code was self-taught by me (Used IDE for assistance).";
        JOptionPane.showMessageDialog(null, text, "About This Program", JOptionPane.INFORMATION_MESSAGE);
        String gotoO = "Vist https://realslinksoft.wixsite.com/slink-soft-portfolio and https://github.com/slinksoft \n for more information and projects (SlinkSoft contains more. Github will \n be updated as time goes by).";
        JOptionPane.showMessageDialog(null, gotoO, "Thank You!", JOptionPane.INFORMATION_MESSAGE);
    }
}