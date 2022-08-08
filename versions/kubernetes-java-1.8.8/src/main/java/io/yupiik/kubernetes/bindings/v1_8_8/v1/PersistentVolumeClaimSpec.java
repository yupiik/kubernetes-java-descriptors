package io.yupiik.kubernetes.bindings.v1_8_8.v1;

import io.yupiik.kubernetes.bindings.v1_8_8.Validable;
import io.yupiik.kubernetes.bindings.v1_8_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersistentVolumeClaimSpec implements Validable<PersistentVolumeClaimSpec> {
    private List<String> accessModes;
    private ResourceRequirements resources;
    private LabelSelector selector;
    private String storageClassName;
    private String volumeName;

    public PersistentVolumeClaimSpec() {
        // no-op
    }

    public PersistentVolumeClaimSpec(final List<String> accessModes,
                                     final ResourceRequirements resources,
                                     final LabelSelector selector,
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

    public ResourceRequirements getResources() {
        return resources;
    }

    public void setResources(final ResourceRequirements resources) {
        this.resources = resources;
    }

    public LabelSelector getSelector() {
        return selector;
    }

    public void setSelector(final LabelSelector selector) {
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

    public PersistentVolumeClaimSpec accessModes(final List<String> accessModes) {
        this.accessModes = accessModes;
        return this;
    }

    public PersistentVolumeClaimSpec resources(final ResourceRequirements resources) {
        this.resources = resources;
        return this;
    }

    public PersistentVolumeClaimSpec selector(final LabelSelector selector) {
        this.selector = selector;
        return this;
    }

    public PersistentVolumeClaimSpec storageClassName(final String storageClassName) {
        this.storageClassName = storageClassName;
        return this;
    }

    public PersistentVolumeClaimSpec volumeName(final String volumeName) {
        this.volumeName = volumeName;
        return this;
    }

    @Override
    public PersistentVolumeClaimSpec validate() {
        return this;
    }
}
