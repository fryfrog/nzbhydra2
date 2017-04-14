package org.nzbhydra.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.ArrayList;
import java.util.List;

@Data
@ConfigurationProperties(prefix = "auth.users")
public class UserAuthConfig extends ValidatingConfig {

    private boolean maySeeAdmin;
    private boolean maySeeDetailsDl;
    private boolean maySeeStats;
    private boolean showIndexerSelection;
    private String username;
    private String password;

    @Override
    public List<String> validateConfig() {
        return new ArrayList<>();
    }
}
