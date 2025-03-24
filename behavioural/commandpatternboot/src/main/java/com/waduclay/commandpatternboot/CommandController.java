package com.waduclay.commandpatternboot;


import org.springframework.web.bind.annotation.*;

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
    @PostMapping("/create-document")
    public String createDocument(@RequestParam String documentName) {
        commandInvoker.executeCommand(createDocumentCommand.setDocumentName(documentName));
        return "Document created successfully: " + documentName;
    }

    @DeleteMapping("/delete-document")
    public String deleteDocument(@RequestParam String documentName) {
        commandInvoker.executeCommand(deleteDocumentCommand.setDocumentName(documentName));
        return "Document deleted successfully: " + documentName;
    }
}
