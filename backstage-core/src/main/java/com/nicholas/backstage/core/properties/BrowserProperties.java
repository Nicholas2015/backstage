package com.nicholas.backstage.core.properties;

import com.nicholas.backstage.core.type.LoginType;
import lombok.Data;

@Data
public class BrowserProperties {

    private String loginPage = "/browser-login.html";

    private LoginType loginType = LoginType.JSON;


}
