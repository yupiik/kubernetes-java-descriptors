package io.yupiik.kubernetes.bindings.v1_19_7.v1beta1;

import io.yupiik.kubernetes.bindings.v1_19_7.Exportable;
import io.yupiik.kubernetes.bindings.v1_19_7.Validable;
import io.yupiik.kubernetes.bindings.v1_19_7.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class EphemeralVolumeSource implements Validable<EphemeralVolumeSource>, Exportable {
    private Boolean readOnly;
    private PersistentVolumeClaimTemplate volumeClaimTemplate;

    public EphemeralVolumeSource() {
        // no-op
    }

    public EphemeralVolumeSource(final Boolean readOnly,
                                 final PersistentVolumeClaimTemplate volumeClaimTemplate) {
        // no-op
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
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
                readOnly,
                volumeClaimTemplate);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EphemeralVolumeSource)) {
            return false;
        }
        final EphemeralVolumeSource __otherCasted = (EphemeralVolumeSource) __other;
        return Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeClaimTemplate, __otherCasted.volumeClaimTemplate);
    }

    public EphemeralVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
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
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (volumeClaimTemplate != null ? "\"volumeClaimTemplate\":" + volumeClaimTemplate.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
