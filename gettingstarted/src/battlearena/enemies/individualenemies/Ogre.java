package battlearena.enemies.individualenemies;


import battlearena.enemies.Enemy;

public class Ogre extends Enemy {
    public Ogre( int healthPoints, int attackDamage){
        super(healthPoints, attackDamage);
    }
    @Override
    public void talk(){
        System.out.println("Ogre is slamming his hands all around");
    }
    @Override
    public void specialattack(){
        boolean didSpecialAttackWork=Math.random() <0.20; //mATH.RANDOM GENERATES NUM BETWEEN 0 &1
        if (didSpecialAttackWork){
            setHealthPointsRemaining(getHealthPointsRemaining()+4);
            System.out.println("Ogre generated 4 HP!");
        }
    }


}

