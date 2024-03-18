package com.s3onnection.S3.connection.controller;

import com.s3onnection.S3.connection.service.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

@RestController
@RequestMapping("/s3")
public class Controller {

    @Autowired
    S3Service s3Service;

    @PostMapping
    public String uploadNewFile(@RequestParam ("file") MultipartFile file) {

        return s3Service.uploadNewFile(file);
    }


}
