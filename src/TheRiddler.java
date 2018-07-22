import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog(null, "What is at the end of a rainbow?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(answer.equals ("w")) {
	
	JOptionPane.showMessageDialog(null, "correct!");
	score = score + 1;
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	
	JOptionPane.showMessageDialog(null, "no, it's the letter W.");
	
}
		// 6. Add some more riddles
String answer2 = JOptionPane.showInputDialog(null, "What room can no one enter?");
if(answer2.equals("a mushroom")) {
	
	JOptionPane.showMessageDialog(null, "correct!");
	score = score + 1;
}
else {
	
	JOptionPane.showMessageDialog(null, "no, it's a mushroom");
	
	
}		



// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}

