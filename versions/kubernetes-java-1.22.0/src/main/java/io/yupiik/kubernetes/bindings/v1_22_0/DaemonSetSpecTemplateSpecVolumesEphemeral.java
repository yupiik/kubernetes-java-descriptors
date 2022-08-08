package io.yupiik.kubernetes.bindings.v1_22_0;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesEphemeral {
    private DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public DaemonSetSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesEphemeral(final DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
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
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesEphemeral __otherCasted = (DaemonSetSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
