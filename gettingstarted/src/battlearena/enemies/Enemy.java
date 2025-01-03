package battlearena.enemies;

public abstract class Enemy implements IEnemy {

    private int id;
    private int healthPoints =10;
    private int attackDamage=1;
    public static int numberofEnemies;
    private int healthPointsRemaining;

    public Enemy(int healthPoints, int attackDamage){
        this.healthPoints=healthPoints;
        this.healthPointsRemaining=healthPoints;
        this.attackDamage=attackDamage;
        numberofEnemies++;
        this.id=numberofEnemies;
    }
    //getter
    public int getHealthPoints(){
        return healthPoints;
    }
    public int getAttackDamage(){
        return attackDamage;
    }
    public int getHealthPointsRemaining(){
        return healthPointsRemaining;
    }

    public static int getNumberofEnemies(){
        return numberofEnemies;
    }

    //setters
    public void setHealthPointsRemaining(int healthPointsRemaining){ this.healthPointsRemaining=healthPointsRemaining;}

    public void talk(){
        System.out.println("I am a Enemy be prepared to fight!!");
    }
    public void attack(){
        System.out.println("Enemy attacks for "+attackDamage+" damage");
    }
    public void specialattack(){
        System.out.println("Enemy does not have a special attack!");;
    }
}


