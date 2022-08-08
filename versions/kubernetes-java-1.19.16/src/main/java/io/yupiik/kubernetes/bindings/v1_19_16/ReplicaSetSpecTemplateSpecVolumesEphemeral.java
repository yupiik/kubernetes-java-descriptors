package io.yupiik.kubernetes.bindings.v1_19_16;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesEphemeral {
    private Boolean readOnly;
    private ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public ReplicaSetSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesEphemeral(final Boolean readOnly,
                                                      final ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final ReplicaSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                readOnly,
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesEphemeral __otherCasted = (ReplicaSetSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
