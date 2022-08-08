package io.yupiik.kubernetes.bindings.v1_12_2.v1beta1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplate {
    private CronJobSpecJobTemplateSpecTemplateMetadata metadata;
    private CronJobSpecJobTemplateSpecTemplateSpec spec;

    public CronJobSpecJobTemplateSpecTemplate() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplate(final CronJobSpecJobTemplateSpecTemplateMetadata metadata,
                                              final CronJobSpecJobTemplateSpecTemplateSpec spec) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CronJobSpecJobTemplateSpecTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public CronJobSpecJobTemplateSpecTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final CronJobSpecJobTemplateSpecTemplateSpec spec) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplate)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplate __otherCasted = (CronJobSpecJobTemplateSpecTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
