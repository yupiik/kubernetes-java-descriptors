package io.yupiik.kubernetes.bindings.v1_20_10;

import java.util.List;
import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesSecret {
    private Integer defaultMode;
    private List<DeploymentListItemsSpecTemplateSpecVolumesSecretItems> items;
    private Boolean optional;
    private String secretName;

    public DeploymentListItemsSpecTemplateSpecVolumesSecret() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesSecret(final Integer defaultMode,
                                                            final List<DeploymentListItemsSpecTemplateSpecVolumesSecretItems> items,
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

    public List<DeploymentListItemsSpecTemplateSpecVolumesSecretItems> getItems() {
        return items;
    }

    public void setItems(final List<DeploymentListItemsSpecTemplateSpecVolumesSecretItems> items) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesSecret)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesSecret __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesSecret) __other;
        return Objects.equals(defaultMode, __otherCasted.defaultMode) &&
            Objects.equals(items, __otherCasted.items) &&
            Objects.equals(optional, __otherCasted.optional) &&
            Objects.equals(secretName, __otherCasted.secretName);
    }
}
