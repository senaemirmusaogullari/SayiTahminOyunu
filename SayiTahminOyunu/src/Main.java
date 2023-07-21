import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Random random = new Random();
		
		int number = random.nextInt(100);
		
		Scanner input = new Scanner(System.in);
		
		int score = 100, less = 0, right = 0, predictNumber;
		int[] wrongNumbers = new int[5];
		boolean isWin = false, isWrong = false;

		System.out.println(" = Sayı Tahmin Oyunu = ");
		System.out.println("=======================");

		while (right < 5) {
			System.out.print((right + 1) + ". Tahmin : ");
			predictNumber = input.nextInt();

			if (predictNumber < 0 || predictNumber > 99) {
				System.out.println("0-100 arasında sayı giriniz!");
				if (isWrong) {
					right++;
					System.out.println("Hatalı Giriş 1 Hakkınızı Yedi :( Kalan Hak : " + (5 - right));
				} else {
					isWrong = true;
					System.out.println("Tekrar Hatalı Girişinde 1 Hakkın Gider!");
				}
				continue;
			}

			if (predictNumber == number) {
				isWin = true;
				System.out.println("Doğru Tahmin :) Kazandınız :) Puan : " + (score - less));
				break;
			} else {
				wrongNumbers[right] = predictNumber;
				right++;
				score -= 10;
				less += 10;
				if (predictNumber > number) {
					System.out.println("Aşağı in...");
				}
				if (predictNumber < number) {
					System.out.println("Yukarı çık...");
				}
				System.out.println("Kalan Hakkınız : " + (5 - right));
			}
		}
		if (!isWin) {
			System.out.println("Kaybettiniz :( Tutulan Sayı : " + number);
			System.out.println("Tahminleriniz : " + Arrays.toString(wrongNumbers));

		}
	}
}
