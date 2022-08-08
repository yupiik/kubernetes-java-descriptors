package io.yupiik.kubernetes.bindings.v1_13_5.v1alpha1;

import jakarta.json.bind.annotation.JsonbProperty;
import java.util.Objects;

public class InitializerConfigurationMetadataInitializersResultMetadata {
    @JsonbProperty("continue")
    private String continueValue;
    private String resourceVersion;
    private String selfLink;

    public InitializerConfigurationMetadataInitializersResultMetadata() {
        // no-op
    }

    public InitializerConfigurationMetadataInitializersResultMetadata(final String continueValue,
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
                resourceVersion,
                selfLink);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof InitializerConfigurationMetadataInitializersResultMetadata)) {
            return false;
        }
        final InitializerConfigurationMetadataInitializersResultMetadata __otherCasted = (InitializerConfigurationMetadataInitializersResultMetadata) __other;
        return Objects.equals(continueValue, __otherCasted.continueValue) &&
            Objects.equals(resourceVersion, __otherCasted.resourceVersion) &&
            Objects.equals(selfLink, __otherCasted.selfLink);
    }
}
