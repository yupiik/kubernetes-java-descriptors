package io.yupiik.kubernetes.bindings.v1_21_3;

import java.util.List;
import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec {
    private List<String> accessModes;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector;
    private String storageClassName;
    private String volumeMode;
    private String volumeName;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec(final List<String> accessModes,
                                                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource,
                                                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources,
                                                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector,
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

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources getResources() {
        return resources;
    }

    public void setResources(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources) {
        this.resources = resources;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec) __other;
        return Objects.equals(accessModes, __otherCasted.accessModes) &&
            Objects.equals(dataSource, __otherCasted.dataSource) &&
            Objects.equals(resources, __otherCasted.resources) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(storageClassName, __otherCasted.storageClassName) &&
            Objects.equals(volumeMode, __otherCasted.volumeMode) &&
            Objects.equals(volumeName, __otherCasted.volumeName);
    }
}
