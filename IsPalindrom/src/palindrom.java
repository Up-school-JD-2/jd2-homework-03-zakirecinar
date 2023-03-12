import java.util.Scanner;
public class palindrom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Kelime girin: ");
        String kelime = input.nextLine();

        // Kelimenin tersini çevirme
        String tersKelime = "";
        for (int i = kelime.length() - 1; i >= 0; i--) {
            tersKelime += kelime.charAt(i);
        }

        // Palindrom kontrolü
        if (kelime.equalsIgnoreCase(tersKelime)) {
            System.out.println("Girilen kelime bir palindromdur.");
        } else {
            System.out.println("Girilen kelime bir palindrom değildir.");
        }

	}

}
