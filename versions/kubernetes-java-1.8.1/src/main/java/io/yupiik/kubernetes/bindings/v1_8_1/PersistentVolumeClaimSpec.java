package io.yupiik.kubernetes.bindings.v1_8_1;

import java.util.List;
import java.util.Objects;

public class PersistentVolumeClaimSpec {
    private List<String> accessModes;
    private PersistentVolumeClaimSpecResources resources;
    private PersistentVolumeClaimSpecSelector selector;
    private String storageClassName;
    private String volumeName;

    public PersistentVolumeClaimSpec() {
        // no-op
    }

    public PersistentVolumeClaimSpec(final List<String> accessModes,
                                     final PersistentVolumeClaimSpecResources resources,
                                     final PersistentVolumeClaimSpecSelector selector,
                                     final String storageClassName,
                                     final String volumeName) {
        // no-op
    }

    public List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(final List<String> accessModes) {
        this.accessModes = accessModes;
    }

    public PersistentVolumeClaimSpecResources getResources() {
        return resources;
    }

    public void setResources(final PersistentVolumeClaimSpecResources resources) {
        this.resources = resources;
    }

    public PersistentVolumeClaimSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final PersistentVolumeClaimSpecSelector selector) {
        this.selector = selector;
    }

    public String getStorageClassName() {
        return storageClassName;
    }

    public void setStorageClassName(final String storageClassName) {
        this.storageClassName = storageClassName;
    }

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(final String volumeName) {
        this.volumeName = volumeName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                accessModes,
                resources,
                selector,
                storageClassName,
                volumeName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeClaimSpec)) {
            return false;
        }
        final PersistentVolumeClaimSpec __otherCasted = (PersistentVolumeClaimSpec) __other;
        return Objects.equals(accessModes, __otherCasted.accessModes) &&
            Objects.equals(resources, __otherCasted.resources) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(storageClassName, __otherCasted.storageClassName) &&
            Objects.equals(volumeName, __otherCasted.volumeName);
    }
}
