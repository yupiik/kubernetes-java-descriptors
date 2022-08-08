package io.yupiik.kubernetes.bindings.v1_19_0.v1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate {
    private StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata;
    private StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec;

    public StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate(final StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata,
                                                                          final StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(final StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec spec) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate __otherCasted = (StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate) __other;
        return Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec);
    }
}
