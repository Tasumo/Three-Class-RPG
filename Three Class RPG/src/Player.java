import java.util.ArrayList;
import java.util.Scanner;

//Stage 1
public class Player {
	//private String name;
	public static boolean isJanitor=false;
	public static boolean isVigilante=false;
	public static boolean isSerialkiller=false;
	public int health;
	public static int money;
	public static ArrayList<String>classList = new ArrayList<String>();
	//private int level;
	//private int numFights;
	//private int numMoves;
	public Player(String playername){
		health=10;
		money=0;
	}
	public static ArrayList<String>inventory= new ArrayList<String>();
	public static void Intro(){
		classList.add("Janitor");
		classList.add("Vigilante");
		classList.add("Serial Killer");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Role you want to become deciding your starting money: Janitor, Vigilante, Serial Killer");
		String choice=sc.next();
		if(choice.equalsIgnoreCase("Janitor")){
			System.out.println("Background: You the Janitor will go around getting a lot of bonuses picking things up ");
			isJanitor=true;
			money=10;
			System.out.println("You start off with " + money + " dollars");
		}else if(choice.equalsIgnoreCase("Vigilante")){
			System.out.println("Background: You the Vigilante will go around getting will get equal amounts for picking and killing things");
			isVigilante=true;
			money=15;
			System.out.println("You start off with " + money + " dollars");
		}else{
			System.out.println("Background: You the Serial Killer will go around getting a lot of bonuses by killing things");
			isSerialkiller=true;
			money=20;
			System.out.println("You start off with " + money + " dollars");
		}
	}
	public static void step0(){
		//int x=(int)(Math.random()*3);
		Scanner sc= new Scanner(System.in);
		System.out.println("A slime has appeared would you like to attack? Yes/No");
		System.out.println(">_>");
		String response = sc.next();
		if(response.equalsIgnoreCase("Yes")){
			System.out.println("After killing the slime you can get Slime Jelly yes or no");
			String response1 = sc.next();
			if(response1.equalsIgnoreCase("yes")){
				System.out.println("Slime Jelly has been added to your inventory!!");
				inventory.add("Slime Jelly");
			}else if(response1.equalsIgnoreCase("no")){
				System.out.println("It's a shame you didn't pick up the jelly it  might of been worth something!!");
				System.out.println("Your regret makes you lose money");
				money-=randomNumber(5,10);
				System.out.println("You have "+ money + " left");
			}
		}
		if(response.equalsIgnoreCase("No")){
			System.out.println("You continue walking down the road seeing skeletons you are forced to attack them or else you will take massive damage");
			System.out.println("After killing the skeletons you can get bone fragments");
			System.out.println("Bone Fragments has been added to your inventory!!");
			inventory.add("bone fragments");
		}
}
public static void step1(){
	Scanner sc= new Scanner(System.in);
	System.out.println("This might be a trap!");
	System.out.println("You found a gold nugget would you like to pick it up Yes/No?");
	String response=sc.next();
	if(response.equalsIgnoreCase("Yes")){
		System.out.println("Gold nugget has been added to your inventory!");
		inventory.add("Gold nugget");
	}else if(response.equalsIgnoreCase("No")){
		System.out.println("You get ignore the gold nugget and find some stardust!!!");
		inventory.add("Stardust");
	}
}
public static void step2(){
	Scanner sc= new Scanner(System.in);
	System.out.println("You have the option to pick up the gold coins outside the duegon or find a secret passageway type gold or passageway");
	String response=sc.next();
	if(response.equalsIgnoreCase("gold")){
		System.out.println("Gold pieces has been added to your inventory!");
		inventory.add("Gold pieces");
	} else if(response.equalsIgnoreCase("passageway")){
		stepOpt1();
	}
}
public static void stepOpt1(){
	Scanner sc= new Scanner(System.in);
	System.out.println("Would you like to go left or right in the duegon");
	System.out.println("<---------- Left Right ------------->");
	String directionResponse=sc.next();
	if(directionResponse.equalsIgnoreCase("left")){
		System.out.println("You got kicked out of the duegon and earned nothing");
	}else{
		System.out.println("You found an pistol  which is worth a lot! Good Job!");
		System.out.println("..._...|..____________________, ,)");
		System.out.println("....../ `---___________----_____|]");
		System.out.println("...../_==o;;;;;;;;_______.:/"); 
		System.out.println(".....), ---.(_(__) /"); 
		System.out.println("....// (..) ), ----"); 
		System.out.println("...//___//"); 
		System.out.println("..//___//");
		System.out.println(".//___//");
		inventory.add("pistol");
		money+=randomNumber(10,20);
		if(isSerialkiller=true){
			money+=randomNumber(5,10);
		}
		if(isVigilante=true){
			money+=randomNumber(0,5);
		}
	}
}
public static void printInventory(){
	System.out.print("You have these following items in your inventory");
	System.out.println(inventory);
}
public static void Money(){
	for(int i=0;i<inventory.size();i++){
		if(inventory.get(i)!=null){
			money+=randomNumber(0,5);
		}
	}
	/*if(isVigilante==true){
		money=money*2;
	}
	if(isSerialkiller==true){
		money=money*2;
	}
	if(isJanitor==true){
		money=money*2;
	}*/
	System.out.println("You have " + money + " dollars");
}
public static void printPic(){
	System.out.println("_________¶¶¶¶¶_________¶____¶");
	System.out.println("_________¶__¶¶¶¶¶¶_____¶____¶");
	System.out.println("_________¶____¶¶__¶¶___¶____¶___¶¶");
	System.out.println("__________¶_____¶¶__¶¶_¶____¶¶¶¶¶¶¶");
	System.out.println("__________¶______¶¶__¶_¶¶¶¶____¶¶¶");
	System.out.println("¶¶¶_________¶¶______¶__¶¶__________¶¶");
	System.out.println("¶__¶__________¶¶¶____¶¶________¶¶¶¶¶¶¶");
	System.out.println("¶___¶__________¶¶¶¶_______________¶");
	System.out.println("¶__¶_____________¶________¶_¶¶¶___¶");
	System.out.println("_¶_¶_____________¶_______¶_¶_¶¶___¶");
	System.out.println("_¶¶______________¶_________¶_¶¶___¶");
	System.out.println("_¶_¶_____________¶_________¶¶¶_____¶¶¶");
	System.out.println("_¶_¶_____________¶__¶__________¶¶____¶");
	System.out.println("_¶_¶______________¶___¶________¶_¶¶__¶");
	System.out.println("_¶__¶_____________¶____¶¶_______¶¶¶¶¶");
	System.out.println("__¶__¶¶¶¶¶¶¶¶____¶¶______¶¶¶¶¶¶¶¶¶¶¶");
	System.out.println("___¶_________¶¶¶¶¶¶________¶");
	System.out.println("__¶________________________¶");
	System.out.println("__¶________________________¶");
	System.out.println("__¶________________________¶");
	System.out.println("___¶________¶_________¶¶___¶");
	System.out.println("____¶_______¶___¶______¶__¶¶¶¶¶¶");
	System.out.println("__¶¶_______¶____¶______¶¶¶_____¶");
	System.out.println("_¶______¶¶¶¶¶¶¶_¶_____¶¶¶¶¶¶¶___¶");
	System.out.println("__¶___¶¶__¶__¶_¶¶¶___¶______¶__¶");
	System.out.println("___¶__¶____¶__¶__¶__¶____¶¶¶__¶");
	System.out.println("____¶__¶____¶__¶ ¶__¶___¶¶__¶¶");
	System.out.println("____¶__¶_____¶¶¶¶¶__¶___¶¶¶¶");
	System.out.println("____¶¶¶¶______¶¶¶¶__¶");
	System.out.println("____¶¶¶¶__________¶__¶");
	System.out.println("___________________¶¶¶¶");
	System.out.println("___________________¶¶¶¶"); //copied from online - :D- ASCII Art
}
public boolean isAlive(){
	if(health>0){
		return true;
	}else{
		return false;
	}
}
public static int randomNumber(int min, int max){     
	return (int)(Math.random()*(max-min)+1)+min;
}

}




