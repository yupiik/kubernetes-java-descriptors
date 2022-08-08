package io.yupiik.kubernetes.bindings.v1_23_1;

import java.util.List;
import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec {
    private List<String> accessModes;
    private StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource;
    private StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef dataSourceRef;
    private StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources;
    private StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector;
    private String storageClassName;
    private String volumeMode;
    private String volumeName;

    public StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec(final List<String> accessModes,
                                                                                       final StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource,
                                                                                       final StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef dataSourceRef,
                                                                                       final StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources,
                                                                                       final StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector,
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

    public StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(final StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef getDataSourceRef() {
        return dataSourceRef;
    }

    public void setDataSourceRef(final StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef dataSourceRef) {
        this.dataSourceRef = dataSourceRef;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources getResources() {
        return resources;
    }

    public void setResources(final StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources) {
        this.resources = resources;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec) __other;
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
