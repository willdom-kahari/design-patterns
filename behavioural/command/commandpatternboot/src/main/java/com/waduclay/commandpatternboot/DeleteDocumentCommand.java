package com.waduclay.commandpatternboot;


import org.springframework.stereotype.Component;

/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
@Component
public class DeleteDocumentCommand implements Command{
    private final DocumentService documentService;
    private String documentName;

    public DeleteDocumentCommand(DocumentService documentService) {
        this.documentService = documentService;
    }
    public DeleteDocumentCommand setDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }

    @Override
    public void execute() {
        documentService.deleteDocument(documentName);
    }
}
