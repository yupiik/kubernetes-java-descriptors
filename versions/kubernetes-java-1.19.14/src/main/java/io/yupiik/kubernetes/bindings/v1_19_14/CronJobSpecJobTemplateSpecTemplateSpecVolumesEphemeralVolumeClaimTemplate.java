package io.yupiik.kubernetes.bindings.v1_19_14;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate {
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate(final CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata,
                                                                                     final CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
