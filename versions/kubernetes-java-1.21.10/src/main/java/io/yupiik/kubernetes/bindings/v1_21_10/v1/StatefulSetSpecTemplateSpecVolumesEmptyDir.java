package io.yupiik.kubernetes.bindings.v1_21_10.v1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecVolumesEmptyDir {
    private String medium;
    private String sizeLimit;

    public StatefulSetSpecTemplateSpecVolumesEmptyDir() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesEmptyDir(final String medium,
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecVolumesEmptyDir)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecVolumesEmptyDir __otherCasted = (StatefulSetSpecTemplateSpecVolumesEmptyDir) __other;
        return Objects.equals(medium, __otherCasted.medium) &&
            Objects.equals(sizeLimit, __otherCasted.sizeLimit);
    }
}
