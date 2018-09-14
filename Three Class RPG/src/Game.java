import java.util.Scanner;
import java.util.ArrayList;
public class Game{
	private static Player player;
	private static Scanner sc;

	public static void main(String[] args){
		sc = new Scanner(System.in);
		System.out.println("Welcome to your adventure! This game is where try to collect items and get bonuses to get the most money!!");
		System.out.println("Enter your name:");
		String playerName = sc.next();
		Player player=new Player(playerName);
		Player.Intro();
		Player.step0();
		Player.step1();
		Player.step2();
		Player.printInventory();
		Player.Money();
		PurchasedItem Item= new PurchasedItem(playerName);
		Item.printPic();
	}
}
