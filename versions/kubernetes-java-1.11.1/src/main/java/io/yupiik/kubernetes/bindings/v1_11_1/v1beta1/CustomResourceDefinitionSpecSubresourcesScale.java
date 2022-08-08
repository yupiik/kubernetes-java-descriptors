package io.yupiik.kubernetes.bindings.v1_11_1.v1beta1;

import java.util.Objects;

public class CustomResourceDefinitionSpecSubresourcesScale {
    private String labelSelectorPath;
    private String specReplicasPath;
    private String statusReplicasPath;

    public CustomResourceDefinitionSpecSubresourcesScale() {
        // no-op
    }

    public CustomResourceDefinitionSpecSubresourcesScale(final String labelSelectorPath,
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
        if (!(__other instanceof CustomResourceDefinitionSpecSubresourcesScale)) {
            return false;
        }
        final CustomResourceDefinitionSpecSubresourcesScale __otherCasted = (CustomResourceDefinitionSpecSubresourcesScale) __other;
        return Objects.equals(labelSelectorPath, __otherCasted.labelSelectorPath) &&
            Objects.equals(specReplicasPath, __otherCasted.specReplicasPath) &&
            Objects.equals(statusReplicasPath, __otherCasted.statusReplicasPath);
    }
}
