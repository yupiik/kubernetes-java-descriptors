package io.yupiik.kubernetes.bindings.v1_15_11;

import java.util.Objects;

public class CSIDriverListItemsSpec {
    private Boolean attachRequired;
    private Boolean podInfoOnMount;

    public CSIDriverListItemsSpec() {
        // no-op
    }

    public CSIDriverListItemsSpec(final Boolean attachRequired,
                                  final Boolean podInfoOnMount) {
        // no-op
    }

    public Boolean getAttachRequired() {
        return attachRequired;
    }

    public void setAttachRequired(final Boolean attachRequired) {
        this.attachRequired = attachRequired;
    }

    public Boolean getPodInfoOnMount() {
        return podInfoOnMount;
    }

    public void setPodInfoOnMount(final Boolean podInfoOnMount) {
        this.podInfoOnMount = podInfoOnMount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                attachRequired,
                podInfoOnMount);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSIDriverListItemsSpec)) {
            return false;
        }
        final CSIDriverListItemsSpec __otherCasted = (CSIDriverListItemsSpec) __other;
        return Objects.equals(attachRequired, __otherCasted.attachRequired) &&
            Objects.equals(podInfoOnMount, __otherCasted.podInfoOnMount);
    }
}
