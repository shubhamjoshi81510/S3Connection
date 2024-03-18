package com.s3onnection.S3.connection.service;

import io.awspring.cloud.s3.S3Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import software.amazon.awssdk.services.s3.S3Client;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;

import java.nio.file.Path;
@Service
public class S3ServiceImpl implements S3Service{

    @Autowired
    private S3Template s3Template;
    @Override
    public String uploadNewFile(MultipartFile file) {
        try {
            s3Template.upload("my-demo-bucket-20240317","myfile.txt",file.getInputStream());

            return "File Uploaded Successfully";
        }
        catch (Exception exception){
            return "Failed to upload file to S3: " + exception.getMessage();
        }
    }

    @Override
    public String deleteFile() {
        return null;
    }

    @Override
    public String updateFile() {
        return null;
    }
}
