package com.example.j2e;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "Test", value = "/Test")
public class Test extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public Test() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Logique de traitement pour les requêtes HTTP GET
        response.getWriter().append("Réponse du servlet : ").append(request.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Logique de traitement pour les requêtes HTTP POST
        doGet(request, response);
    }
}
