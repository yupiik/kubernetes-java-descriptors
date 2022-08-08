package io.yupiik.kubernetes.bindings.v1_19_11.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesSecret {
    private Integer defaultMode;
    private List<DaemonSetListItemsSpecTemplateSpecVolumesSecretItems> items;
    private Boolean optional;
    private String secretName;

    public DaemonSetListItemsSpecTemplateSpecVolumesSecret() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesSecret(final Integer defaultMode,
                                                           final List<DaemonSetListItemsSpecTemplateSpecVolumesSecretItems> items,
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

    public List<DaemonSetListItemsSpecTemplateSpecVolumesSecretItems> getItems() {
        return items;
    }

    public void setItems(final List<DaemonSetListItemsSpecTemplateSpecVolumesSecretItems> items) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesSecret)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesSecret __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesSecret) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(optional, __otherCasted.optional) &&
            Objects.equals(secretName, __otherCasted.secretName);
    }
}
