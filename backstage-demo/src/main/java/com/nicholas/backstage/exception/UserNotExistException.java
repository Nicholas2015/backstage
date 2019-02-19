package com.nicholas.backstage.exception;

public class UserNotExistException extends RuntimeException {

    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public UserNotExistException(Integer id){
        super("用户不存在");
        this.id = id;
    }
}
