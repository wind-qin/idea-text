package com.fc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Controller
@RequestMapping("test")
public class fileController {

    @RequestMapping("upload")
    public ModelAndView upload( MultipartFile upload ) {
//       准备一个上传文件的路径
        String path = "D:/apache-tomcat-8.5.37/webapps/upload/";
//         创建一个路径对应的file对象
        File file = new File(path);

        if (!file.exists()) {
//            创建对应的路径
            file.mkdirs();
        }
//        获取创建文件的文件名
        String filename = upload.getOriginalFilename();

//       获取图片名
        int lastIndexOf = filename.lastIndexOf("/");

        String name = filename.substring(lastIndexOf + 1);

        System.out.println(name);
//        判断是否为空
        try {
//            文件上传
            upload.transferTo(new File(path, filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

//        创建一个ModelAndView对象
        ModelAndView mv = new ModelAndView();
//        添加属性键值对
        mv.addObject("imgPath", "http://localhost:8081/upload/" + filename);
        mv.setViewName(name);
//        设置响应视图
        mv.setViewName("/index.jsp");

        return mv;
    }

//    文件下载
@RequestMapping("download")
    public void download( String filename, HttpServletResponse response ){

        // 声明下载的路径
        String path = "D:/apache-tomcat-8.5.37/webapps/upload/";

        int lastIndexOf = filename.lastIndexOf("/");

        String name = filename.substring(lastIndexOf + 1);

        System.out.println(name);

        // 根据路径和文件名创建一个File对象
        File file = new File(path, name);

        // 设置响应头告知浏览器以下载的方式打开
        response.setHeader("Content-Disposition", "attachment;filename=" + file.getName());

        // 声明一个输入输入流
        ServletOutputStream outputStream = null;
        BufferedInputStream inputStream = null;

        try {
            outputStream = response.getOutputStream();
            inputStream = new BufferedInputStream(new FileInputStream(file));

            // 获取一个缓冲区
            byte[] buffer = new byte[1024 * 8];

            // 如果缓存没有读完
            while (inputStream.read(buffer) != -1) {
                // 写入数据
                outputStream.write(buffer);

                // 刷新数据
                outputStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭资源，注意：先开的要后关
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
