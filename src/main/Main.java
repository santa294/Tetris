package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame window = new JFrame("Tetris");
        //установка заголовка
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //закрытие по умолчанию цццфыпри нажатии крестика
        window.setResizable(false);
        //размер окна будет фиксирован и не изменяем
        //добавление игровой панели
        GamePanel gp = new GamePanel();
        window.add(gp);
        window.pack();
        window.setLocationRelativeTo(null);
        //окно можно будет передвигать
        window.setVisible(true);
        gp.launchGame();
    }
}