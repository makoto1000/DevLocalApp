import javax.swing.*;

public class Main{
    public static void main(String[] args){
        JFrame frame = new JFrame("Test Window");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);//レイアウト無効化
        

        JButton configButton = new JButton("設定");
        JButton editButton = new JButton("編集");
        configButton.setBounds(0, 0, 60, 20);
        editButton.setBounds(60, 0, 60,20 );
        //x座標、y座標、幅、高さ
        frame.add(configButton);
        frame.add(editButton);
        frame.setVisible(true);
    }
}