package io.yupiik.kubernetes.bindings.v1_21_2.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate {
    private DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata;
    private DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec;

    public DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate(final DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata,
                                                                        final DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate __otherCasted = (DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
