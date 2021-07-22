import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Card extends JButton implements ActionListener{
    static ImageIcon cardBack = new ImageIcon("images/cardback.jpeg");
    ImageIcon animal;

    public Card(Animals x){
        animal = new ImageIcon(x.getPic());
        this.setBackground(Color.WHITE);
        this.setSize(120,120);
        this.setIcon(cardBack);
        this.flip();//temp
        this.addActionListener(this);
    }

    //not tested
    public void flip(){
        if(getIcon().equals(cardBack)){
            setIcon(animal);
        }else{
            setIcon(cardBack);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        flip();
    }
}
