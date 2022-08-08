package io.yupiik.kubernetes.bindings.v1_14_4;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecVolumesSecret {
    private Integer defaultMode;
    private List<PodTemplateTemplateSpecVolumesSecretItems> items;
    private Boolean optional;
    private String secretName;

    public PodTemplateTemplateSpecVolumesSecret() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesSecret(final Integer defaultMode,
                                                final List<PodTemplateTemplateSpecVolumesSecretItems> items,
                                                final Boolean optional,
                                                final String secretName) {
        // no-op
    }

    public Integer getDefaultMode() {
        return defaultMode;
    }

    public void setDefaultMode(final Integer defaultMode) {
        this.defaultMode = defaultMode;
    }

    public List<PodTemplateTemplateSpecVolumesSecretItems> getItems() {
        return items;
    }

    public void setItems(final List<PodTemplateTemplateSpecVolumesSecretItems> items) {
        this.items = items;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(final Boolean optional) {
        this.optional = optional;
    }

    public String getSecretName() {
        return secretName;
    }

    public void setSecretName(final String secretName) {
        this.secretName = secretName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                defaultMode,
                items,
                optional,
                secretName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodTemplateTemplateSpecVolumesSecret)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesSecret __otherCasted = (PodTemplateTemplateSpecVolumesSecret) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(optional, __otherCasted.optional) &&
            Objects.equals(secretName, __otherCasted.secretName);
    }
}
