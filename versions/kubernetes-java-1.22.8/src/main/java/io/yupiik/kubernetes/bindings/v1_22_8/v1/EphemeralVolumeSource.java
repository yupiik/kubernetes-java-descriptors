package io.yupiik.kubernetes.bindings.v1_22_8.v1;

import io.yupiik.kubernetes.bindings.v1_22_8.Validable;
import io.yupiik.kubernetes.bindings.v1_22_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EphemeralVolumeSource implements Validable<EphemeralVolumeSource> {
    private PersistentVolumeClaimTemplate volumeClaimTemplate;

    public EphemeralVolumeSource() {
        // no-op
    }

    public EphemeralVolumeSource(final PersistentVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public PersistentVolumeClaimTemplate getVolumeClaimTemplate() {
        return volumeClaimTemplate;
    }

    public void setVolumeClaimTemplate(final PersistentVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EphemeralVolumeSource)) {
            return false;
        }
        final EphemeralVolumeSource __otherCasted = (EphemeralVolumeSource) __other;
        return Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }

    public EphemeralVolumeSource volumeClaimTemplate(final PersistentVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
        return this;
    }

    @Override
    public EphemeralVolumeSource validate() {
        return this;
    }
}
