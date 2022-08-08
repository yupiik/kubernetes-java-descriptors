package io.yupiik.kubernetes.bindings.v1_22_6.v1;

import java.util.List;
import java.util.Objects;

public class PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec {
    private List<String> accessModes;
    private PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource;
    private PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef dataSourceRef;
    private PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources;
    private PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector;
    private String storageClassName;
    private String volumeMode;
    private String volumeName;

    public PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec(final List<String> accessModes,
                                                                          final PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource,
                                                                          final PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef dataSourceRef,
                                                                          final PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources,
                                                                          final PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector,
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

    public PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(final PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef getDataSourceRef() {
        return dataSourceRef;
    }

    public void setDataSourceRef(final PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSourceRef dataSourceRef) {
        this.dataSourceRef = dataSourceRef;
    }

    public PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources getResources() {
        return resources;
    }

    public void setResources(final PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources) {
        this.resources = resources;
    }

    public PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector) {
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
        if (!(__other instanceof PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec __otherCasted = (PodTemplateTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec) __other;
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
