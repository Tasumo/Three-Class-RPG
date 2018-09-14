
public class Monster {
	private String name;
	private int health;
	private int spellPower;

	public Monster(String Monstername,int Monsterhealth,int monsterSpellPower){
		name = Monstername;
		health=Monsterhealth;
		spellPower=monsterSpellPower;
	}
	public String getName(){
		return name;
	}
	
	public int attackPower(){
		return spellPower;
	}
	public boolean recieveDamage(int damage){
		health=health-damage;
		return isAlive();
	}
	public boolean isAlive(){
		if(health>0){
			return true;
		}else{
			return false;
		}
	}
}

