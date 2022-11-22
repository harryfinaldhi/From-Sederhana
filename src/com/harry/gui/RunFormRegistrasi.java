package com.harry.gui;

import javax.swing.*;

public class RunFormRegistrasi {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Form Registrasi");
        jFrame.setContentPane(new FormRegistrasi().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(500,400);
        jFrame.setVisible(true);
    }
}
