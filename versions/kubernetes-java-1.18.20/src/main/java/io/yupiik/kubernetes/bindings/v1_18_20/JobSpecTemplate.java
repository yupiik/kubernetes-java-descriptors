package io.yupiik.kubernetes.bindings.v1_18_20;

import java.util.Objects;

public class JobSpecTemplate {
    private JobSpecTemplateMetadata metadata;
    private JobSpecTemplateSpec spec;

    public JobSpecTemplate() {
        // no-op
    }

    public JobSpecTemplate(final JobSpecTemplateMetadata metadata,
                           final JobSpecTemplateSpec spec) {
        // no-op
    }

    public JobSpecTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final JobSpecTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public JobSpecTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final JobSpecTemplateSpec spec) {
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
        if (!(__other instanceof JobSpecTemplate)) {
            return false;
        }
        final JobSpecTemplate __otherCasted = (JobSpecTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
