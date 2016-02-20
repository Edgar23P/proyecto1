import java.awt.GridBagLayout;
import java.awt.Container;
import javax.Swing.JFrame;
import javax.Swing.JButton;
import javax.Swing.Constraints;

public class GridBagLayout{
  public static void main(String args[]){
    String title = "GridBagLayout with grix ant gridy";
    JFrame frame= new JFrame(title);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container contentPane = frame.getContentPane();
    contentPane.setLayout(new GridBagLayout());

    //crear botones
    GridBagConstraints gbc = new GridBagConstraints();

    for(int y=0;y<3;y++){
      for(int x=0;x<3;x++){
        gbc.gridx=x;
        gbc.gridy=y;
        String text ="Button("+x+","+y+")";
        contentPane.add(new JButton(text),gbc);
      }

    }
    frame.pack();
    frame.setVisible(true);

  }






}
