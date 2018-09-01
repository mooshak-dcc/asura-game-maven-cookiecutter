import {{cookiecutter.game_package_name}}.wrappers.java.{{cookiecutter.game_classname}}Player;

import java.util.Random;

/**
 * {{cookiecutter.game_name}} player in Java
 *
 * @author {{cookiecutter.author_name}} <code>{{cookiecutter.author_email}}</code>
 */
public class My{{cookiecutter.game_classname}}Player extends {{cookiecutter.game_classname}}Player {

    @Override
    public String getName() {
        return "{{cookiecutter.author_name}}";
    }

    @Override
    public void init() {


    }

    @Override
    public void execute() {


    }
}
