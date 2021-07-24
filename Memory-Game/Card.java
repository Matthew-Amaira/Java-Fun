import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Card extends JButton implements ActionListener{
    static ImageIcon cardBack = new ImageIcon("images/cardback.jpeg");
    static boolean waitForNextClick = false; 
    static int openCard = -1;
    ImageIcon animal;
    int index;

    public Card(Animals x){
        animal = new ImageIcon(x.getPic());
        index  = x.getID();
        this.setBackground(Color.WHITE);
        this.setSize(120,120);
        this.setIcon(cardBack);
        this.addActionListener(this);
        this.setFocusable(false);
    }

    public void flip(){
            if(getIcon().equals(cardBack)){
                setIcon(animal);
            }else{
                setIcon(cardBack);
            }
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(this.getIcon().equals(cardBack)){
            if(waitForNextClick){
                Game.openCard1.flip();
                Game.openCard1 = null;
                Game.openCard2.flip();
                waitForNextClick = false;
            }
                                                                          
            flip();

            if(openCard < 0){
                openCard = index;
                Game.openCard1 = this;
            }else if(openCard != index){
                openCard = -1;
                Game.openCard2 = this;
                waitForNextClick=true;
            }else if(openCard == index){
                openCard=-1;
                Launcher.playtime.incrementScore();
            }
        }
    }
}
