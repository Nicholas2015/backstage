package com.nicholas.backstage.browser.support;

import lombok.Data;

@Data
public class SimpleResponse {

    private Object content;

    public SimpleResponse(Object content) {
        this.content = content;
    }
}
