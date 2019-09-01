package com.chengang.ws.demo1.service;

import com.chengang.ws.demo1.model.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;

@WebService
public interface UserService {
    @WebMethod
    String getName(@WebParam(name = "userId") String userId);

    @WebMethod
    User getUser(String userI);

    @WebMethod
    ArrayList<User> getAlLUser();

    @WebMethod
    String getUserName(String id);
}