package io.yupiik.kubernetes.bindings.v1_15_6.v1;

import java.util.Objects;

public class VolumeAttachmentMetadataInitializersPending {
    private String name;

    public VolumeAttachmentMetadataInitializersPending() {
        // no-op
    }

    public VolumeAttachmentMetadataInitializersPending(final String name) {
        // no-op
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentMetadataInitializersPending)) {
            return false;
        }
        final VolumeAttachmentMetadataInitializersPending __otherCasted = (VolumeAttachmentMetadataInitializersPending) __other;
        return Objects.equals(name, __otherCasted.name);
    }
}
