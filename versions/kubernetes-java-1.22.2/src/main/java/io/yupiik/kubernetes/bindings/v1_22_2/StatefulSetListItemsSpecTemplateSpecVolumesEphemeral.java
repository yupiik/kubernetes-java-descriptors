package io.yupiik.kubernetes.bindings.v1_22_2;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumesEphemeral {
    private StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public StatefulSetListItemsSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesEphemeral(final StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
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
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumesEphemeral __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
