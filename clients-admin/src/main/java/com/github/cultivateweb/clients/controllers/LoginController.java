package com.github.cultivateweb.clients.controllers;

import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class LoginController {


    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse response) throws OAuthSystemException, IOException {
        OAuthClientRequest request=null;
        request = OAuthClientRequest
            .authorizationLocation("your server’s auth location ")
            .setResponseType("code")
            .setState("1")
            .setClientId("your client id")
            .setRedirectURI("<url>")
            .buildQueryMessage();
        System.out.println("Url for redirecting::::"+request.getLocationUri());
        return new ModelAndView("redirect:"+request.getLocationUri());
    }


    @RequestMapping( "/login")
    public void login() {

    }

    @RequestMapping("/logout")
    public void logout() {

    }

}
