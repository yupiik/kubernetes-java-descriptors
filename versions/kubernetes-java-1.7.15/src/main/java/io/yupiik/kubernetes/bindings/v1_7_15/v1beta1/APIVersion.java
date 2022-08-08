package io.yupiik.kubernetes.bindings.v1_7_15.v1beta1;

import io.yupiik.kubernetes.bindings.v1_7_15.Validable;
import io.yupiik.kubernetes.bindings.v1_7_15.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class APIVersion implements Validable<APIVersion> {
    private String name;

    public APIVersion() {
        // no-op
    }

    public APIVersion(final String name) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof APIVersion)) {
            return false;
        }
        final APIVersion __otherCasted = (APIVersion) __other;
        return Objects.equals(name, __otherCasted.name);
    }

    public APIVersion name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public APIVersion validate() {
        return this;
    }
}
