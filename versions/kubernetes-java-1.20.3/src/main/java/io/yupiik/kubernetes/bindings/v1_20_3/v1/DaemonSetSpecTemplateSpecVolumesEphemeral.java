package io.yupiik.kubernetes.bindings.v1_20_3.v1;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesEphemeral {
    private Boolean readOnly;
    private DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public DaemonSetSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesEphemeral(final Boolean readOnly,
                                                     final DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesEphemeral __otherCasted = (DaemonSetSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
