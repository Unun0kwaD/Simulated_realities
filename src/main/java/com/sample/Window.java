package com.sample;
import javax.swing.JOptionPane;

public class Window {
	public Window(){
	}
	public static void welcome() {
		JOptionPane.showConfirmDialog(null, "I will choose best movie with Simulated reality based on your preferentions","Welcome",JOptionPane.DEFAULT_OPTION);
	}
	public static Decision ask(String question) {
		Object[] options = {"Yes","No"};
		int n = JOptionPane.showOptionDialog(null,
		question,
		"Question",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null,     //do not use a custom Icon
		options,  //the titles of buttons
		options[0]); //default button title
		if (n==0) {
			return Decision.YES;
		}
		else if (n==1) {
			return Decision.NO;
		}
		//0 - Yes
		//1 - No 
		return Decision.OTHER;
    }
	
	public static void finish(String name) {
		JOptionPane.showConfirmDialog(null, "Movie(s) for you: " + name, "Result", JOptionPane.DEFAULT_OPTION);
	}
	
}