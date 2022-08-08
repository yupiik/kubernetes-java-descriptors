package io.yupiik.kubernetes.bindings.v1_15_5.v1beta1;

import java.util.List;
import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesSecret {
    private Integer defaultMode;
    private List<ReplicaSetSpecTemplateSpecVolumesSecretItems> items;
    private Boolean optional;
    private String secretName;

    public ReplicaSetSpecTemplateSpecVolumesSecret() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesSecret(final Integer defaultMode,
                                                   final List<ReplicaSetSpecTemplateSpecVolumesSecretItems> items,
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

    public List<ReplicaSetSpecTemplateSpecVolumesSecretItems> getItems() {
        return items;
    }

    public void setItems(final List<ReplicaSetSpecTemplateSpecVolumesSecretItems> items) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesSecret)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesSecret __otherCasted = (ReplicaSetSpecTemplateSpecVolumesSecret) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(optional, __otherCasted.optional) &&
            Objects.equals(secretName, __otherCasted.secretName);
    }
}
