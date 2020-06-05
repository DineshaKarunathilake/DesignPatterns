package com.example.oop.commands;

import com.example.oop.receiver.WifiRouter;

public class RouterOnCommand implements Command {

    WifiRouter router;

    public RouterOnCommand(WifiRouter router) {
        this.router = router;
    }

    @Override
    public void execute() {
        router.on();
    }

    @Override
    public void undo() {
        router.off();
    }
}
