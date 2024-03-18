package com.s3onnection.S3.connection.service;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public interface S3Service {

    public String uploadNewFile (MultipartFile file);

    public String deleteFile();

    public String updateFile();
}
