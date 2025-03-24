package com.waduclay.commandpatternboot;


import org.springframework.stereotype.Service;

import java.util.logging.Logger;

/**
 * @author <a href="mailto:developer.wadu@gmail.com">Willdom Kahari</a>
 */
@Service
public class DocumentService {
    private static final Logger LOG = Logger.getLogger(DocumentService.class.getName());
    public void createDocument(String documentName) {
        LOG.info("Creating document: " + documentName);
    }
}
