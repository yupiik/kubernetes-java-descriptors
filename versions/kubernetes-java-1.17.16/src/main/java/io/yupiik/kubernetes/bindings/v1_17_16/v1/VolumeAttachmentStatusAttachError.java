package io.yupiik.kubernetes.bindings.v1_17_16.v1;

import java.util.Objects;

public class VolumeAttachmentStatusAttachError {
    private String message;
    private String time;

    public VolumeAttachmentStatusAttachError() {
        // no-op
    }

    public VolumeAttachmentStatusAttachError(final String message,
                                             final String time) {
        // no-op
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(final String time) {
        this.time = time;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                message,
                time);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeAttachmentStatusAttachError)) {
            return false;
        }
        final VolumeAttachmentStatusAttachError __otherCasted = (VolumeAttachmentStatusAttachError) __other;
        return Objects.equals(message, __otherCasted.message) &&
            Objects.equals(time, __otherCasted.time);
    }
}
