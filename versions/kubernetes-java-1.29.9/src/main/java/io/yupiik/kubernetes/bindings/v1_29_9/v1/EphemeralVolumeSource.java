package io.yupiik.kubernetes.bindings.v1_29_9.v1;

import io.yupiik.kubernetes.bindings.v1_29_9.Exportable;
import io.yupiik.kubernetes.bindings.v1_29_9.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EphemeralVolumeSource implements Validable<EphemeralVolumeSource>, Exportable {
    private PersistentVolumeClaimTemplate volumeClaimTemplate;

    public EphemeralVolumeSource() {
        // no-op
    }

    public EphemeralVolumeSource(final PersistentVolumeClaimTemplate volumeClaimTemplate) {
        this.volumeClaimTemplate = volumeClaimTemplate;
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

    @Override
    public String asJson() {
        return Stream.of(
                    (volumeClaimTemplate != null ? "\"volumeClaimTemplate\":" + volumeClaimTemplate.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
