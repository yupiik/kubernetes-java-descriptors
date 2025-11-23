package io.yupiik.kubernetes.bindings.v1_27_2.v1;

import io.yupiik.kubernetes.bindings.v1_27_2.Exportable;
import io.yupiik.kubernetes.bindings.v1_27_2.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_27_2.Validable;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VolumeAttachmentSource implements Validable<VolumeAttachmentSource>, Exportable {
    private PersistentVolumeSpec inlineVolumeSpec;
    private String persistentVolumeName;

    public VolumeAttachmentSource() {
        // no-op
    }

    public VolumeAttachmentSource(final PersistentVolumeSpec inlineVolumeSpec,
                                  final String persistentVolumeName) {
        this.inlineVolumeSpec = inlineVolumeSpec;
        this.persistentVolumeName = persistentVolumeName;
    }

    public PersistentVolumeSpec getInlineVolumeSpec() {
        return inlineVolumeSpec;
    }

    public void setInlineVolumeSpec(final PersistentVolumeSpec inlineVolumeSpec) {
        this.inlineVolumeSpec = inlineVolumeSpec;
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
                inlineVolumeSpec,
                persistentVolumeName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentSource)) {
            return false;
        }
        final VolumeAttachmentSource __otherCasted = (VolumeAttachmentSource) __other;
        return Objects.equals(inlineVolumeSpec, __otherCasted.inlineVolumeSpec) &&
            Objects.equals(persistentVolumeName, __otherCasted.persistentVolumeName);
    }

    public VolumeAttachmentSource inlineVolumeSpec(final PersistentVolumeSpec inlineVolumeSpec) {
        this.inlineVolumeSpec = inlineVolumeSpec;
        return this;
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
                    (inlineVolumeSpec != null ? "\"inlineVolumeSpec\":" + inlineVolumeSpec.asJson() : ""),
                    (persistentVolumeName != null ? "\"persistentVolumeName\":\"" +  JsonStrings.escapeJson(persistentVolumeName) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
