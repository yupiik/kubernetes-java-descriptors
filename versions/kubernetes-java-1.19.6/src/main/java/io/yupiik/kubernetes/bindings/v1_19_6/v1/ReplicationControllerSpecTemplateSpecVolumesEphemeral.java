package io.yupiik.kubernetes.bindings.v1_19_6.v1;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesEphemeral {
    private Boolean readOnly;
    private ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public ReplicationControllerSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesEphemeral(final Boolean readOnly,
                                                                 final ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final ReplicationControllerSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesEphemeral __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
