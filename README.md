Barebones Asura Challenge - Maven
=================================
[![License: Artistic-2.0](https://img.shields.io/badge/License-Artistic%202.0-0298c3.svg)](https://opensource.org/licenses/Artistic-2.0)


This is a cookiecutter template for scaffolding an Asura challenge project based on Maven.

## Tools used
* [cookiecutter](https://github.com/audreyr/cookiecutter)
* [Maven](https://maven.apache.org/)

## Scaffolding
```bash
$ asura-cli create maven

author_name [John Doe]: 
author_email [johndoe@myorganization.com]: 
group_id [pt.up.fc.dcc.asura]: 
game_name [Awesome Game]: 
game_classname [AwesomeGame]: 
game_slug [awesome-game]: 
game_package_name [awesomegame]: 
game_package [pt.up.fc.dcc.asura.awesomegame]: 
game_package_dir [pt/up/fc/dcc/asura/awesomegame]: 
game_version [0.0.1]:
```

## Usage

Run tests
```bash
asura-cli test
```

Run game
```bash
asura-cli run
```

Package game
```bash
asura-cli package
```

## Contribute
1. Fork it!
2. Create your feature branch: `git checkout -b my-new-feature`
3. Commit your changes: `git commit -am 'Add some feature'`
4. Push to the branch: `git push origin my-new-feature`
5. Submit a pull request :)

## Authors
[José Carlos Paiva](https://github.com/josepaiva94) and [José Paulo Leal](https://github.com/zpleal)

## License
Licensed under [Artistic License 2.0 (Artistic-2.0)](LICENSE.md)
