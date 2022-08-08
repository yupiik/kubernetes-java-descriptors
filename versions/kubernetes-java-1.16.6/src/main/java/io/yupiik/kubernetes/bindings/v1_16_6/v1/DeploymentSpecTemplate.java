package io.yupiik.kubernetes.bindings.v1_16_6.v1;

import java.util.Objects;

public class DeploymentSpecTemplate {
    private DeploymentSpecTemplateMetadata metadata;
    private DeploymentSpecTemplateSpec spec;

    public DeploymentSpecTemplate() {
        // no-op
    }

    public DeploymentSpecTemplate(final DeploymentSpecTemplateMetadata metadata,
                                  final DeploymentSpecTemplateSpec spec) {
        // no-op
    }

    public DeploymentSpecTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final DeploymentSpecTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public DeploymentSpecTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final DeploymentSpecTemplateSpec spec) {
        this.spec = spec;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                metadata,
                spec);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DeploymentSpecTemplate)) {
            return false;
        }
        final DeploymentSpecTemplate __otherCasted = (DeploymentSpecTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
