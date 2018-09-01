(function (exports) {'use strict';

    /**
     * Functions that provide game-specific functionality to {{cookiecutter.game_name}} players
     *
     * @author {{cookiecutter.author_name}} <code>{{cookiecutter.author_email}}</code>
     */
    class {{cookiecutter.game_classname}}Player extends PlayerWrapper {

        constructor() {
            super();
        }

        /**
         * Update the state of the game on the player
         *
         * @param state_update {object} the state update
         */
        update(state_update) {

        }

        /**
         * Manage player lifecycle during the game, invoking the other methods when required
         */
        run() {

        }
    }

    exports.{{cookiecutter.game_classname}}Player = {{cookiecutter.game_classname}}Player;
}(this));
