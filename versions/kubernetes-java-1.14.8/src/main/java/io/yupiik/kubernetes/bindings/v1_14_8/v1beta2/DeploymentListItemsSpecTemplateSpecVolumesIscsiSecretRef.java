package io.yupiik.kubernetes.bindings.v1_14_8.v1beta2;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesIscsiSecretRef {
    private String name;

    public DeploymentListItemsSpecTemplateSpecVolumesIscsiSecretRef() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesIscsiSecretRef(final String name) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesIscsiSecretRef)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesIscsiSecretRef __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesIscsiSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
