package io.yupiik.kubernetes.bindings.v1_16_3.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesRbdSecretRef {
    private String name;

    public DeploymentListItemsSpecTemplateSpecVolumesRbdSecretRef() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesRbdSecretRef(final String name) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesRbdSecretRef)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesRbdSecretRef __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesRbdSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
