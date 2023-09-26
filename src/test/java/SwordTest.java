import com.codebase.Sword;
import com.codebase.WeaponType;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class SwordTest {

    private Sword sword;

    @Before
    public void before() {
        sword = new Sword(15, WeaponType.SWORD);
    }

    @Test
    public void hasDamage() {
        assertEquals(15, sword.getDamage());
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
