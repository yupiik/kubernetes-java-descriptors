package io.yupiik.kubernetes.bindings.v1_19_2;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumesEphemeral {
    private Boolean readOnly;
    private StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public StatefulSetListItemsSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesEphemeral(final Boolean readOnly,
                                                                final StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumesEphemeral __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
