package com.webbookie;

import com.webbookie.choice.NovelSelect;
import com.webbookie.choice.NovelType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(
        name = "selectnovelservlet",
        urlPatterns = "/SelectNovel"
)
public class SelectNovelServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String novelType = req.getParameter("Type");

        NovelSelect novelSelect = new NovelSelect();
        NovelType l = NovelType.valueOf(novelType);

        List novelNovels = novelSelect.getAvailableNovels(l);

        req.setAttribute("novels", novelNovels);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }

}
