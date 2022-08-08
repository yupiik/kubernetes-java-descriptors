package io.yupiik.kubernetes.bindings.v1_23_0.v1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecVolumesEphemeral {
    private StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public StatefulSetSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesEphemeral(final StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecVolumesEphemeral __otherCasted = (StatefulSetSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
