/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreria;
   
import java.awt.Dimension;
import javax.swing.JFrame;
/**
 *
 * @author fedem
 */
public class SCHERMO {
 static int larghezza = 1280;
 static   int altezza = 720;
 static final String nome_gioco = "libreria_vittorio";

public static void main(String[] args, Dimension dimensione_finestra) 
{
	libreria Libreria = new libreria ();
	 
	 JFrame finestra_libreria = new JFrame (nome_gioco);
	 finestra_libreria.setPreferredSize(dimensione_finestra);
	 finestra_libreria.setMaximumSize(dimensione_finestra);
	 finestra_libreria.setResizable(false);
	 
	 finestra_libreria.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	 finestra_libreria.pack();
	 finestra_libreria.setVisible(true);
	 }
}


