package io.yupiik.kubernetes.bindings.v1_20_14.v1alpha1;

import java.util.Objects;

public class VolumeAttachmentListItemsStatusDetachError {
    private String message;
    private String time;

    public VolumeAttachmentListItemsStatusDetachError() {
        // no-op
    }

    public VolumeAttachmentListItemsStatusDetachError(final String message,
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
        if (!(__other instanceof VolumeAttachmentListItemsStatusDetachError)) {
            return false;
        }
        final VolumeAttachmentListItemsStatusDetachError __otherCasted = (VolumeAttachmentListItemsStatusDetachError) __other;
        return Objects.equals(message, __otherCasted.message) &&
            Objects.equals(time, __otherCasted.time);
    }
}
