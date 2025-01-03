package battlearena;
import battlearena.enemies.Enemy;
import battlearena.enemies.individualenemies.Ogre;
import battlearena.enemies.individualenemies.Zombie;
import battlearena.heros.Hero;
import battlearena.heros.weapons.Weapon;

import static battlearena.enemies.Enemy.getNumberofEnemies;

public class Main {
    public static void main(String[] args) {

        Zombie zombie= new Zombie(10,1);
        Ogre ogre = new Ogre(30,3);
        System.out.println("Enemy has health points "+zombie.getHealthPoints()+ " and can do an attack of  "+zombie.getAttackDamage());

        System.out.println("----------------------------------");
        System.out.println("There are "+getNumberofEnemies()+" enemies Ready to fight!!");
        System.out.println("Enemy 1: zombie");
        System.out.println("Enemy 2: Ogre");
        System.out.println("Battle Starts!!!!!!!!!!!!!");
        System.out.println("--------------------------------");
        zombie.spreadinfection();
        zombie.battlestance();
        battle(zombie, ogre);
        System.out.println("--------------------------------");

        Zombie zombie1= new Zombie(10,1);
        Weapon weapon = new Weapon("Sword",5);
        Hero hero=new Hero(25,1);
        hero.setWeapon(weapon);
        hero.equipWeapon();
        System.out.println("Hero Battle Starts!!!!!!!!!!!!!");
        System.out.println("--------------------------------");
        heroBattle(hero, zombie1);
        System.out.println("--------------------------------");

    }
    public static void battle(Enemy e1, Enemy e2){
        e1.talk();
        e2.talk();
        System.out.println("Enemy1: "+e1.getHealthPointsRemaining()+" HP left");
        System.out.println("Enemy2: "+e2.getHealthPointsRemaining()+" HP left");
        int i=1;
        while(e1.getHealthPointsRemaining()>0 && e2.getHealthPointsRemaining()>0){
            System.out.println("-------------------------------------");
            System.out.println("Round "+i);
            System.out.println("Special Attack-------->");
            e1.specialattack();
            e2.specialattack();
            System.out.println("Enemy1: "+e1.getHealthPointsRemaining()+" HP left");
            System.out.println("Enemy2: "+e2.getHealthPointsRemaining()+" HP left");
            System.out.println("Attack---------------->");
            e2.attack();
            e1.setHealthPointsRemaining(e1.getHealthPointsRemaining()-e2.getAttackDamage());
            e1.attack();
            e2.setHealthPointsRemaining(e2.getHealthPointsRemaining()-e1.getAttackDamage());
            System.out.println("Enemy1: "+e1.getHealthPointsRemaining()+" HP left");
            System.out.println("Enemy2: "+e2.getHealthPointsRemaining()+" HP left");
            System.out.println("\n\n");
            i++;
        }
        System.out.println("Battle ended--------->");
        if (e1.getHealthPointsRemaining()>0){
            System.out.println("Enemy 1 wins!");

        }
        else{
            System.out.println("Enemy 2 wins!");
        }
    }
    public static void heroBattle(Hero hero, Enemy enemy){
        System.out.println("Hero: "+hero.getHealthPointsRemaining()+" HP left");
        System.out.println("Enemy: "+enemy.getHealthPointsRemaining()+" HP left");
        int i=1;
        while(hero.getHealthPointsRemaining()>0 && enemy.getHealthPointsRemaining()>0) {
            System.out.println("-------------------------------------");
            System.out.println("Round " + i);
            System.out.println("Special Attack-------->");
            enemy.specialattack();
            System.out.println("Hero: " + hero.getHealthPointsRemaining() + " HP left");
            System.out.println("Enemy: " + enemy.getHealthPointsRemaining() + " HP left");
            enemy.attack();
            hero.setHealthPointsRemaining(hero.getHealthPointsRemaining() - enemy.getAttackDamage());
            hero.attack();
            enemy.setHealthPointsRemaining(enemy.getHealthPointsRemaining() - enemy.getAttackDamage());
            i++;
        }
        System.out.println("Battle ended--------->");
        if (enemy.getHealthPointsRemaining()>0){
            System.out.println("Enemy  wins!");

        }
        else{
            System.out.println("Hero wins!");
        }
        }
    }

