import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main{
    public static void main(String[] args){
        JFrame frame = new JFrame("Test Window");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);//レイアウト無効化
        
        //CardLayoutを使うパネル
        JPanel cards = new JPanel(new CardLayout());

        //----メモ----
        JPanel memoPage = new JPanel();
        JButton toBookMarkPage = new JButton("ブックマーク");
        memoPage.add(new JLabel("メモ"));
        memoPage.add(toBookMarkPage);

        //----ブックマーク----
        JPanel bookMarkPage = new JPanel();
        JButton toMemoPage = new JButton("メモ");
        bookMarkPage.add(new JLabel("ブックマーク"));
        bookMarkPage.add(memoPage);

        //カードに追加
        cards.add(memoPage, "メモ");
        cards.add(bookMarkPage, "ブックマーク");

        //ボタンを押したら画面を切り替える
        CardLayout cl = (CardLayout)(cards.getLayout());
        toBookMarkPage.addActionListener(e -> cl.show(cards, "bookMarkPage"));
        toMemoPage.addActionListener(e -> cl.show(cards, "memoPage"));


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