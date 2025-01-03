package battlearena.heros;

import battlearena.heros.weapons.Weapon;

public class Hero implements IHero {
    private int healthPoints;
    private int healthPointsRemaining;
    private int attackDamage;
    private boolean isWeaponEquipped=false;

    //Composition
    private Weapon weapon;
    public Hero (int healthPoints, int attackDamage){
        this.healthPoints=healthPoints;
        this.healthPointsRemaining=healthPoints;
        this.attackDamage=attackDamage;
    }
    public int getHealthPoints(){
        return healthPoints;
    }
    public int getHealthPointsRemaining(){
        return healthPointsRemaining;
    }
    public void setHealthPointsRemaining(int healthPointsRemaining){
        this.healthPointsRemaining=healthPointsRemaining;
    }
    public int getAttackDamage(){
       return attackDamage;
    }
    public void setAttackDamage(int attackDamage){
        this.attackDamage=attackDamage;
    }
    public Weapon getWeapon(){
        return weapon;
    }
    public void setWeapon(Weapon weapon){
        this.weapon=weapon;
    }
    public boolean isWeaponEquipped(){
        return isWeaponEquipped;
    }
    public void setWeaponEquipped(boolean isWeaponEquipped){
        this.isWeaponEquipped=isWeaponEquipped;
    }
    public void attack(){
        System.out.println("Hero attacks for "+attackDamage+" attackdamage");
    }
    public void equipWeapon(){
        if (getWeapon()!=null&& !isWeaponEquipped()){
            setAttackDamage(getAttackDamage()+weapon.getAttackIncrease());
            setWeaponEquipped(true);
        }
    }
}

