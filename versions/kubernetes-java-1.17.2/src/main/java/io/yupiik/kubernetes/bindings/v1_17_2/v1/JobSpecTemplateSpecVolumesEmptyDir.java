package io.yupiik.kubernetes.bindings.v1_17_2.v1;

import java.util.Objects;

public class JobSpecTemplateSpecVolumesEmptyDir {
    private String medium;
    private String sizeLimit;

    public JobSpecTemplateSpecVolumesEmptyDir() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesEmptyDir(final String medium,
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
        if (!(__other instanceof JobSpecTemplateSpecVolumesEmptyDir)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesEmptyDir __otherCasted = (JobSpecTemplateSpecVolumesEmptyDir) __other;
        return Objects.equals(medium, __otherCasted.medium) &&
            Objects.equals(sizeLimit, __otherCasted.sizeLimit);
    }
}
