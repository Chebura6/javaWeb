package org.pancakes;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.pancakes.controller.MainController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

@Component
public class TimingInterceptor implements HandlerInterceptor {

    @Autowired
    MainController controller;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        long startTime = System.currentTimeMillis();
        request.setAttribute("startTime", startTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        long startTime = (Long) request.getAttribute("startTime");
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        response.setHeader("X-Server-Time", String.valueOf(executionTime));
        if (modelAndView != null) {
            modelAndView.addObject("serverProcessingTime", executionTime);
        }
//        System.out.println(executionTime);
    }

//    @Override
//    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
//        long startTime = (Long) request.getAttribute("startTime");
//        long endTime = System.currentTimeMillis();
//        long executionTime = endTime - startTime;
//        response.setHeader("X-Server-Time", String.valueOf(executionTime));
//
//        controller.totalTime = executionTime;
//
//        if (modelAndView != null) {
//            modelAndView.addObject("serverProcessingTime", executionTime);
//        }

//        ScriptEngineManager manager = new ScriptEngineManager();
//        ScriptEngine engine = manager.getEngineByName("graal.js");
//        engine.eval(Files.newBufferedReader(Paths.get("src/main/resources/static/scripts/loadTimeScript.js"), StandardCharsets.UTF_8));
//
//        Invocable inv = (Invocable) engine;
//        inv.invokeFunction("displayLoadStats", "executionTime");
//
//        System.out.println(executionTime);
//    }
}
