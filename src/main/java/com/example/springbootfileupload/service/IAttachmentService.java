package com.example.springbootfileupload.service;

import com.example.springbootfileupload.entity.Attachment;
import org.springframework.web.multipart.MultipartFile;

public interface IAttachmentService {

    Attachment saveAttachment(MultipartFile file) throws Exception;

    Attachment getAttachment(String fileId) throws Exception;
}
