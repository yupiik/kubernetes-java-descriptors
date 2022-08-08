package io.yupiik.kubernetes.bindings.v1_19_9;

import java.util.List;
import java.util.Objects;

public class PersistentVolumeClaimListItemsSpec {
    private List<String> accessModes;
    private PersistentVolumeClaimListItemsSpecDataSource dataSource;
    private PersistentVolumeClaimListItemsSpecResources resources;
    private PersistentVolumeClaimListItemsSpecSelector selector;
    private String storageClassName;
    private String volumeMode;
    private String volumeName;

    public PersistentVolumeClaimListItemsSpec() {
        // no-op
    }

    public PersistentVolumeClaimListItemsSpec(final List<String> accessModes,
                                              final PersistentVolumeClaimListItemsSpecDataSource dataSource,
                                              final PersistentVolumeClaimListItemsSpecResources resources,
                                              final PersistentVolumeClaimListItemsSpecSelector selector,
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

    public PersistentVolumeClaimListItemsSpecDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(final PersistentVolumeClaimListItemsSpecDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public PersistentVolumeClaimListItemsSpecResources getResources() {
        return resources;
    }

    public void setResources(final PersistentVolumeClaimListItemsSpecResources resources) {
        this.resources = resources;
    }

    public PersistentVolumeClaimListItemsSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final PersistentVolumeClaimListItemsSpecSelector selector) {
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
        if (!(__other instanceof PersistentVolumeClaimListItemsSpec)) {
            return false;
        }
        final PersistentVolumeClaimListItemsSpec __otherCasted = (PersistentVolumeClaimListItemsSpec) __other;
        return Objects.equals(accessModes, __otherCasted.accessModes) &&
            Objects.equals(dataSource, __otherCasted.dataSource) &&
            Objects.equals(resources, __otherCasted.resources) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(storageClassName, __otherCasted.storageClassName) &&
            Objects.equals(volumeMode, __otherCasted.volumeMode) &&
            Objects.equals(volumeName, __otherCasted.volumeName);
    }
}
