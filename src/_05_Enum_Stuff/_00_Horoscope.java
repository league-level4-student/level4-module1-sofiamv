package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
public void Stuff(Zodiac a) {
	switch (a) {
	case ARIES:
		JOptionPane.showMessageDialog(null, "eat a banana");
		break;
	case TAURUS:
		JOptionPane.showMessageDialog(null, "eat an apple");
		break;
	case GEMINI:
		JOptionPane.showMessageDialog(null, "eat a mango");
		break;
	case CANCER:
		JOptionPane.showMessageDialog(null, "eat a kiwi");
		break;
	case LEO:
		JOptionPane.showMessageDialog(null, "eat a blueberry");
		break;
	case VIRGO:
		JOptionPane.showMessageDialog(null, "eat a grape");
		break;
	case SCORPIO:
		JOptionPane.showMessageDialog(null, "eat a coconut");
		break;
	case SAGITTARIUS:
		JOptionPane.showMessageDialog(null, "eat a strawberry");
		break;
	case CAPRICORN:
		JOptionPane.showMessageDialog(null, "eat an orange");
		break;
	case AQUARIUS:
		JOptionPane.showMessageDialog(null, "eat a nectarine");
		break;
	case PISCES:
		JOptionPane.showMessageDialog(null, "eat some broccoli");
		break;
	}
}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		_00_Horoscope c = new _00_Horoscope();
		Zodiac d = Zodiac.GEMINI;
		String b = JOptionPane.showInputDialog("what is your zodiac sign?").toLowerCase();
		switch (b) {
			case "aries":
				d = Zodiac.ARIES;
				break;
			case "taurus":
				d = Zodiac.TAURUS;
				break;
			case "gemini":
				d = Zodiac.GEMINI;
				break;
			case "cancer":
				d = Zodiac.CANCER;
				break;
			case "leo":
				d = Zodiac.LEO;
				break;
			case "virgo":
				d = Zodiac.VIRGO;
				break;
			case "libra":
				d = Zodiac.LIBRA;
				break;
			case "scorpio":
				d = Zodiac.SCORPIO;
				break;
			case "sagittarius":
				d = Zodiac.SAGITTARIUS;
				break;
			case "capricorn":
				d = Zodiac.CAPRICORN;
				break;
			case "aquarius":
				d = Zodiac.AQUARIUS;
				break;
			case "pisces":
				d = Zodiac.PISCES;
				break;
		}
		c.Stuff(d);
	}
}
