package io.yupiik.kubernetes.bindings.v1_16_5.v1beta1;

import java.util.Objects;

public class CustomResourceDefinitionSpecVersionsSubresourcesScale {
    private String labelSelectorPath;
    private String specReplicasPath;
    private String statusReplicasPath;

    public CustomResourceDefinitionSpecVersionsSubresourcesScale() {
        // no-op
    }

    public CustomResourceDefinitionSpecVersionsSubresourcesScale(final String labelSelectorPath,
                                                                 final String specReplicasPath,
                                                                 final String statusReplicasPath) {
        // no-op
    }

    public String getLabelSelectorPath() {
        return labelSelectorPath;
    }

    public void setLabelSelectorPath(final String labelSelectorPath) {
        this.labelSelectorPath = labelSelectorPath;
    }

    public String getSpecReplicasPath() {
        return specReplicasPath;
    }

    public void setSpecReplicasPath(final String specReplicasPath) {
        this.specReplicasPath = specReplicasPath;
    }

    public String getStatusReplicasPath() {
        return statusReplicasPath;
    }

    public void setStatusReplicasPath(final String statusReplicasPath) {
        this.statusReplicasPath = statusReplicasPath;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                labelSelectorPath,
                specReplicasPath,
                statusReplicasPath);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionSpecVersionsSubresourcesScale)) {
            return false;
        }
        final CustomResourceDefinitionSpecVersionsSubresourcesScale __otherCasted = (CustomResourceDefinitionSpecVersionsSubresourcesScale) __other;
        return Objects.equals(labelSelectorPath, __otherCasted.labelSelectorPath) &&
            Objects.equals(specReplicasPath, __otherCasted.specReplicasPath) &&
            Objects.equals(statusReplicasPath, __otherCasted.statusReplicasPath);
    }
}
