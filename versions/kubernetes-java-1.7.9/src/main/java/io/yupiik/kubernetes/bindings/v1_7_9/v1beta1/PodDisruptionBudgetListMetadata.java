package io.yupiik.kubernetes.bindings.v1_7_9.v1beta1;

import java.util.Objects;

public class PodDisruptionBudgetListMetadata {
    private String resourceVersion;
    private String selfLink;

    public PodDisruptionBudgetListMetadata() {
        // no-op
    }

    public PodDisruptionBudgetListMetadata(final String resourceVersion,
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
        if (!(__other instanceof PodDisruptionBudgetListMetadata)) {
            return false;
        }
        final PodDisruptionBudgetListMetadata __otherCasted = (PodDisruptionBudgetListMetadata) __other;
        return Objects.equals(resourceVersion, __otherCasted.resourceVersion) &&
            Objects.equals(selfLink, __otherCasted.selfLink);
    }
}
