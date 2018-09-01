(function (exports) {'use strict';

    /**
     * Functions that provide game-specific functionality to {{cookiecutter.game_name}} players
     *
     * @author {{cookiecutter.author_name}} <code>{{cookiecutter.author_email}}</code>
     */
    var {{cookiecutter.game_classname}}Player = function () {
        PlayerWrapper.call(this);
    };

    {{cookiecutter.game_classname}}Player.prototype = Object.create(PlayerWrapper.prototype);

    /**
     * Update the state of the game on the player
     *
     * @param state_update {object} the state update
     */
    {{cookiecutter.game_classname}}Player.prototype.update = function (state_update) {
         
    };

    /**
     * Manage player lifecycle during the game, invoking the other methods when required
     */
    {{cookiecutter.game_classname}}Player.prototype.run = function () {
         
    };

    exports.{{cookiecutter.game_classname}}Player = {{cookiecutter.game_classname}}Player;
}(this));
