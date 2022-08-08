package io.yupiik.kubernetes.bindings.v1_17_13.v1;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecVolumeClaimTemplatesSpec {
    private List<String> accessModes;
    private StatefulSetListItemsSpecVolumeClaimTemplatesSpecDataSource dataSource;
    private StatefulSetListItemsSpecVolumeClaimTemplatesSpecResources resources;
    private StatefulSetListItemsSpecVolumeClaimTemplatesSpecSelector selector;
    private String storageClassName;
    private String volumeMode;
    private String volumeName;

    public StatefulSetListItemsSpecVolumeClaimTemplatesSpec() {
        // no-op
    }

    public StatefulSetListItemsSpecVolumeClaimTemplatesSpec(final List<String> accessModes,
                                                            final StatefulSetListItemsSpecVolumeClaimTemplatesSpecDataSource dataSource,
                                                            final StatefulSetListItemsSpecVolumeClaimTemplatesSpecResources resources,
                                                            final StatefulSetListItemsSpecVolumeClaimTemplatesSpecSelector selector,
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

    public StatefulSetListItemsSpecVolumeClaimTemplatesSpecDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(final StatefulSetListItemsSpecVolumeClaimTemplatesSpecDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public StatefulSetListItemsSpecVolumeClaimTemplatesSpecResources getResources() {
        return resources;
    }

    public void setResources(final StatefulSetListItemsSpecVolumeClaimTemplatesSpecResources resources) {
        this.resources = resources;
    }

    public StatefulSetListItemsSpecVolumeClaimTemplatesSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final StatefulSetListItemsSpecVolumeClaimTemplatesSpecSelector selector) {
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
        if (!(__other instanceof StatefulSetListItemsSpecVolumeClaimTemplatesSpec)) {
            return false;
        }
        final StatefulSetListItemsSpecVolumeClaimTemplatesSpec __otherCasted = (StatefulSetListItemsSpecVolumeClaimTemplatesSpec) __other;
        return Objects.equals(accessModes, __otherCasted.accessModes) &&
            Objects.equals(dataSource, __otherCasted.dataSource) &&
            Objects.equals(resources, __otherCasted.resources) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(storageClassName, __otherCasted.storageClassName) &&
            Objects.equals(volumeMode, __otherCasted.volumeMode) &&
            Objects.equals(volumeName, __otherCasted.volumeName);
    }
}
