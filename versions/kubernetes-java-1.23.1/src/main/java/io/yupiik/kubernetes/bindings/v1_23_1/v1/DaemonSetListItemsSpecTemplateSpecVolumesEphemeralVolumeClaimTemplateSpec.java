package io.yupiik.kubernetes.bindings.v1_23_1.v1;

import java.util.List;
import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec {
    private List<String> accessModes;
    private DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource;
    private DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef dataSourceRef;
    private DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources;
    private DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector;
    private String storageClassName;
    private String volumeMode;
    private String volumeName;

    public DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec(final List<String> accessModes,
                                                                                     final DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource,
                                                                                     final DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef dataSourceRef,
                                                                                     final DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources,
                                                                                     final DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector,
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

    public DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(final DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef getDataSourceRef() {
        return dataSourceRef;
    }

    public void setDataSourceRef(final DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef dataSourceRef) {
        this.dataSourceRef = dataSourceRef;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources getResources() {
        return resources;
    }

    public void setResources(final DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources) {
        this.resources = resources;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec) __other;
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
