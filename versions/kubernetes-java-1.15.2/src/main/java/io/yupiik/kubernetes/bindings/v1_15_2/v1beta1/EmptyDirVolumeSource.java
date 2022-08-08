package io.yupiik.kubernetes.bindings.v1_15_2.v1beta1;

import io.yupiik.kubernetes.bindings.v1_15_2.Validable;
import io.yupiik.kubernetes.bindings.v1_15_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmptyDirVolumeSource implements Validable<EmptyDirVolumeSource> {
    private String medium;
    private String sizeLimit;

    public EmptyDirVolumeSource() {
        // no-op
    }

    public EmptyDirVolumeSource(final String medium,
                                final String sizeLimit) {
        // no-op
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(final String medium) {
        this.medium = medium;
    }

    public String getSizeLimit() {
        return sizeLimit;
    }

    public void setSizeLimit(final String sizeLimit) {
        this.sizeLimit = sizeLimit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                medium,
                sizeLimit);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof EmptyDirVolumeSource)) {
            return false;
        }
        final EmptyDirVolumeSource __otherCasted = (EmptyDirVolumeSource) __other;
        return Objects.equals(medium, __otherCasted.medium) &&
            Objects.equals(sizeLimit, __otherCasted.sizeLimit);
    }

    public EmptyDirVolumeSource medium(final String medium) {
        this.medium = medium;
        return this;
    }

    public EmptyDirVolumeSource sizeLimit(final String sizeLimit) {
        this.sizeLimit = sizeLimit;
        return this;
    }

    @Override
    public EmptyDirVolumeSource validate() {
        return this;
    }
}
