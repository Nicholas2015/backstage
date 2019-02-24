package com.nicholas.backstage.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;


@Data
@ConfigurationProperties(prefix = "backstage.security")
public class SecurityProperties {

    private BrowserProperties browser = new BrowserProperties();
}
