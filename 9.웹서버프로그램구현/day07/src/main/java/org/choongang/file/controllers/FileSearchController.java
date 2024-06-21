package org.choongang.file.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet("/upload/*")
public class FileSearchController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI().replace(req.getContextPath(), "");
        Pattern pattern = Pattern.compile("^/upload/(.+)");
        Matcher matcher = pattern.matcher(uri);
        if(matcher.find()) {
            String fileName = matcher.group(1); // .+ 부분에 해당되는 거 : group(1)
            File file = new File("D:/uploads/" + fileName);
            if(file.exists()) {
                Path source = file.toPath();
                String contentType = Files.probeContentType(source);
                resp.setContentType(contentType);

                try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file))){
                    OutputStream out = resp.getOutputStream();
                    out.write(bis.readAllBytes());
                }
                return;
            }
        }
        resp.sendError(HttpServletResponse.SC_BAD_REQUEST);

    }
}
