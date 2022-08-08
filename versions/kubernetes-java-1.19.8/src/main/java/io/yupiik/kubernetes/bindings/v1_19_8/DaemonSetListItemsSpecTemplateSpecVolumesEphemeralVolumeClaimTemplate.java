package io.yupiik.kubernetes.bindings.v1_19_8;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate {
    private DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata;
    private DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec;

    public DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate(final DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata,
                                                                                 final DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
