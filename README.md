# Liberty-plugin

The Liberty Eiffel Eclipse plugin/IDE

The Eclipse IDE (Integrated Developement Environment) is a full featured programming editor with many fantastic features to help you code more quickly and easily. This plugin bridges that gap and helps move you to a more powerful development environment. It works on MS Windows, Mac OSX and Linux.


# Build
Below are instructions on how to download and compile the source code from the command line and from eclipse. You only need to do one. Also subscribe to the developers list by sending a mail for support questions.


## Quick Installation 
### Prerequisites

Please install [git] (http://git-scm.com/downloads) and [maven] (http://maven.apache.org/download.cgi).

### Build from source

```bash
git clone https://github.com/Imhotup/LibertyEiffel-eclipse-plugin
cd LibertyEiffel-eclipse-plugin
mvn clean verify
```


### Running the IDE/Plugin

Windows

 * win32x64.cmd (if you are on 64 bits windows)
 * win32x32.cmd (if you are on 32 bits windows)
 
Mac OSX and Linux
 
 * 

=======

## Build Options

You can control the maven build with the following profiles:

* luna (builds agains the luna repositories (4.4))
* mars (builds agains the mars repositories (4.5))
* win32 (builds for 32 bit windows)
* win64 
* linux32
* linux64
* mac64

##### Examples:

```bash
mvn verify -Plinux32 (builds for luna and linux 32 bits)
mvn verify -Pwin32,mars,linux32
```

To build for mars and the platform you are running on:

```bash
mvn clean verify 
```


## Developing (Improving) the Plugin

 * Fork the repository on GitHub (https://help.github.com/articles/fork-a-repo) for your changes. Note that your git link should look like this: https://github.com/YOUR_FORK/LibertyEiffel-eclipse-plugin.git –– we will use it later.
 * Checkout locally
 * Make changes
 * Run ```mvn clean verify``` to build 
 * Open the self-contained IDE and verify your fix
 * (Anything special about Travis CI & builds?)


#### Adding Eclipse PDE (Plugin Development Environment)

You should already have a supported Eclipse version installed (the CDT package makes a good start point). Let's add:

> Help → Install New Software → Work with: → All Available Sites

Now search/select the *Eclipse Plug-in Development Environment*

Note: This may take a while to download all the available packages.


#### Adding Eclipse JDT (Java Development Tools)

If you're not using Eclipse with the JDT you'll need to install them. To do this you first need to open the Dialog for installing new Software:

> Help → Install New Software

There you select for *Work with:*  *YOUR_ECLIPSE_RELEASE - http://download.eclipse.org/releases/YOUR_ECLIPSE_RELEASE*

After that, select
 
> Programming Languages → Eclipse Java Development Tools

#### Add EGit - Eclipse Git Team Provider

To install EGit you'll need to do the following:

> Help → Install New Software

There have to enter the following URL and press ENTER.

 * http://download.eclipse.org/egit/updates

Now you have to open up the *Eclipse Git Team Provider* Category and select *Eclipse Git Team Provider*. 
Then press next and follow the instructions.

### Importing an LibertyEiffel Plugin Project into Eclipse

After you installed all the plugins you'll need to restart Eclipse.

Eventually your plugin source code will be ready to be used with Eclipse. There are two ways to import your projects into Eclipse:

#### 1. Via a Command Line

If you're using Windows you should first install [GitHub for Windows](http://windows.github.com/).

First you should open a command line, and change the directory to the directory where you want to store your Project.

Now you have to clone your Fork:

```bash
 $ git clone https://github.com/YOUR_FORK/liberty-eclipse-plugin.git
```

After that you should import the Project to Eclipse:

> File → Import → Plug-in Development → Plug-ins and Fragments


You may need to change the directory to match the directory where you cloned the project into.

Press Next.

In the next window you have to select which Plug-in fragments you want to import.
Select all that are appropriate:

Now press Finish, and it should import the selected Projects.


### Running the Plugin

Then running is very simple - just right click it.bayaens.arduino.core and select:

> Run as → Eclipse Application

OR, if you'd like to debug,
 
> Debug as → Eclipse Application

Eclipse will launch a new workbench disabling the installed version if any, and updating it with the plugin version loaded in the current workspace.

![]()

Now, just set up fresh again with your project settings, Preferences/LibertyEiffel, to point to IDE and private libs.

> New Project → 

All should work. You can set breakpoints in the launching Eclipse if you ran as debug. Happy developing!

[<img border="0" style="border-width: 0px" src="http://with-eclipse.github.io/with-eclipse-1.jpg">](http://with-eclipse.github.io/) 

