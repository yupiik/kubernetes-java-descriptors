package io.yupiik.kubernetes.bindings.v1_19_5.v1;

import java.util.List;
import java.util.Objects;

public class CSIDriverListItemsSpec {
    private Boolean attachRequired;
    private String fsGroupPolicy;
    private Boolean podInfoOnMount;
    private Boolean storageCapacity;
    private List<String> volumeLifecycleModes;

    public CSIDriverListItemsSpec() {
        // no-op
    }

    public CSIDriverListItemsSpec(final Boolean attachRequired,
                                  final String fsGroupPolicy,
                                  final Boolean podInfoOnMount,
                                  final Boolean storageCapacity,
                                  final List<String> volumeLifecycleModes) {
        // no-op
    }

    public Boolean getAttachRequired() {
        return attachRequired;
    }

    public void setAttachRequired(final Boolean attachRequired) {
        this.attachRequired = attachRequired;
    }

    public String getFsGroupPolicy() {
        return fsGroupPolicy;
    }

    public void setFsGroupPolicy(final String fsGroupPolicy) {
        this.fsGroupPolicy = fsGroupPolicy;
    }

    public Boolean getPodInfoOnMount() {
        return podInfoOnMount;
    }

    public void setPodInfoOnMount(final Boolean podInfoOnMount) {
        this.podInfoOnMount = podInfoOnMount;
    }

    public Boolean getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(final Boolean storageCapacity) {
        this.storageCapacity = storageCapacity;
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
                fsGroupPolicy,
                podInfoOnMount,
                storageCapacity,
                volumeLifecycleModes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSIDriverListItemsSpec)) {
            return false;
        }
        final CSIDriverListItemsSpec __otherCasted = (CSIDriverListItemsSpec) __other;
        return Objects.equals(attachRequired, __otherCasted.attachRequired) &&
            Objects.equals(fsGroupPolicy, __otherCasted.fsGroupPolicy) &&
            Objects.equals(podInfoOnMount, __otherCasted.podInfoOnMount) &&
            Objects.equals(storageCapacity, __otherCasted.storageCapacity) &&
            Objects.equals(volumeLifecycleModes, __otherCasted.volumeLifecycleModes);
    }
}
