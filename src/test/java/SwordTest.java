import com.codebase.enemy.Troll;
import com.codebase.weapon.Sword;
import com.codebase.weapon.WeaponType;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class SwordTest {

    private Sword sword;
    private Troll troll;

    @Before
    public void before() {
        sword = new Sword( WeaponType.SWORD);
        troll = new Troll(40);
    }

    @Test
    public void hasDamage() {
        assertEquals(10, sword.getDamage());
    }

    @Test
    public void hasWeaponType() {
        assertEquals("Sword", sword.getWeaponType());
    }

    @Test
    public void canAttack() {
        assertEquals("You slashed the enemy for 10 damage. Enemy has 30 health remaining.", sword.attack(troll));
    }
}
