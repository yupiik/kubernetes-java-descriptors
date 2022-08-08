package io.yupiik.kubernetes.bindings.v1_16_12.v2alpha1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeLinuxOptions {
    private String level;
    private String role;
    private String type;
    private String user;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeLinuxOptions() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeLinuxOptions(final String level,
                                                                                                  final String role,
                                                                                                  final String type,
                                                                                                  final String user) {
        // no-op
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(final String level) {
        this.level = level;
    }

    public String getRole() {
        return role;
    }

    public void setRole(final String role) {
        this.role = role;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                level,
                role,
                type,
                user);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeLinuxOptions)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeLinuxOptions __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecContainersSecurityContextSeLinuxOptions) __other;
        return Objects.equals(level, __otherCasted.level) &&
            Objects.equals(role, __otherCasted.role) &&
            Objects.equals(type, __otherCasted.type) &&
            Objects.equals(user, __otherCasted.user);
    }
}
