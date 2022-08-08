package io.yupiik.kubernetes.bindings.v1_10_8;

import java.util.Objects;

public class CronJobSpecJobTemplate {
    private CronJobSpecJobTemplateMetadata metadata;
    private CronJobSpecJobTemplateSpec spec;

    public CronJobSpecJobTemplate() {
        // no-op
    }

    public CronJobSpecJobTemplate(final CronJobSpecJobTemplateMetadata metadata,
                                  final CronJobSpecJobTemplateSpec spec) {
        // no-op
    }

    public CronJobSpecJobTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CronJobSpecJobTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public CronJobSpecJobTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final CronJobSpecJobTemplateSpec spec) {
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
        if (!(__other instanceof CronJobSpecJobTemplate)) {
            return false;
        }
        final CronJobSpecJobTemplate __otherCasted = (CronJobSpecJobTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
