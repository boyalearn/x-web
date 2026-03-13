package com.earth.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.earth.entity.Model;
import com.earth.service.IModelService;
import com.xweb.common.utils.PageUtil;
import com.xweb.common.web.response.RespPageResult;
import com.xweb.common.web.response.RespResult;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriUtils;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zhx
 * @since 2024-09-03
 */
@RestController
@RequestMapping("/models")
public class ModelController {


    @Value("${filePath:F:/resource/experiment/}")
    private String experimentFilePath;

    @Autowired
    private IModelService modelService;

    @PostMapping
    public RespResult<Model> add(@RequestBody Model model) {
        modelService.save(model);
        return RespResult.builder().data(model).build();
    }

    @GetMapping()
    public RespPageResult<Model> listAll() {
        return RespPageResult.builder().data(PageUtil.buildResult(modelService.list())).build();
    }

    @GetMapping("/users/{user_id}")
    public RespPageResult<Model> list(@PathVariable("user_id") String userId) {
        QueryWrapper<Model> queryWrapper = new QueryWrapper();
        queryWrapper.lambda().eq(Model::getUserId, userId);
        return RespPageResult.builder().data(PageUtil.buildResult(modelService.list(queryWrapper))).build();
    }

    @PostMapping("/upload")
    public RespResult<Map> upload(MultipartFile file) {
        String oldName = file.getOriginalFilename();

        //将后缀加到新的文件名上
        String saveFileName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."));
        try {
            //文件保存
            file.transferTo(new File(new File(this.experimentFilePath), saveFileName));

        } catch (IOException e) {
            e.printStackTrace();
        }
        Map data = new HashMap();
        data.put("fileName", saveFileName);
        return RespResult.builder().data(data).build();
    }

    @GetMapping("/download/{model_id}")
    public void download(HttpServletResponse response, @PathVariable("model_id") String modelId) {
        Model model = this.modelService.getById(modelId);
        response.setContentType("application/octet-stream");
        // 设置编码
        response.setCharacterEncoding("utf-8");
        // 设置请求头参数以及下载的文件名称,中文名称转义防止乱码
        String headerValue = String.format("attachment; filename=%s", model.getModel());
        response.setHeader(HttpHeaders.CONTENT_DISPOSITION, headerValue);
        // Copy the stream to the response's output stream.
        try {
            InputStream myStream = new FileInputStream(this.experimentFilePath + model.getModel());
            IOUtils.copy(myStream, response.getOutputStream());
            response.flushBuffer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/files/{file_name}")
    public void image(HttpServletResponse response, @PathVariable("file_name") String fileName) {
        response.setContentType("image/png");
        // 设置编码
        response.setCharacterEncoding("utf-8");
        // 设置请求头参数以及下载的文件名称,中文名称转义防止乱码
        String headerValue = String.format("attachment; filename=%s", fileName);
        response.setHeader(HttpHeaders.CONTENT_DISPOSITION, headerValue);
        // Copy the stream to the response's output stream.
        try {
            InputStream myStream = new FileInputStream(this.experimentFilePath + fileName);
            IOUtils.copy(myStream, response.getOutputStream());
            response.flushBuffer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

