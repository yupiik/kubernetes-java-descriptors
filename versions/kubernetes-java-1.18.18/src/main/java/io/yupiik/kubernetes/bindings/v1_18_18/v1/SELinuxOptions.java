package io.yupiik.kubernetes.bindings.v1_18_18.v1;

import io.yupiik.kubernetes.bindings.v1_18_18.Validable;
import io.yupiik.kubernetes.bindings.v1_18_18.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SELinuxOptions implements Validable<SELinuxOptions> {
    private String level;
    private String role;
    private String type;
    private String user;

    public SELinuxOptions() {
        // no-op
    }

    public SELinuxOptions(final String level,
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
        if (!(__other instanceof SELinuxOptions)) {
            return false;
        }
        final SELinuxOptions __otherCasted = (SELinuxOptions) __other;
        return Objects.equals(level, __otherCasted.level) &&
            Objects.equals(role, __otherCasted.role) &&
            Objects.equals(type, __otherCasted.type) &&
            Objects.equals(user, __otherCasted.user);
    }

    public SELinuxOptions level(final String level) {
        this.level = level;
        return this;
    }

    public SELinuxOptions role(final String role) {
        this.role = role;
        return this;
    }

    public SELinuxOptions type(final String type) {
        this.type = type;
        return this;
    }

    public SELinuxOptions user(final String user) {
        this.user = user;
        return this;
    }

    @Override
    public SELinuxOptions validate() {
        return this;
    }
}
