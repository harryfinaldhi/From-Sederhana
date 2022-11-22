package com.harry.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormRegistrasi {
    private JTextField textNama;
    private JTextField textNim;
    private JTextField textProdi;
    private JButton buttonSubmit;
    private JPanel rootPanel;
    private JLabel labelHasil;

    public FormRegistrasi() {
        buttonSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Mengambil data dari textNama
                String nama = textNama.getText();
                //Mengambil data dari textNim
                String nim = textNim.getText();
                //Mengambil data dari textProdi
                String prodi = textProdi.getText();
                //Diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setNim(nim);
                mhs.setProdi(prodi);
                //Tampilkan output ke FORM
                labelHasil.setText(mhs.toString());
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }
}
