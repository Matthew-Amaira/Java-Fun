import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Result{
    public Result(){
        String buttons[] = {"New Game", "Close"};
        ImageIcon clap = new ImageIcon("images/clap.png");
        int choice = JOptionPane.showOptionDialog(null, "Clever! You got 16/16 points",
        "You've won! :)", JOptionPane.WARNING_MESSAGE ,
        0, clap, buttons, null);

        if(choice == 0){
            Launcher.playtime = new Game();
        }
    }
}
