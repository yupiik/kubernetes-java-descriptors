package io.yupiik.kubernetes.bindings.v1_18_1.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplate {
    private DeploymentListItemsSpecTemplateMetadata metadata;
    private DeploymentListItemsSpecTemplateSpec spec;

    public DeploymentListItemsSpecTemplate() {
        // no-op
    }

    public DeploymentListItemsSpecTemplate(final DeploymentListItemsSpecTemplateMetadata metadata,
                                           final DeploymentListItemsSpecTemplateSpec spec) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final DeploymentListItemsSpecTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public DeploymentListItemsSpecTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final DeploymentListItemsSpecTemplateSpec spec) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplate)) {
            return false;
        }
        final DeploymentListItemsSpecTemplate __otherCasted = (DeploymentListItemsSpecTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
