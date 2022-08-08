package io.yupiik.kubernetes.bindings.v1_7_5.v2alpha1;

import java.util.Objects;

public class ScheduledJobSpecJobTemplateSpecTemplate {
    private ScheduledJobSpecJobTemplateSpecTemplateMetadata metadata;
    private ScheduledJobSpecJobTemplateSpecTemplateSpec spec;

    public ScheduledJobSpecJobTemplateSpecTemplate() {
        // no-op
    }

    public ScheduledJobSpecJobTemplateSpecTemplate(final ScheduledJobSpecJobTemplateSpecTemplateMetadata metadata,
                                                   final ScheduledJobSpecJobTemplateSpecTemplateSpec spec) {
        // no-op
    }

    public ScheduledJobSpecJobTemplateSpecTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ScheduledJobSpecJobTemplateSpecTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public ScheduledJobSpecJobTemplateSpecTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final ScheduledJobSpecJobTemplateSpecTemplateSpec spec) {
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
        if (!(__other instanceof ScheduledJobSpecJobTemplateSpecTemplate)) {
            return false;
        }
        final ScheduledJobSpecJobTemplateSpecTemplate __otherCasted = (ScheduledJobSpecJobTemplateSpecTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
