package io.yupiik.kubernetes.bindings.v1_18_0.v1beta1;

import java.util.Objects;

public class PodSecurityPolicyListItemsSpecSeLinuxSeLinuxOptions {
    private String level;
    private String role;
    private String type;
    private String user;

    public PodSecurityPolicyListItemsSpecSeLinuxSeLinuxOptions() {
        // no-op
    }

    public PodSecurityPolicyListItemsSpecSeLinuxSeLinuxOptions(final String level,
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
        if (!(__other instanceof PodSecurityPolicyListItemsSpecSeLinuxSeLinuxOptions)) {
            return false;
        }
        final PodSecurityPolicyListItemsSpecSeLinuxSeLinuxOptions __otherCasted = (PodSecurityPolicyListItemsSpecSeLinuxSeLinuxOptions) __other;
        return Objects.equals(level, __otherCasted.level) &&
            Objects.equals(role, __otherCasted.role) &&
            Objects.equals(type, __otherCasted.type) &&
            Objects.equals(user, __otherCasted.user);
    }
}
