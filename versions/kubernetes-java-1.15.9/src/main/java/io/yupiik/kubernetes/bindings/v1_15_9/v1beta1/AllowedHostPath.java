package io.yupiik.kubernetes.bindings.v1_15_9.v1beta1;

import io.yupiik.kubernetes.bindings.v1_15_9.Validable;
import io.yupiik.kubernetes.bindings.v1_15_9.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AllowedHostPath implements Validable<AllowedHostPath> {
    private String pathPrefix;
    private Boolean readOnly;

    public AllowedHostPath() {
        // no-op
    }

    public AllowedHostPath(final String pathPrefix,
                           final Boolean readOnly) {
        // no-op
    }

    public String getPathPrefix() {
        return pathPrefix;
    }

    public void setPathPrefix(final String pathPrefix) {
        this.pathPrefix = pathPrefix;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pathPrefix,
                readOnly);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AllowedHostPath)) {
            return false;
        }
        final AllowedHostPath __otherCasted = (AllowedHostPath) __other;
        return Objects.equals(pathPrefix, __otherCasted.pathPrefix) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }

    public AllowedHostPath pathPrefix(final String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }

    public AllowedHostPath readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    @Override
    public AllowedHostPath validate() {
        return this;
    }
}
