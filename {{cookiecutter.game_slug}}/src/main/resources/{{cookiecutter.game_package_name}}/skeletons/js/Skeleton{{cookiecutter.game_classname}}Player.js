// ------------------------ Skeleton --------------------------------

load('{{cookiecutter.game_package_name}}/wrappers/js/{{cookiecutter.game_classname}}Player.js');

(function (exports) {'use strict';

    /**
     * {{cookiecutter.game_name}} player in Javascript
     *
     * @author {{cookiecutter.author_name}} <code>{{cookiecutter.author_email}}</code>
     */
    function My{{cookiecutter.game_classname}}Player() {
        {{cookiecutter.game_classname}}Player.call(this);
    }

    My{{cookiecutter.game_classname}}Player.prototype = Object.create({{cookiecutter.game_classname}}Player.prototype);

    // ---------------------- Your code below ---------------------------

    /**
     * Get the name of the player
     *
     * @returns {string} name of the player
     */
    My{{cookiecutter.game_classname}}Player.prototype.getName = function () {
        return '{{cookiecutter.author_name}}';
    };

    /**
     * Initialize the player
     */
    My{{cookiecutter.game_classname}}Player.prototype.init = function () {


    };

    /**
     * Execute player action
     */
    My{{cookiecutter.game_classname}}Player.prototype.execute = function () {


    };

    // ------------------------ Skeleton --------------------------------

    exports.Player = My{{cookiecutter.game_classname}}Player;
}(this));

