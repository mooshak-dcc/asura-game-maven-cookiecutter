// ------------------------ Skeleton --------------------------------

load('{{cookiecutter.game_package_name}}/wrappers/es6/{{cookiecutter.game_classname}}Player.js');

(function (exports) {'use strict';

    /**
     * {{cookiecutter.game_name}} player in Javascript
     *
     * @author {{cookiecutter.author_name}} <code>{{cookiecutter.author_email}}</code>
     */
    class My{{cookiecutter.game_classname}}Player extends {{cookiecutter.game_classname}}Player {

        // ---------------------- Your code below ---------------------------

        /**
         * Get the name of the player
         *
         * @returns {string} name of the player
         */
        getName() {
            return '{{cookiecutter.author_name}}';
        }

        /**
         * Initialize the player
         */
        init() {

        }

        /**
         * Execute player action
         */
        execute() {

        }
    }


    // ------------------------ Skeleton --------------------------------

    exports.Player = My{{cookiecutter.game_classname}}Player;
}(this));
