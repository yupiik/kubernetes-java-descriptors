package io.yupiik.kubernetes.bindings.v1_7_1;

import java.util.Objects;

public class ReplicationControllerListMetadata {
    private String resourceVersion;
    private String selfLink;

    public ReplicationControllerListMetadata() {
        // no-op
    }

    public ReplicationControllerListMetadata(final String resourceVersion,
                                             final String selfLink) {
        // no-op
    }

    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(final String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(final String selfLink) {
        this.selfLink = selfLink;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                resourceVersion,
                selfLink);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicationControllerListMetadata)) {
            return false;
        }
        final ReplicationControllerListMetadata __otherCasted = (ReplicationControllerListMetadata) __other;
        return Objects.equals(resourceVersion, __otherCasted.resourceVersion) &&
            Objects.equals(selfLink, __otherCasted.selfLink);
    }
}
