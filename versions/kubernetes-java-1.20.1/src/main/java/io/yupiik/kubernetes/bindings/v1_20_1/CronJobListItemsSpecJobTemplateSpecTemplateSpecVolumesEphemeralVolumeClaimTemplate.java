package io.yupiik.kubernetes.bindings.v1_20_1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata,
                                                                                              final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
