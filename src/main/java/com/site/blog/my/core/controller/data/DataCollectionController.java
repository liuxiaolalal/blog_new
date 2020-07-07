package com.site.blog.my.core.controller.data;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

@Controller
@RequestMapping("/data/dataCollection")
public class DataCollectionController {

    @RequestMapping (value = "log.gif")
    public void analysis(String args, HttpServletResponse response) throws IOException {
        System.out.println(args);

        //日志收集
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/gif");

        OutputStream out = response.getOutputStream();
        BufferedImage image = new BufferedImage(1,1,BufferedImage.TYPE_INT_RGB);
        ImageIO.write(image,"gif",out);
        out.flush();
    }



}
