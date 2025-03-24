package com.waduclay.commandpatternboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
@RestController
@RequestMapping("/api/commands")
public class CommandController {
    private final CommandInvoker commandInvoker;
    private final CreateDocumentCommand createDocumentCommand;
    private final DeleteDocumentCommand deleteDocumentCommand;

    public CommandController(CommandInvoker commandInvoker, CreateDocumentCommand createDocumentCommand, DeleteDocumentCommand deleteDocumentCommand) {
        this.commandInvoker = commandInvoker;
        this.createDocumentCommand = createDocumentCommand;
        this.deleteDocumentCommand = deleteDocumentCommand;
    }
    @RequestMapping("/create-document")
    public void createDocument(@RequestParam String documentName) {
        commandInvoker.executeCommand(createDocumentCommand.setDocumentName(documentName));
    }

    @RequestMapping("/delete-document")
    public void deleteDocument(@RequestParam String documentName) {
        commandInvoker.executeCommand(deleteDocumentCommand.setDocumentName(documentName));
    }
}
