import com.codebase.player.fighter.Knight;
import com.codebase.weapon.Axe;
import com.codebase.weapon.Sword;
import com.codebase.weapon.WeaponType;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class KnightTest {
    private Knight knight;
    private Sword sword;
    private Axe axe;

    @Before
    public void before() {
        sword = new Sword(10, WeaponType.SWORD);
        axe = new Axe(20, WeaponType.AXE);
        knight = new Knight("Sir Lancelot", 30, sword);
    }

    @Test
    public void canAttack() {
        assertEquals("Slash", knight.getWeapon().attack());
    }

    @Test
    public void hasName() {
        assertEquals("Sir Lancelot", knight.getName());
    }

    @Test
    public void canGetWeapon() {
        assertEquals("Sword", knight.getWeapon().getWeaponType());
    }

    @Test
    public void canSetWeapon() {
        knight.setWeapon(axe);
        assertEquals("Axe", knight.getWeapon().getWeaponType());
    }
}
