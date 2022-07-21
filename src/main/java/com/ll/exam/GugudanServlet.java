package com.ll.exam;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

@WebServlet("/gugudan")
public class GugudanServlet  extends HttpServlet{
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setCharacterEncoding("UTF-8");
        }
        catch (UnsupportedEncodingException e){}

        // 서블릿이 HTML 파일을 만들 때 UTF-8 로 쓰기
        resp.setCharacterEncoding("UTF-8");
        // HTML 이 UTF-8 형식이라는 것을 브라우저에게 알린다.
        resp.setContentType("text/html; charset=utf-8");



        Rq rq = new Rq(req, resp);

        int dan = rq.getIntParam("dan", 0);
        int limit = rq.getIntParam("limit", 0);

        rq.appendBody("<h1>%d단</h1>\n".formatted(dan));

        for (int i = 1; i <= limit; i++) {
            rq.appendBody("<div>%d * %d = %d</div>\n".formatted(dan, i, dan * i));
        }



    }

}

