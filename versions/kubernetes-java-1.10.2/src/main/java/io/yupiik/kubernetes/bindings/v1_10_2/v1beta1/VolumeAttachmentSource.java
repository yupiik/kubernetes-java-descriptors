package io.yupiik.kubernetes.bindings.v1_10_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_10_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_10_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_10_2.Validable;
import io.yupiik.kubernetes.bindings.v1_10_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VolumeAttachmentSource implements Validable<VolumeAttachmentSource>, Exportable {
    private String persistentVolumeName;

    public VolumeAttachmentSource() {
        // no-op
    }

    public VolumeAttachmentSource(final String persistentVolumeName) {
        // no-op
    }

    public String getPersistentVolumeName() {
        return persistentVolumeName;
    }

    public void setPersistentVolumeName(final String persistentVolumeName) {
        this.persistentVolumeName = persistentVolumeName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                persistentVolumeName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentSource)) {
            return false;
        }
        final VolumeAttachmentSource __otherCasted = (VolumeAttachmentSource) __other;
        return Objects.equals(persistentVolumeName, __otherCasted.persistentVolumeName);
    }

    public VolumeAttachmentSource persistentVolumeName(final String persistentVolumeName) {
        this.persistentVolumeName = persistentVolumeName;
        return this;
    }

    @Override
    public VolumeAttachmentSource validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (persistentVolumeName != null ? "\"persistentVolumeName\":\"" +  JsonStrings.escapeJson(persistentVolumeName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
