package io.yupiik.kubernetes.bindings.v1_17_10.v1beta2;

import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumesStorageosSecretRef {
    private String name;

    public DeploymentSpecTemplateSpecVolumesStorageosSecretRef() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesStorageosSecretRef(final String name) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumesStorageosSecretRef)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumesStorageosSecretRef __otherCasted = (DeploymentSpecTemplateSpecVolumesStorageosSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
