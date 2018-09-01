package {{cookiecutter.game_package}};

import pt.up.fc.dcc.asura.builder.base.messaging.PlayerAction;
import pt.up.fc.dcc.asura.builder.base.messaging.StateUpdate;
import pt.up.fc.dcc.asura.builder.base.movie.GameMovieBuilder;
import pt.up.fc.dcc.asura.builder.base.GameState;

import java.util.Map;

/**
 * Stores the current state of the {{cookiecutter.game_name}} game
 *
 * @author {{cookiecutter.author_name}} <code>{{cookiecutter.author_email}}</code>
 */
public class {{cookiecutter.game_classname}}State implements GameState {

    @Override
    public void prepare(GameMovieBuilder movieBuilder, String title, Map<String, String> players) {

        // TODO
    }

    @Override
    public void execute(GameMovieBuilder movieBuilder, String playerId, PlayerAction action) {

        // TODO
    }

    @Override
    public StateUpdate getStateUpdateFor(String player) {

        // TODO
        return null;
    }

    @Override
    public void endRound(GameMovieBuilder movieBuilder) {

        // TODO
    }

    @Override
    public boolean isRunning() {

        // TODO
        return false;
    }

    @Override
    public void finalize(GameMovieBuilder movieBuilder) {

        // TODO
    }
}
