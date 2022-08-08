package io.yupiik.kubernetes.bindings.v1_17_3.v1;

import java.util.Objects;

public class VolumeAttachmentStatusDetachError {
    private String message;
    private String time;

    public VolumeAttachmentStatusDetachError() {
        // no-op
    }

    public VolumeAttachmentStatusDetachError(final String message,
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
        if (!(__other instanceof VolumeAttachmentStatusDetachError)) {
            return false;
        }
        final VolumeAttachmentStatusDetachError __otherCasted = (VolumeAttachmentStatusDetachError) __other;
        return Objects.equals(message, __otherCasted.message) &&
            Objects.equals(time, __otherCasted.time);
    }
}
