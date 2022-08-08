package io.yupiik.kubernetes.bindings.v1_22_12.v1;

import java.util.List;
import java.util.Objects;

public class PodSpecVolumesEphemeralVolumeClaimTemplateSpec {
    private List<String> accessModes;
    private PodSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource;
    private PodSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef dataSourceRef;
    private PodSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources;
    private PodSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector;
    private String storageClassName;
    private String volumeMode;
    private String volumeName;

    public PodSpecVolumesEphemeralVolumeClaimTemplateSpec() {
        // no-op
    }

    public PodSpecVolumesEphemeralVolumeClaimTemplateSpec(final List<String> accessModes,
                                                          final PodSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource,
                                                          final PodSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef dataSourceRef,
                                                          final PodSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources,
                                                          final PodSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector,
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

    public PodSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(final PodSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public PodSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef getDataSourceRef() {
        return dataSourceRef;
    }

    public void setDataSourceRef(final PodSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef dataSourceRef) {
        this.dataSourceRef = dataSourceRef;
    }

    public PodSpecVolumesEphemeralVolumeClaimTemplateSpecResources getResources() {
        return resources;
    }

    public void setResources(final PodSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources) {
        this.resources = resources;
    }

    public PodSpecVolumesEphemeralVolumeClaimTemplateSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final PodSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector) {
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
        if (!(__other instanceof PodSpecVolumesEphemeralVolumeClaimTemplateSpec)) {
            return false;
        }
        final PodSpecVolumesEphemeralVolumeClaimTemplateSpec __otherCasted = (PodSpecVolumesEphemeralVolumeClaimTemplateSpec) __other;
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
