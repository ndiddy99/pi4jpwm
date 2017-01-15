import java.util.Scanner;
public class PWMDemo {
	static PWM pwm = new PWM();

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Morse code translator");
		System.out.println("Have an LED plugged into pins 12 and 14 of the Pi's GPIO");
		Scanner in=new Scanner(System.in);
		System.out.println("Type something and it'll be translated to morse code");
		String input=in.nextLine();
		in.close();
		for (int i=0; i < input.length(); i++) {
			char c = input.toLowerCase().substring(i, i+1).toCharArray()[0];
			morseTranslate(c);
		}
	}

	static void morseTranslate(char letter) throws InterruptedException {
		if (letter == 'a') {
			dot();
			dash();
			System.out.print(" ");
		} else if (letter == 'b') {
			dash();
			dot();
			dot();
			dot();
			System.out.print(" ");
		} else if (letter == 'c') {
			dash();
			dot();
			dash();
			dot();
			System.out.print(" ");
		} else if (letter == 'd') {
			dash();
			dot();
			dot();
			System.out.print(" ");
		} else if (letter == 'e') {
			dot();
			System.out.print(" ");
		} else if (letter == 'f') {
			dot();
			dot();
			dash();
			dot();
			System.out.print(" ");
		} else if (letter == 'g') {
			dash();
			dash();
			dot();
			System.out.print(" ");
		} else if (letter == 'h') {
			dot();
			dot();
			dot();
			dot();
			System.out.print(" ");
		} else if (letter == 'i') {
			dot();
			dot();
			System.out.print(" ");
		} else if (letter == 'j') {
			dot();
			dash();
			dash();
			dash();
			System.out.print(" ");
		} else if (letter == 'k') {
			dash();
			dot();
			dash();
			System.out.print(" ");
		} else if (letter == 'l') {
			dot();
			dash();
			dot();
			dot();
			System.out.print(" ");
		} else if (letter == 'm') {
			dash();
			dash();
			System.out.print(" ");
		} else if (letter == 'n') {
			dash();
			dot();
			System.out.print(" ");
		} else if (letter == 'o') {
			dash();
			dash();
			dash();
			System.out.print(" ");
		} else if (letter == 'p') {
			dot();
			dash();
			dash();
			dot();
			System.out.print(" ");
		} else if (letter == 'q') {
			dash();
			dash();
			dot();
			dash();
			System.out.print(" ");
		} else if (letter == 'r') {
			dot();
			dash();
			dot();
			System.out.print(" ");
		} else if (letter == 's') {
			dot();
			dot();
			dot();
			System.out.print(" ");
		} else if (letter == 't') {
			dash();
			System.out.print(" ");
		} else if (letter == 'u') {
			dot();
			dot();
			dash();
			System.out.print(" ");
		} else if (letter == 'v') {
			dot();
			dot();
			dot();
			dash();
			System.out.print(" ");
		} else if (letter == 'w') {
			dot();
			dash();
			dash();
			System.out.print(" ");
		} else if (letter == 'x') {
			dash();
			dot();
			dot();
			dash();
			System.out.print(" ");
		} else if (letter == 'y') {
			dash();
			dot();
			dash();
			dash();
			System.out.print(" ");
		} else if (letter == 'z') {
			dash();
			dash();
			dot();
			dot();
			System.out.print(" ");
		} else if (letter == ' ') {
			System.out.println("/ ");
		}
	}

	static void dot() throws InterruptedException {
		System.out.print(".");
		pwm.setPwm(1024);
		Thread.sleep(50);
		pwm.setPwm(0);
	}

	static void dash() throws InterruptedException {
		System.out.print("-");
		pwm.setPwm(0);
		Thread.sleep(50);
	}
}
