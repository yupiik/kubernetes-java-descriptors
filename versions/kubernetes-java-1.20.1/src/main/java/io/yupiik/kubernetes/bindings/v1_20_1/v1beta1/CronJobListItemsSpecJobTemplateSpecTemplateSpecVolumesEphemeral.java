package io.yupiik.kubernetes.bindings.v1_20_1.v1beta1;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeral {
    private Boolean readOnly;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeral(final Boolean readOnly,
                                                                           final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeral __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
