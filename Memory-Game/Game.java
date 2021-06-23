import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Game{
    final static int EASY   = 1;
    final static int NORMAL = 2;
    final static int HARD   = 3;
    
    JFrame gameFrame;

    ImageIcon goat      = new ImageIcon("images/goat.jpg");
    ImageIcon fish      = new ImageIcon("images/fish.jpg");
    ImageIcon cow       = new ImageIcon("images/cow.jpg");
    ImageIcon parrot    = new ImageIcon("images/parrot.jpg");
    ImageIcon horse     = new ImageIcon("images/horse.jpg");
    ImageIcon rooster   = new ImageIcon("images/rooster.jpg");
    ImageIcon monkey    = new ImageIcon("images/monkey.jpg");
    ImageIcon elephant   = new ImageIcon("images/elephant.jpg");
    ImageIcon zebra     = new ImageIcon("images/zebra.jpg");
    ImageIcon snake     = new ImageIcon("images/snake.jpg");
    ImageIcon ostrich   = new ImageIcon("images/ostrich.jpg");
    ImageIcon eagle     = new ImageIcon("images/eagle.jpg");
    ImageIcon bee       = new ImageIcon("images/bee.jpg");
    ImageIcon lion      = new ImageIcon("images/lion.jpg");
    ImageIcon pig       = new ImageIcon("images/pig.jpg");
    ImageIcon rabbit    = new ImageIcon("images/rabbit.jpg");



    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    JButton button5 = new JButton();
    JButton button6 = new JButton();
    JButton button7 = new JButton();
    JButton button8 = new JButton();
    JButton button9 = new JButton();
    JButton button10 = new JButton();
    JButton button11 = new JButton();
    JButton button12 = new JButton();
    JButton button13 = new JButton();
    JButton button14 = new JButton();
    JButton button15 = new JButton();
    JButton button16 = new JButton();

    JButton cbutton1 = new JButton();
    JButton cbutton2 = new JButton();
    JButton cbutton3 = new JButton();
    JButton cbutton4 = new JButton();
    JButton cbutton5 = new JButton();
    JButton cbutton6 = new JButton();
    JButton cbutton7 = new JButton();
    JButton cbutton8 = new JButton();
    JButton cbutton9 = new JButton();
    JButton cbutton10 = new JButton();
    JButton cbutton11 = new JButton();
    JButton cbutton12 = new JButton();
    JButton cbutton13 = new JButton();
    JButton cbutton14 = new JButton();
    JButton cbutton15 = new JButton();
    JButton cbutton16 = new JButton();



    Game(){
        new Game(Game.NORMAL);
    }
    
    Game(int level){
        switch(level){
            case 1:
            //play easy game
            gameFrame = new JFrame("Memory Game - LEVEL EASY"); //3x4
            buttonMaker(6);
            gameFrame.setLayout(new GridLayout(3,4));
            gameFrame.setSize(400, 500);
            
            break;
            case 2:
            //play normal game
            gameFrame = new JFrame("Memory Game - LEVEL NORMAL"); //4x5
            buttonMaker(10);
            gameFrame.setLayout(new GridLayout(4,5));
            gameFrame.setSize(512, 624);
            break;
            case 3:
            //play hard game
            gameFrame = new JFrame("Memory Game - LEVEL HARD"); // 4*8
            buttonMaker(16);
            gameFrame.setLayout(new GridLayout(4,8));
            gameFrame.setSize(624, 720);
            break;
        }
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.setVisible(true);
    }

    public void buttonMaker(int amount){
        switch(amount){
            case 16:
                button11.setBackground(new Color(0xbd6331));
                button12.setBackground(new Color(0xbd6331));
                button13.setBackground(new Color(0xbd6331));
                button14.setBackground(new Color(0xbd6331));
                button15.setBackground(new Color(0xbd6331));
                button16.setBackground(new Color(0xbd6331));

                cbutton11.setBackground(new Color(0xbd6331));
                cbutton12.setBackground(new Color(0xbd6331));
                cbutton13.setBackground(new Color(0xbd6331));
                cbutton14.setBackground(new Color(0xbd6331));
                cbutton15.setBackground(new Color(0xbd6331));
                cbutton16.setBackground(new Color(0xbd6331));

                button11.setSize(120,120);
                button12.setSize(120,120);
                button13.setSize(120,120);
                button14.setSize(120,120);
                button15.setSize(120,120);
                button16.setSize(120,120);

                cbutton11.setSize(120,120);
                cbutton12.setSize(120,120);
                cbutton13.setSize(120,120);
                cbutton14.setSize(120,120);
                cbutton15.setSize(120,120);
                cbutton16.setSize(120,120);

                button11.setIcon(parrot);
                button12.setIcon(elephant);
                button13.setIcon(zebra);
                button14.setIcon(rabbit);
                button15.setIcon(lion);
                button16.setIcon(cow);

                cbutton11.setIcon(parrot);
                cbutton12.setIcon(elephant);
                cbutton13.setIcon(zebra);
                cbutton14.setIcon(rabbit);
                cbutton15.setIcon(lion);
                cbutton16.setIcon(cow);


                
                        gameFrame.add(button11);
                        gameFrame.add(button12);
                        gameFrame.add(button13);
                        gameFrame.add(button14);
                        gameFrame.add(button15); 
                        gameFrame.add(button16);
                        gameFrame.add(cbutton11);
                        gameFrame.add(cbutton12);
                        gameFrame.add(cbutton13);
                        gameFrame.add(cbutton14);
                        gameFrame.add(cbutton15);
                        gameFrame.add(cbutton16);

            case 10:
                button7.setBackground(new Color(0xbd6331));
                button8.setBackground(new Color(0xbd6331));
                button9.setBackground(new Color(0xbd6331));
                button10.setBackground(new Color(0xbd6331));

                cbutton7.setBackground(new Color(0xbd6331));
                cbutton8.setBackground(new Color(0xbd6331));
                cbutton9.setBackground(new Color(0xbd6331));
                cbutton10.setBackground(new Color(0xbd6331));

                button7.setSize(120,120);
                button8.setSize(120,120);
                button9.setSize(120,120);
                button10.setSize(120,120);

                cbutton7.setSize(120,120);
                cbutton8.setSize(120,120);
                cbutton9.setSize(120,120);
                cbutton10.setSize(120,120);

                button7.setIcon(snake);
                button8.setIcon(bee);
                button9.setIcon(pig);
                button10.setIcon(monkey);

                cbutton7.setIcon(snake);
                cbutton8.setIcon(bee);
                cbutton9.setIcon(pig);
                cbutton10.setIcon(monkey);
                
                
                        gameFrame.add(button7);
                        gameFrame.add(button8);
                        gameFrame.add(button9);
                        gameFrame.add(button10);
                        gameFrame.add(cbutton7); 
                        gameFrame.add(cbutton8);
                        gameFrame.add(cbutton9);
                        gameFrame.add(cbutton10);
            case 6:
                button1.setBackground(new Color(0xbd6331));
                button2.setBackground(new Color(0xbd6331));
                button3.setBackground(new Color(0xbd6331));
                button4.setBackground(new Color(0xbd6331));
                button5.setBackground(new Color(0xbd6331));
                button6.setBackground(new Color(0xbd6331));

                cbutton1.setBackground(new Color(0xbd6331));
                cbutton2.setBackground(new Color(0xbd6331));
                cbutton3.setBackground(new Color(0xbd6331));
                cbutton4.setBackground(new Color(0xbd6331));
                cbutton5.setBackground(new Color(0xbd6331));
                cbutton6.setBackground(new Color(0xbd6331));

                button1.setSize(120,120);
                button2.setSize(120,120);
                button3.setSize(120,120);
                button4.setSize(120,120);
                button5.setSize(120,120);
                button6.setSize(120,120);

                cbutton1.setSize(120,120);
                cbutton2.setSize(120,120);
                cbutton3.setSize(120,120);
                cbutton4.setSize(120,120);
                cbutton5.setSize(120,120);
                cbutton6.setSize(120,120);
                
                button1.setIcon(goat);
                button2.setIcon(horse);
                button3.setIcon(rooster);
                button4.setIcon(fish);
                button5.setIcon(eagle);
                button6.setIcon(ostrich);
                
                cbutton1.setIcon(goat);
                cbutton2.setIcon(horse);
                cbutton3.setIcon(rooster);
                cbutton4.setIcon(fish);
                cbutton5.setIcon(eagle);
                cbutton6.setIcon(ostrich);


                        gameFrame.add(button1);
                        gameFrame.add(button2);
                        gameFrame.add(button3);
                        gameFrame.add(button4);
                        gameFrame.add(button5);
                        gameFrame.add(button6);
                        gameFrame.add(cbutton1);
                        gameFrame.add(cbutton2);
                        gameFrame.add(cbutton3);
                        gameFrame.add(cbutton4);
                        gameFrame.add(cbutton5);
                        gameFrame.add(cbutton6);
            break;
        }
    }
}
