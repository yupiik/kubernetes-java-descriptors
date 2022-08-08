package io.yupiik.kubernetes.bindings.v1_19_8.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeral {
    private Boolean readOnly;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeral(final Boolean readOnly,
                                                                          final ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeral __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
