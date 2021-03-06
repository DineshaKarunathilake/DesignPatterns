package com.example.oop.invoker;

import com.example.oop.commands.Command;
import com.example.oop.commands.NoCommand;

public class HomeAutoController {

    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;


    public HomeAutoController() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();

        for (int i = 0; i < 7; i++) {

            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand (int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;

    }

    public void onButtonPushed (int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonPushed (int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoPushed () {
        undoCommand.undo();
    }
}
