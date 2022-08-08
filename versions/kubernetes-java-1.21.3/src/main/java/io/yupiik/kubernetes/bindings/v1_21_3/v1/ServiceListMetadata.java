package io.yupiik.kubernetes.bindings.v1_21_3.v1;

import jakarta.json.bind.annotation.JsonbProperty;
import java.util.Objects;

public class ServiceListMetadata {
    @JsonbProperty("continue")
    private String continueValue;
    private Integer remainingItemCount;
    private String resourceVersion;
    private String selfLink;

    public ServiceListMetadata() {
        // no-op
    }

    public ServiceListMetadata(final String continueValue,
                               final Integer remainingItemCount,
                               final String resourceVersion,
                               final String selfLink) {
        // no-op
    }

    public String getContinueValue() {
        return continueValue;
    }

    public void setContinueValue(final String continueValue) {
        this.continueValue = continueValue;
    }

    public Integer getRemainingItemCount() {
        return remainingItemCount;
    }

    public void setRemainingItemCount(final Integer remainingItemCount) {
        this.remainingItemCount = remainingItemCount;
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
                continueValue,
                remainingItemCount,
                resourceVersion,
                selfLink);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceListMetadata)) {
            return false;
        }
        final ServiceListMetadata __otherCasted = (ServiceListMetadata) __other;
        return Objects.equals(continueValue, __otherCasted.continueValue) &&
            Objects.equals(remainingItemCount, __otherCasted.remainingItemCount) &&
            Objects.equals(resourceVersion, __otherCasted.resourceVersion) &&
            Objects.equals(selfLink, __otherCasted.selfLink);
    }
}
