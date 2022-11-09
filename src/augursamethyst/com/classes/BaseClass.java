package augursamethyst.com.classes;
import java.util.Map;
import java.util.TreeMap;

public class BaseClass {
    private Map baseStats = new TreeMap<>();
    private int hitPoints = 50;
    private int level = 7;
    private int healthPotionCount = 3;

    public BaseClass(){

        this.baseStats.put("Strength", 10);
        this.baseStats.put("Intelligence", 10);
        this.baseStats.put("Agility", 10);
        this.baseStats.put("Power", 0);
        this.baseStats.put("Focus", 0);
        this.baseStats.put("Dexterity", 0);

    }

    public Map getCurrentStats(){
        return this.baseStats;
    }


//
    public void addLevel (){
        this.level++;
        System.out.println("Congratulations.  You have reached level " + this.level);
    }

    public String subtractHealth(String enemyName, String attackName, int attackNumber){
        this.hitPoints = this.hitPoints - attackNumber;
        return enemyName + " has hit you with " + attackName + " for " + attackNumber + ". Your health points have been reduced to " + this.hitPoints;

    }

    public String usePotion(){
        if(healthPotionCount > 0) {
            this.hitPoints = this.hitPoints + 25;
            if(this.hitPoints > 50) {
                this.hitPoints = 50;
            }
            return "Health potion used.  Your current health point count is " +this.hitPoints;
        } else {
            return "You do not have any health potions remaining in your inventory";
        }
    }

}
