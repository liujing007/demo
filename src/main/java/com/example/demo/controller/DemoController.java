package com.example.demo.controller;

import cn.hutool.core.io.FileUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * @author woshijing
 * @version 1.0.0
 * @Description TODO
 * @createTime 2022年09月28日 11:20:00
 */
@RestController
@RequestMapping(value = "/demo")
@Slf4j
public class DemoController {

    @GetMapping(value = "/demo1")
    public ResponseEntity<?> demo(@RequestParam(required = false) Long workspaceId,
                                     @RequestParam(required = false) Long cubeId,
                                     @RequestParam(required = false) String analysisName) {
        File file = FileUtil.writeUtf8String("s", "\\mnt\\data\\demo1.txt");
        ResponseEntity.BodyBuilder ok = ResponseEntity.ok();
        ok.contentLength(file.length());
        ok.contentType(MediaType.parseMediaType(MediaType.APPLICATION_OCTET_STREAM_VALUE));
        ok.header("Content-Disposition", "attachment; filename=" + URLEncoder.encode("demo1.txt", StandardCharsets.UTF_8));
        return ok.body(new FileSystemResource(file));
    }

}