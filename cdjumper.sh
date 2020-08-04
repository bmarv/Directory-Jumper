#!/bin/sh

current_dir=$(java -cp $HOME/.Directory-Jumper/ DirectoryJumper $1)
cd $current_dir
if [[ "$OSTYPE" == "linux-gnu"* ]]; then
        # Linux Bash
        exec bash
elif [[ "$OSTYPE" == "darwin"* ]]; then
        # Mac OSX zsh
        exec zsh
fi