package org.choongang.file.controllers;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload2.core.DiskFileItem;
import org.apache.commons.fileupload2.jakarta.servlet6.JakartaServletDiskFileUpload;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

@WebServlet("/file/upload")
public class FileUploadController extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/templates/file/upload.jsp");
        rd.forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JakartaServletDiskFileUpload upload = new JakartaServletDiskFileUpload();

        //multipart 형식 body 데이터를 일반 양식과 파일 데이터를 분리하여 조회 가능한 List 형태로 변환
        List<DiskFileItem> items = upload.parseRequest(req);
        for (DiskFileItem item : items) {
            if (item.isFormField()) { //일반 텍스트 형태의 양식데이터
                String name = item.getFieldName();
                String value = item.getString(Charset.forName("UTF-8"));
                System.out.printf("name=%s, value=%s\n", name, value);
            } else { //파일 데이터
                String filename = item.getName();
                String contentType = item.getContentType();
                long size = item.getSize(); //파일크기 byte

                System.out.println("filename=" + filename + ", contentType=" + contentType + ", size=" + size);
                File file = new File("D:/uploads/" + filename);
                item.write(file.toPath());
            }
        }
    }
}
