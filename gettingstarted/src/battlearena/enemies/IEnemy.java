package battlearena.enemies;

public interface IEnemy {
    public void talk();
    public void attack();
    public int getHealthPoints();
    public int  getAttackDamage();
    public int getHealthPointsRemaining();
    public void setHealthPointsRemaining(int healthPointsRemaining);
}
