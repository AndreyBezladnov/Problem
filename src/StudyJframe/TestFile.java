package StudyJframe;

import javax.swing.*;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Line2D;
import java.net.MalformedURLException;
import java.net.URL;

public class TestFile {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton = new JButton("submit");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.blue);
            }
        });
    }

    static class MyComponent extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Font font = new Font("Bitstream Charter ", Font.BOLD, 20);
            Graphics2D g2 = (Graphics2D)g;
            g2.setFont(font);
            g2.drawString("Hello World!",20,20);
            Line2D l2 = new Line2D.Double(70,70,90,90);
            g2.draw(l2);
            try {
                URL url = new URL("https://n1s2.hsmedia.ru/5b/ac/b7/5bacb7bac1d191b6165700db8d0231de/600x600_1_ac5d92e47fa557564c96a05c48d89fe5@1200x1200_0xac120004_10971449351678722049.jpeg");
                Image image = new ImageIcon(url).getImage();
                g2.drawImage(image,220,50,null);
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true); // сделать окно видимым
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // сделать так, что бы при нажатии на крестик программа закрывалась
        Toolkit toolkit = Toolkit.getDefaultToolkit(); // набор инструментов, при помощи которого например можно настроить где и каких размеров будет появляться окно
        Dimension dimension = toolkit.getScreenSize(); // dimension - размерность. Получаем доступ к размерам.
        jFrame.setBounds(dimension.width/2 - 250 ,dimension.height/2 - 150,500,300); // Bounds - граница, задаем границы
        jFrame.setTitle("errrrrr"); // будет вверху моего окна, типо как название окна
        return jFrame;
    }
}
