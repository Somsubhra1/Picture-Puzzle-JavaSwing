import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    //All Components declared:

    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,sampleButtton, shuffle;
    private Icon ic1=new ImageIcon("img/1.jpg");
    private Icon ic2=new ImageIcon("img/2.jpg");
    private Icon ic3=new ImageIcon("img/3.jpg");
    private Icon ic4=new ImageIcon("img/4.jpg");
    private Icon ic5=new ImageIcon("img/5.jpg");
    private Icon ic6=new ImageIcon("img/6.jpg");
    private Icon ic7=new ImageIcon("img/7.jpg");
    private Icon ic8=new ImageIcon("img/8.jpg");
    private Icon ic9=new ImageIcon("img/9a.jpg");
    private Icon sampleIcon=new ImageIcon("img/sample.jpg");
    private JLabel movesLabel=new JLabel();

    private int moves;


    Main() {
        //Frame Setting:

        setLayout(null);
        setTitle("Picture Puzzle");
        setSize(630,550);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Button setting
        b1=new JButton(ic1);
        b2=new JButton(ic2);
        b3=new JButton(ic3);
        b4=new JButton(ic4);
        b5=new JButton(ic5);
        b6=new JButton(ic6);
        b7=new JButton(ic7);
        b8=new JButton(ic8);
        b9=new JButton(ic9);
        shuffle=new JButton("Shuffle");
        sampleButtton=new JButton(sampleIcon);
        b1.setBounds(10,80,100,100);
        b2.setBounds(110,80,100,100);
        b3.setBounds(210,80,100,100);

        b4.setBounds(10,180,100,100);
        b5.setBounds(110,180,100,100);
        b6.setBounds(210,180,100,100);

        b7.setBounds(10,280,100,100);
        b8.setBounds(110,280,100,100);
        b9.setBounds(210,280,100,100);

        sampleButtton.setBounds(400, 120,200,200);
       shuffle.setBounds(280, 400,80,50);

        JLabel label=new JLabel("Sample: ");
        label.setBounds(350,200,70,20);

        moves=0;

       movesLabel.setText("Moves: "+moves);
       movesLabel.setBounds(290,40, 100,10);

       //adding components


        add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(sampleButtton);add(shuffle);add(label);add(movesLabel);

        //adding actionListener to the buttons:

        b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);
        b4.addActionListener(this);b5.addActionListener(this);b6.addActionListener(this);
        b7.addActionListener(this);b8.addActionListener(this);b9.addActionListener(this);
        shuffle.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Icon t;
        if (e.getSource() == shuffle) {
            t = b1.getIcon();
            b1.setIcon(b7.getIcon());
            b7.setIcon(t);

            t = b5.getIcon();
            b5.setIcon(b3.getIcon());
            b3.setIcon(t);

            t = b9.getIcon();
            b9.setIcon(b4.getIcon());
            b4.setIcon(t);

            moves = 0;
        } else if (e.getSource() == b1) {
            if (b2.getIcon() == ic9) {
                t = b1.getIcon();
                b1.setIcon(b2.getIcon());
                b2.setIcon(t);
                moves++;
            } else if (b4.getIcon() == ic9) {
                t = b1.getIcon();
                b1.setIcon(b4.getIcon());
                b4.setIcon(t);
                moves++;
            }
        } else if (e.getSource() == b2) {
            if (b1.getIcon() == ic9) {
                t = b2.getIcon();
                b2.setIcon(b1.getIcon());
                b1.setIcon(t);
                moves++;
            } else if (b3.getIcon() == ic9) {
                t = b3.getIcon();
                b3.setIcon(b2.getIcon());
                b2.setIcon(t);
                moves++;
            } else if (b5.getIcon() == ic9) {
                t = b5.getIcon();
                b5.setIcon(b2.getIcon());
                b2.setIcon(t);
                moves++;
            }
        } else if (e.getSource() == b3) {
            if (b2.getIcon() == ic9) {
                t = b3.getIcon();
                b3.setIcon(b2.getIcon());
                b2.setIcon(t);
                moves++;
            } else if (b6.getIcon() == ic9) {
                t = b6.getIcon();
                b6.setIcon(b3.getIcon());
                b3.setIcon(t);
                moves++;
            }
        } else if (e.getSource() == b4) {
            if (b1.getIcon() == ic9) {
                t = b4.getIcon();
                b4.setIcon(b1.getIcon());
                b1.setIcon(t);
                moves++;
            } else if (b5.getIcon() == ic9) {
                t = b5.getIcon();
                b5.setIcon(b4.getIcon());
                b4.setIcon(t);
                moves++;
            } else if (b7.getIcon() == ic9) {
                t = b7.getIcon();
                b7.setIcon(b4.getIcon());
                b4.setIcon(t);
                moves++;
            }
        } else if (e.getSource() == b5) {
            if (b2.getIcon() == ic9) {
                t = b2.getIcon();
                b2.setIcon(b5.getIcon());
                b5.setIcon(t);
                moves++;
            } else if (b4.getIcon() == ic9) {
                t = b4.getIcon();
                b4.setIcon(b5.getIcon());
                b5.setIcon(t);
                moves++;
            } else if (b6.getIcon() == ic9) {
                t = b6.getIcon();
                b6.setIcon(b5.getIcon());
                b5.setIcon(t);
                moves++;
            } else if (b8.getIcon() == ic9) {
                t = b8.getIcon();
                b8.setIcon(b5.getIcon());
                b5.setIcon(t);
                moves++;
            }
        } else if (e.getSource() == b6) {
            if (b3.getIcon() == ic9) {
                t = b3.getIcon();
                b3.setIcon(b6.getIcon());
                b6.setIcon(t);
                moves++;
            } else if (b5.getIcon() == ic9) {
                t = b5.getIcon();
                b5.setIcon(b6.getIcon());
                b6.setIcon(t);
                moves++;
            } else if (b9.getIcon() == ic9) {
                t = b9.getIcon();
                b9.setIcon(b6.getIcon());
                b6.setIcon(t);
                moves++;
            }
        } else if (e.getSource() == b7) {
            if (b4.getIcon() == ic9) {
                t = b4.getIcon();
                b4.setIcon(b7.getIcon());
                b7.setIcon(t);
                moves++;
            } else if (b8.getIcon() == ic9) {
                t = b8.getIcon();
                b8.setIcon(b7.getIcon());
                b7.setIcon(t);
                moves++;
            }
        } else if (e.getSource() == b8) {
            if (b7.getIcon() == ic9) {
                t = b7.getIcon();
                b7.setIcon(b8.getIcon());
                b8.setIcon(t);
                moves++;
            } else if (b5.getIcon() == ic9) {
                t = b5.getIcon();
                b5.setIcon(b8.getIcon());
                b8.setIcon(t);
                moves++;
            } else if (b9.getIcon() == ic9) {
                t = b9.getIcon();
                b9.setIcon(b8.getIcon());
                b8.setIcon(t);
                moves++;
            }
        } else if (e.getSource() == b9) {
            if (b6.getIcon() == ic9) {
                t = b6.getIcon();
                b6.setIcon(b9.getIcon());
                b9.setIcon(t);
                moves++;
            } else if (b8.getIcon() == ic9) {
                t = b8.getIcon();
                b8.setIcon(b9.getIcon());
                b9.setIcon(t);
                moves++;
            }
        }

        //check success:
        if ((b1.getIcon() == ic1) && (b2.getIcon() == ic2) &&
                (b3.getIcon() == ic3) && (b4.getIcon() == ic4) &&
                (b5.getIcon() == ic5) && (b6.getIcon() == ic6) &&
                (b7.getIcon() == ic7) && (b8.getIcon() == ic8) &&
                (b9.getIcon() == ic9)) {
            if(moves>2) { //check cheat
                ic9=new ImageIcon("img/9.jpg");
                b9.setIcon(ic9);
                JOptionPane.showMessageDialog(null,"You win in "+moves+" moves!!");
            }
            else {
                JOptionPane.showMessageDialog(this,"DO NOT CHEAT!!!!","ALERT",JOptionPane.WARNING_MESSAGE);
                moves=0;
            }
        }
        movesLabel.setText("Moves: "+moves);

    }

    public static void main(String[] args) {
        new Main();
    }
}
