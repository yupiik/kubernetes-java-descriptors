package io.yupiik.kubernetes.bindings.v1_20_0.v1;

import io.yupiik.kubernetes.bindings.v1_20_0.Validable;
import io.yupiik.kubernetes.bindings.v1_20_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SecretEnvSource implements Validable<SecretEnvSource> {
    private String name;
    private Boolean optional;

    public SecretEnvSource() {
        // no-op
    }

    public SecretEnvSource(final String name,
                           final Boolean optional) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(final Boolean optional) {
        this.optional = optional;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                optional);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof SecretEnvSource)) {
            return false;
        }
        final SecretEnvSource __otherCasted = (SecretEnvSource) __other;
        return Objects.equals(name, __otherCasted.name) &&
            Objects.equals(optional, __otherCasted.optional);
    }

    public SecretEnvSource name(final String name) {
        this.name = name;
        return this;
    }

    public SecretEnvSource optional(final Boolean optional) {
        this.optional = optional;
        return this;
    }

    @Override
    public SecretEnvSource validate() {
        return this;
    }
}
