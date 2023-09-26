import com.codebase.enemy.Orc;
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

    private Orc orc;

    @Before
    public void before() {
        sword = new Sword( WeaponType.SWORD);
        axe = new Axe( WeaponType.AXE);
        knight = new Knight("Sir Lancelot", 30, sword);
        orc = new Orc(30);
    }

    @Test
    public void canAttack() {
        assertEquals("You slashed the enemy for 10 damage. Enemy has 20 health remaining.", knight.getWeapon().attack(orc));
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
