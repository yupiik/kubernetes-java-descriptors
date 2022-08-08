package io.yupiik.kubernetes.bindings.v1_18_3.v1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumesRbdSecretRef {
    private String name;

    public DeploymentSpecTemplateSpecVolumesRbdSecretRef() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesRbdSecretRef(final String name) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumesRbdSecretRef)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumesRbdSecretRef __otherCasted = (DeploymentSpecTemplateSpecVolumesRbdSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
