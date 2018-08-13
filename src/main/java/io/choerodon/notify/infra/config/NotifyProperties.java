package io.choerodon.notify.infra.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.LinkedHashMap;
import java.util.Map;

@Getter
@Setter
@ConfigurationProperties(prefix = "choerodon.notify")
public class NotifyProperties {

    public static final String LEVEL_SITE = "site";

    public static final String LEVEL_ORG = "organization";

    private boolean initSpringEmailConfig = true;

    private Map<String, BusinessType> types = new LinkedHashMap<>();

    @Getter
    @Setter
    public static class BusinessType {

        private String name;

        private String description;

        private Integer retryCount = 0;

        private String level = LEVEL_SITE;

        private Boolean isSendInstantly = true;

        private Boolean isManualRetry = false;

    }


}