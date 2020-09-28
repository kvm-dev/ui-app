package ru.geekbrains.gui;


import javax.swing.*;
import java.awt.*;

public class GameMap extends JPanel {

    public static final int MODE_HVH = 0;
    public static final int MODE_HVA = 1;

    public GameMap()
    {
        setBackground(new Color(0,50,80));
        Rectangle rectangle = new Rectangle();
       //часть с тем как нарисовать сетку...пока не придумал


    }

    void StartNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int winLength){
    System.out.printf("mode: %d, size: %dx%d, win:%d\n", gameMode, fieldSizeX, fieldSizeY, winLength );
    }
}
