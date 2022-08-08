package io.yupiik.kubernetes.bindings.v1_16_10.v1;

import java.util.Objects;

public class PodTemplateTemplate {
    private PodTemplateTemplateMetadata metadata;
    private PodTemplateTemplateSpec spec;

    public PodTemplateTemplate() {
        // no-op
    }

    public PodTemplateTemplate(final PodTemplateTemplateMetadata metadata,
                               final PodTemplateTemplateSpec spec) {
        // no-op
    }

    public PodTemplateTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final PodTemplateTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public PodTemplateTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final PodTemplateTemplateSpec spec) {
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
        if (!(__other instanceof PodTemplateTemplate)) {
            return false;
        }
        final PodTemplateTemplate __otherCasted = (PodTemplateTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
