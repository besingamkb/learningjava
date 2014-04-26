import javax.swing.JOptionPane;

public class student {

	public static void main(String[] args) {
		String studentFirstName = JOptionPane.showInputDialog("Student First Name");
		String studentLastName = JOptionPane.showInputDialog("Student Last Name");

		String fullname = studentFirstName + " " + studentLastName;

		JOptionPane.showMessageDialog(null, fullname, "Student Name", JOptionPane.PLAIN_MESSAGE);
	} 
}