package io.yupiik.kubernetes.bindings.v1_19_12.v1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecVolumesEphemeral {
    private Boolean readOnly;
    private StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public StatefulSetSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesEphemeral(final Boolean readOnly,
                                                       final StatefulSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
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
                readOnly,
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecVolumesEphemeral __otherCasted = (StatefulSetSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
