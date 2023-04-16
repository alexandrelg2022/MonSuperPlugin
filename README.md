# MonSuperPlugin

## About / Synopsis

* A base Spigot plugin to add some cool features on your server
* Project status: working/prototype
* Project Support

## Table of contents

> * [MonSuperPlugin](#title--repository-name)
    >   * [About / Synopsis](#about--synopsis)
>   * [Table of contents](#table-of-contents)
>   * [Installation](#installation)
>   * [Usage](#usage)
      >     * [Screenshots](#screenshots)
>     * [Features](#features)
>   * [Code](#code)
      >     * [Content](#content)
>     * [Requirements](#requirements)
>     * [Limitations](#limitations)
>     * [Build](#build)
>     * [Deploy (how to install build product)](#deploy-how-to-install-build-product)
>   * [Resources (Documentation and other links)](#resources-documentation-and-other-links)
>   * [Contributing / Reporting issues](#contributing--reporting-issues)
>   * [License](#license)
>   * [About Nuxeo](#about-nuxeo)

## Installation

> Clone the repo wherever you want! You're ready to code!

## Usage

### Screenshots

No screenshots available!

### Features

- > Custom Join/Quit messages & join title
- > Custom Chat handling

## Code

### Content

Folders structure:
> `/libs` - External Java Libs
> 
> `/src/fr/alexandrelg2022/monSuperPlugin/commands` - The plugin commands
> 
> `/src/fr/alexandrelg2022/monSuperPlugin/events` - The events handlers
> 
> `/src/fr/alexandrelg2022/monSuperPlugin/services` - The services managers such as database
> 
> `/src/fr/alexandrelg2022/monSuperPlugin/structure` - Custom interfaces to make the code easier
>
> `/src/fr/alexandrelg2022/monSuperPlugin/utils` - Utils folder

### Requirements

- The IntelliJ IDE to a better code experience & the official build artefact! (optional)

### Build

In order to build the project in a classic way, you have to get the excepted requirements.

    Build -> Build Artifacts... -> MonSuperPlugin.jar -> Build

The build output path is in the out folder of the project.

### Deploy

> Copy the built artifacts into `$SERVER_PATH/plugins` and `restart` the server.

Note: you also can ``reload`` the server but it may cause plugin misfunctioning.

## Resources (Documentation and other links)

## Contributing / Reporting issues

Join [My Discord](https://discord.gg/E6CTED7p6K) and send me a private message.
You can also open a pull request, but you better talk me about your contribution!

## License

[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

## About MonSuperPlugin

MonSuperPlugin is a 1.19.4 Spigot/bukkit plugin that add cool features to your minecraft server. You can see the features above!

This project was once created when I needed to add some features to my personal minecraft server with my friends.

Do not hesitate to contribute to the project. But please respect the common JavaDoc & project structure.

More information is available at [www.alex-development.com/x/monSuperPlugin](www.alex-development.com/x/monSuperPlugin).