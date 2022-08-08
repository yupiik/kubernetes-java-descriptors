package io.yupiik.kubernetes.bindings.v1_18_0.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplate {
    private PodTemplateListItemsTemplateMetadata metadata;
    private PodTemplateListItemsTemplateSpec spec;

    public PodTemplateListItemsTemplate() {
        // no-op
    }

    public PodTemplateListItemsTemplate(final PodTemplateListItemsTemplateMetadata metadata,
                                        final PodTemplateListItemsTemplateSpec spec) {
        // no-op
    }

    public PodTemplateListItemsTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodTemplateListItemsTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public PodTemplateListItemsTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final PodTemplateListItemsTemplateSpec spec) {
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
        if (!(__other instanceof PodTemplateListItemsTemplate)) {
            return false;
        }
        final PodTemplateListItemsTemplate __otherCasted = (PodTemplateListItemsTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
