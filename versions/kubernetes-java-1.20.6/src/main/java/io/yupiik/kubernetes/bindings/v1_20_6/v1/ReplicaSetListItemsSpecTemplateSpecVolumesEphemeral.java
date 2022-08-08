package io.yupiik.kubernetes.bindings.v1_20_6.v1;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumesEphemeral {
    private Boolean readOnly;
    private ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public ReplicaSetListItemsSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesEphemeral(final Boolean readOnly,
                                                               final ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final ReplicaSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
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
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumesEphemeral __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
