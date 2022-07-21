package com.ll.exam;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Rq{
    HttpServletRequest req;
    HttpServletResponse resp;
    Rq(HttpServletRequest req, HttpServletResponse resp)
    {
        this.req =req;
        this.resp=resp;
    }


    public void appendBody(String str) throws IOException {
        resp.getWriter().append(str);
    }

    public int getIntParam(String paramName, int defaultValue) {
        if(req.getParameter(paramName) != null) {
            try {
                return Integer.parseInt(req.getParameter(paramName));
            } catch (NumberFormatException e) {
                return defaultValue;
            }
        }
        else
            return defaultValue;

    }
}
