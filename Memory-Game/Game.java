import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;

public class Game extends JFrame{
    public static ArrayList<Integer> indexes;
    public int score; // 0/16
    public static Card openCard1;
    public static Card openCard2;

    public Game(){
        score  = 0;
        indexes = generateList();
        displayindexes(); //temp
        //Create buttons
        for(int i=0;i<(Animals.values().length*2);i++){
            this.add(new Card(Animals.elementAt(indexes.get(i))));
        }

        GridLayout layout = new GridLayout(4,8);
        layout.setHgap(10);
        layout.setVgap(10);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Memory Game");
        this.getContentPane().setBackground(new Color(0x113B48));//97663E
        this.setSize(1030,530);
        this.setResizable(false);
        
        this.setLayout(layout);

        this.setVisible(true);
    }

    public void incrementScore(){
        this.score++;
        if(score == 16){
            this.dispose();
            this.score = 0;
            new Result();
        }
    }

    private static ArrayList<Integer> generateList(){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> result= new ArrayList<Integer>();

        for(int i=0;i<16;i++){
            int x = (int) Math.round(Math.random()*15);
            if(list1.contains(x))
                i--;
            else
                list1.add(x);
        }


        for(int i=0;i<16;i++){
            int x = (int) Math.round(Math.random()*15);
            if(list2.contains(x))
                i--;
            else
                list2.add(x);
        }
        
        result = merge(list1, list2);

        //temp display result
        for(int i=0;i<result.size();i++){
            System.out.print(result.get(i)+" ");
        }System.out.println();

        return result;
    }

    private static ArrayList<Integer> merge(ArrayList<Integer> x,ArrayList<Integer> y){
        for(int i=0;i<y.size();i++){
            x.add((2*i),y.get(i));
        }
        return x;
    }

    private static void displayindexes(){
        for(int i=0;i<indexes.size();i++){
            System.out.print(indexes.get(i)+" ");
        }System.out.println();
    }
}
