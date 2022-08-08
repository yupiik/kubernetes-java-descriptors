package io.yupiik.kubernetes.bindings.v1_19_4;

import java.util.List;
import java.util.Objects;

public class JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec {
    private List<String> accessModes;
    private JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource;
    private JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources;
    private JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector;
    private String storageClassName;
    private String volumeMode;
    private String volumeName;

    public JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec(final List<String> accessModes,
                                                                      final JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource,
                                                                      final JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources,
                                                                      final JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector,
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

    public JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(final JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources getResources() {
        return resources;
    }

    public void setResources(final JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources) {
        this.resources = resources;
    }

    public JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector) {
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
        if (!(__other instanceof JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec __otherCasted = (JobSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec) __other;
        return Objects.equals(accessModes, __otherCasted.accessModes) &&
            Objects.equals(dataSource, __otherCasted.dataSource) &&
            Objects.equals(resources, __otherCasted.resources) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(storageClassName, __otherCasted.storageClassName) &&
            Objects.equals(volumeMode, __otherCasted.volumeMode) &&
            Objects.equals(volumeName, __otherCasted.volumeName);
    }
}
