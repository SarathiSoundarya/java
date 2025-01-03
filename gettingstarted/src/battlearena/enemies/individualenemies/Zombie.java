package battlearena.enemies.individualenemies;

import battlearena.enemies.Enemy;

public class Zombie extends Enemy implements IZombie {
    public Zombie( int healthPoints, int attackDamage){
        super(healthPoints, attackDamage);
    }
    @Override
    public void talk(){
        System.out.println("***Grumbling*****");
    }

    public void spreadinfection(){
        System.out.println("Zombie is trying to spread infection!!!");
    }
    @Override
    public void specialattack(){
        boolean didSpecialAttackWork=Math.random() <0.5;
        if (didSpecialAttackWork){
            setHealthPointsRemaining(getHealthPointsRemaining()+2);
            System.out.println("Zombie generated 2 HP!");
        }
        }
    public void battlestance(){
        System.out.println("Zombie cracks neck and sticks arms out!!!");
    }
    }

