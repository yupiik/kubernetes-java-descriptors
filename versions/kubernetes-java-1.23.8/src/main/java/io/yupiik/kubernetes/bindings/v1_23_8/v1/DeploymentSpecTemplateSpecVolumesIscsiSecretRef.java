package io.yupiik.kubernetes.bindings.v1_23_8.v1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumesIscsiSecretRef {
    private String name;

    public DeploymentSpecTemplateSpecVolumesIscsiSecretRef() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesIscsiSecretRef(final String name) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumesIscsiSecretRef)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumesIscsiSecretRef __otherCasted = (DeploymentSpecTemplateSpecVolumesIscsiSecretRef) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
