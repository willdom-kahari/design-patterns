package com.waduclay.commandpatternboot;


import org.springframework.stereotype.Component;

import java.util.Stack;
import java.util.logging.Logger;

/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
@Component
public class CommandInvoker {
    private final Stack<Command> commandHistory = new Stack<>();
    private static final Logger LOG = Logger.getLogger(CommandInvoker.class.getName());

    public void executeCommand(Command command){
        command.execute();
        commandHistory.push(command);
    }

    public void undoLastCommand(){
        if(!commandHistory.isEmpty()){
            Command command = commandHistory.pop();
            LOG.info("Last command undone");
        }
    }
}
