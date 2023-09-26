import com.codebase.weapon.Sword;
import com.codebase.weapon.WeaponType;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class SwordTest {

    private Sword sword;

    @Before
    public void before() {
        sword = new Sword( WeaponType.SWORD);
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
        assertEquals("Slash", sword.attack());
    }
}
