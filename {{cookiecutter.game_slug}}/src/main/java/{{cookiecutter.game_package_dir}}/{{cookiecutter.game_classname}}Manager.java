package {{cookiecutter.game_package}};

import pt.up.fc.dcc.asura.builder.base.*;
import pt.up.fc.dcc.asura.builder.base.exceptions.BuilderException;
import pt.up.fc.dcc.asura.builder.base.exceptions.PlayerException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Manager of the {{cookiecutter.game_name}}.
 *
 * @author {{cookiecutter.author_name}} <code>{{cookiecutter.author_email}}</code>
 */
public class {{cookiecutter.game_classname}}Manager extends GameManager {
    
    @Override
    public String getGameName() {
        return "{{cookiecutter.game_name}}";
    }

    @Override
    public String getGameStateClassName() {
        return {{cookiecutter.game_classname}}State.class.getCanonicalName();
    }

    @Override
    public int getMaxPlayersPerMatch() {
        return 2;
    }

    @Override
    public int getMinPlayersPerMatch() {
        return 2;
    }

    @Override
    protected void manage(GameState state, Map<String, Process> players)
            throws BuilderException, PlayerException {

        if (players.size() < getMinPlayersPerMatch() || players.size() > getMaxPlayersPerMatch())
            throw new BuilderException("Invalid number of players: " + players.size());

        try (Streamer streamer = new Streamer(players)) {

            // collect player names
            Map<String, String> playerNames = new HashMap<>();
            for (String player : players.keySet()) {
                String name = getName(streamer.readActionFrom(player));
                playerNames.put(player, name);
            }

            // prepare state
            state.prepare(movieBuilder, getGameName(), playerNames);

            // run game
            // TODO

            // finalize state
            state.finalize(movieBuilder);

        } catch (IOException e) {
            throw new BuilderException(e.getMessage());
        }
    }

}
