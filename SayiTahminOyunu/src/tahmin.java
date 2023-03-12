import java.util.Scanner;
public class tahmin {

	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int[] scores = new int[5]; // 5 oyuncunun doğru tahmin sayılarını saklayan dizi
	        int secretNumber = (int) (Math.random() * 100) + 1;
	        int guessCount = 0;
	        boolean gameOver = false;

	        while (!gameOver) {
	            System.out.print("Bir tahminde bulunun (1-100): ");
	            int guess = input.nextInt();
	            guessCount++;

	            if (guess < secretNumber) {
	                System.out.println("Çok düşük, tekrar deneyin.");
	            } else if (guess > secretNumber) {
	                System.out.println("Çok yüksek, tekrar deneyin.");
	            } else {
	                System.out.println("Tebrikler, doğru tahmin ettiniz!");
	                System.out.println("Tahmin sayınız: " + guessCount);

	                // Doğru tahmin sayısını saklayın ve liderlik tablosunu güncelleyin
	                System.out.print("Adınızı girin: ");
	                String name = input.next();
	                for (int i = 0; i < scores.length; i++) {
	                    if (scores[i] == 0 || guessCount < scores[i]) {
	                        scores[i] = guessCount;
	                        System.out.println(name + " liderlik tablosuna girdi #" + (i + 1));
	                        break;
	                    }
	                }

	                // Oyunu tekrar başlatın veya sonlandırın
	                System.out.print("Yeni bir oyun oynamak istiyor musunuz? (E/H): ");
	                String answer = input.next().toUpperCase();
	                if (answer.equals("E")) {
	                    secretNumber = (int) (Math.random() * 100) + 1;
	                    guessCount = 0;
	                } else {
	                    gameOver = true;
	                }
	            }
	        }

	}

}
