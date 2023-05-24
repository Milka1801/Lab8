/*public interface Fighter {
    void attack(Fighter victim);
    void takeHit(int damage);
}
*/

interface Fighter {
    void attack(Fighter victim);
    void takeHit(int damage);
    int getHealth();
    boolean isDead();
}
