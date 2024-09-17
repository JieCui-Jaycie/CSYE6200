package edu.neu.csye6200;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a Java Program Console Output String!");

		//JOptionPane.showMessageDialog(null, "My first Java Swing program!");
	
		Person s = new Person();
		System.out.println("I am: "
				+ s.getFirstName()
				+ " " + s.getMi()
				+". " + s.getLastName()
				+ ", " + s.getAge()
				+" years of age!");
		System.out.println(s);
	}

}
