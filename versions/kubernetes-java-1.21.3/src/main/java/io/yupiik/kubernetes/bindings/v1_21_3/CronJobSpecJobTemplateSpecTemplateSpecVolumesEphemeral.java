package io.yupiik.kubernetes.bindings.v1_21_3;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeral {
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeral() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeral(final CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeral)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeral __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesEphemeral) __other;
        return Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }
}
