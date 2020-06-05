package com.example.oop;

import com.example.oop.commands.LightOffCommand;
import com.example.oop.commands.LightOnCommand;
import com.example.oop.commands.RouterOffCommand;
import com.example.oop.commands.RouterOnCommand;
import com.example.oop.invoker.HomeAutoController;
import com.example.oop.receiver.Light;
import com.example.oop.receiver.WifiRouter;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        HomeAutoController controller = new HomeAutoController();

        Light light = new Light("Kitchen");
        WifiRouter wifiRouter = new WifiRouter();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        RouterOnCommand routerOnCommand = new RouterOnCommand(wifiRouter);
        RouterOffCommand routerOffCommand = new RouterOffCommand(wifiRouter);

        controller.setCommand(0, lightOnCommand,lightOffCommand);
        controller.setCommand(1, routerOnCommand,routerOffCommand);

        controller.onButtonPushed(0);
        controller.undoPushed();

        controller.onButtonPushed(1);


    }
}
