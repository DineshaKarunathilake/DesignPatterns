package com.example.oop.commands;

import com.example.oop.receiver.WifiRouter;

public class RouterOffCommand implements Command {

    WifiRouter router;

    public RouterOffCommand(WifiRouter router) {
        this.router = router;
    }

    @Override
    public void execute() {
        router.off();
    }

    @Override
    public void undo() {
        router.on();
    }
}
