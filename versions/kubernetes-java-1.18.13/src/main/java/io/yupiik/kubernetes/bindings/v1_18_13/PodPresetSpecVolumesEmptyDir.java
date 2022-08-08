package io.yupiik.kubernetes.bindings.v1_18_13;

import java.util.Objects;

public class PodPresetSpecVolumesEmptyDir {
    private String medium;
    private String sizeLimit;

    public PodPresetSpecVolumesEmptyDir() {
        // no-op
    }

    public PodPresetSpecVolumesEmptyDir(final String medium,
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
        if (!(__other instanceof PodPresetSpecVolumesEmptyDir)) {
            return false;
        }
        final PodPresetSpecVolumesEmptyDir __otherCasted = (PodPresetSpecVolumesEmptyDir) __other;
        return Objects.equals(medium, __otherCasted.medium) &&
            Objects.equals(sizeLimit, __otherCasted.sizeLimit);
    }
}
