package io.yupiik.kubernetes.bindings.v1_15_10.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesEmptyDir {
    private String medium;
    private String sizeLimit;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesEmptyDir() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesEmptyDir(final String medium,
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesEmptyDir)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesEmptyDir __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesEmptyDir) __other;
        return Objects.equals(medium, __otherCasted.medium) &&
            Objects.equals(sizeLimit, __otherCasted.sizeLimit);
    }
}
