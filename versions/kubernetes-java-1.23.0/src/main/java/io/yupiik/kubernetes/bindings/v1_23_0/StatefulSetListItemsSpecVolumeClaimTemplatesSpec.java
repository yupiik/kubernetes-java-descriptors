package io.yupiik.kubernetes.bindings.v1_23_0;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecVolumeClaimTemplatesSpec {
    private List<String> accessModes;
    private StatefulSetListItemsSpecVolumeClaimTemplatesSpecDataSource dataSource;
    private StatefulSetListItemsSpecVolumeClaimTemplatesSpecDataSourceRef dataSourceRef;
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
                                                            final StatefulSetListItemsSpecVolumeClaimTemplatesSpecDataSourceRef dataSourceRef,
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

    public StatefulSetListItemsSpecVolumeClaimTemplatesSpecDataSourceRef getDataSourceRef() {
        return dataSourceRef;
    }

    public void setDataSourceRef(final StatefulSetListItemsSpecVolumeClaimTemplatesSpecDataSourceRef dataSourceRef) {
        this.dataSourceRef = dataSourceRef;
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
                dataSourceRef,
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
            Objects.equals(dataSourceRef, __otherCasted.dataSourceRef) &&
            Objects.equals(resources, __otherCasted.resources) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(storageClassName, __otherCasted.storageClassName) &&
            Objects.equals(volumeMode, __otherCasted.volumeMode) &&
            Objects.equals(volumeName, __otherCasted.volumeName);
    }
}
