package io.yupiik.kubernetes.bindings.v1_18_19;

import java.util.List;
import java.util.Objects;

public class CSIDriverListItemsSpec {
    private Boolean attachRequired;
    private Boolean podInfoOnMount;
    private List<String> volumeLifecycleModes;

    public CSIDriverListItemsSpec() {
        // no-op
    }

    public CSIDriverListItemsSpec(final Boolean attachRequired,
                                  final Boolean podInfoOnMount,
                                  final List<String> volumeLifecycleModes) {
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

    public List<String> getVolumeLifecycleModes() {
        return volumeLifecycleModes;
    }

    public void setVolumeLifecycleModes(final List<String> volumeLifecycleModes) {
        this.volumeLifecycleModes = volumeLifecycleModes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                attachRequired,
                podInfoOnMount,
                volumeLifecycleModes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSIDriverListItemsSpec)) {
            return false;
        }
        final CSIDriverListItemsSpec __otherCasted = (CSIDriverListItemsSpec) __other;
        return Objects.equals(attachRequired, __otherCasted.attachRequired) &&
            Objects.equals(podInfoOnMount, __otherCasted.podInfoOnMount) &&
            Objects.equals(volumeLifecycleModes, __otherCasted.volumeLifecycleModes);
    }
}
