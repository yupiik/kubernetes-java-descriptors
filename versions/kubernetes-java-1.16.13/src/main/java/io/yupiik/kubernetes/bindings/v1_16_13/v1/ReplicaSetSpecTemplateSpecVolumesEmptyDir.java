package io.yupiik.kubernetes.bindings.v1_16_13.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesEmptyDir {
    private String medium;
    private String sizeLimit;

    public ReplicaSetSpecTemplateSpecVolumesEmptyDir() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesEmptyDir(final String medium,
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesEmptyDir)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesEmptyDir __otherCasted = (ReplicaSetSpecTemplateSpecVolumesEmptyDir) __other;
        return Objects.equals(medium, __otherCasted.medium) &&
            Objects.equals(sizeLimit, __otherCasted.sizeLimit);
    }
}
