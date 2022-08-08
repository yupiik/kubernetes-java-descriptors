package io.yupiik.kubernetes.bindings.v1_17_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_17_2.Validable;
import io.yupiik.kubernetes.bindings.v1_17_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VolumeError implements Validable<VolumeError> {
    private String message;
    private String time;

    public VolumeError() {
        // no-op
    }

    public VolumeError(final String message,
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
        if (!(__other instanceof VolumeError)) {
            return false;
        }
        final VolumeError __otherCasted = (VolumeError) __other;
        return Objects.equals(message, __otherCasted.message) &&
            Objects.equals(time, __otherCasted.time);
    }

    public VolumeError message(final String message) {
        this.message = message;
        return this;
    }

    public VolumeError time(final String time) {
        this.time = time;
        return this;
    }

    @Override
    public VolumeError validate() {
        return this;
    }
}
