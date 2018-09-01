package {{cookiecutter.game_package}};

import org.junit.Assert;
import org.junit.Test;

/**
 * Test the manager of the {{cookiecutter.game_name}}.
 *
 * @author {{cookiecutter.author_name}} <code>{{cookiecutter.author_email}}</code>
 */
public class {{cookiecutter.game_classname}}ManagerTest {

    @Test
    public void minPlayersPerMatchTest() {
        {{cookiecutter.game_classname}}Manager manager = new {{cookiecutter.game_classname}}Manager();
        Assert.assertTrue("Minimum number of players should be greater or equal to 1",
            manager.getMinPlayersPerMatch() >= 1);
    }

    @Test
    public void maxPlayersPerMatchTest() {
        {{cookiecutter.game_classname}}Manager manager = new {{cookiecutter.game_classname}}Manager();
        Assert.assertTrue("Maximum number of players should be greater or equal to minimum number of players",
            manager.getMaxPlayersPerMatch() >= manager.getMinPlayersPerMatch());
    }
}
