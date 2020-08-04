# Directory-Jumper

This program enables the User of a _Linux-Bash-_ or a _MacOS-zsh-_ command-line to jump into a subdirectory within the current path.\
Therefore the JVM determines the current path and returns the path to the user-defined target-directory into a shell-script.

## Usage

To change from a deeper location in the filesystem into a top-directory, it is possible to write this within one line:
```shell
cdj <Directory-Name>
```

## Installation

As Java 14.0.2 was used for the development, a reasonable **Java**-Version is needed for the installation. \
To get this program to work as intended, it is important to clone this repository into the Home-Directory and make this a hidden directory.

```shell
mv ~/Directory-Jumper/ ~/.Directory-Jumper/ 
```

Afterwards the Java-program needs to be compiled.

```shell
cd ~/.Directory-Jumper/
javac DirectoryJumper.java
```

Now, that the program is compiled, the execution is depending on whether the shell-script gets invoked. Here it is important
to know, whether a _bash_ or a _zsh_ -shell is used. This can be found out by running `ps -p $$` whithin the shell. \
When using a _zsh_ -shell, the file `~/.zshrc` needs an alias to be set with `alias cdj='sh ~/.Directory-Jumper/cdjumper.sh'` in an independent line. 
To update this file, `source ~/.zshrc` needs to be invoked.\
The steps for a _bash_ -shell are analogical. 

### Acknowledgement

This program was build independently within half a day as a simple hack for more efficient command-line usage and as a simple Java practice.\
Suggestions and Ideas are welcome.
