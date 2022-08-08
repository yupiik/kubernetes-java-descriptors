package io.yupiik.kubernetes.bindings.v1_18_10;

import java.util.Objects;

public class PodSecurityPolicyListItemsSpecAllowedHostPaths {
    private String pathPrefix;
    private Boolean readOnly;

    public PodSecurityPolicyListItemsSpecAllowedHostPaths() {
        // no-op
    }

    public PodSecurityPolicyListItemsSpecAllowedHostPaths(final String pathPrefix,
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
        if (!(__other instanceof PodSecurityPolicyListItemsSpecAllowedHostPaths)) {
            return false;
        }
        final PodSecurityPolicyListItemsSpecAllowedHostPaths __otherCasted = (PodSecurityPolicyListItemsSpecAllowedHostPaths) __other;
        return Objects.equals(pathPrefix, __otherCasted.pathPrefix) &&
            Objects.equals(readOnly, __otherCasted.readOnly);
    }
}
