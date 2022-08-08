package io.yupiik.kubernetes.bindings.v1_15_4.v1;

import io.yupiik.kubernetes.bindings.v1_15_4.Validable;
import io.yupiik.kubernetes.bindings.v1_15_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PersistentVolumeClaimSpec implements Validable<PersistentVolumeClaimSpec> {
    private List<String> accessModes;
    private TypedLocalObjectReference dataSource;
    private ResourceRequirements resources;
    private LabelSelector selector;
    private String storageClassName;
    private String volumeMode;
    private String volumeName;

    public PersistentVolumeClaimSpec() {
        // no-op
    }

    public PersistentVolumeClaimSpec(final List<String> accessModes,
                                     final TypedLocalObjectReference dataSource,
                                     final ResourceRequirements resources,
                                     final LabelSelector selector,
                                     final String storageClassName,
                                     final String volumeMode,
                                     final String volumeName) {
        // no-op
    }

    public List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(final List<String> accessModes) {
        this.accessModes = accessModes;
    }

    public TypedLocalObjectReference getDataSource() {
        return dataSource;
    }

    public void setDataSource(final TypedLocalObjectReference dataSource) {
        this.dataSource = dataSource;
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

    public String getVolumeMode() {
        return volumeMode;
    }

    public void setVolumeMode(final String volumeMode) {
        this.volumeMode = volumeMode;
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
                dataSource,
                resources,
                selector,
                storageClassName,
                volumeMode,
                volumeName);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PersistentVolumeClaimSpec)) {
            return false;
        }
        final PersistentVolumeClaimSpec __otherCasted = (PersistentVolumeClaimSpec) __other;
        return Objects.equals(accessModes, __otherCasted.accessModes) &&
            Objects.equals(dataSource, __otherCasted.dataSource) &&
            Objects.equals(resources, __otherCasted.resources) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(storageClassName, __otherCasted.storageClassName) &&
            Objects.equals(volumeMode, __otherCasted.volumeMode) &&
            Objects.equals(volumeName, __otherCasted.volumeName);
    }

    public PersistentVolumeClaimSpec accessModes(final List<String> accessModes) {
        this.accessModes = accessModes;
        return this;
    }

    public PersistentVolumeClaimSpec dataSource(final TypedLocalObjectReference dataSource) {
        this.dataSource = dataSource;
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

    public PersistentVolumeClaimSpec volumeMode(final String volumeMode) {
        this.volumeMode = volumeMode;
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
