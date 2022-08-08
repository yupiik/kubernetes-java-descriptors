package io.yupiik.kubernetes.bindings.v1_20_7;

import java.util.List;
import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec {
    private List<String> accessModes;
    private DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource;
    private DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources;
    private DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector;
    private String storageClassName;
    private String volumeMode;
    private String volumeName;

    public DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec(final List<String> accessModes,
                                                                            final DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource,
                                                                            final DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources,
                                                                            final DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector,
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

    public DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(final DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecDataSource dataSource) {
        this.dataSource = dataSource;
    }

    public DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources getResources() {
        return resources;
    }

    public void setResources(final DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecResources resources) {
        this.resources = resources;
    }

    public DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpecSelector selector) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec __otherCasted = (DaemonSetSpecTemplateSpecVolumesEphemeralVolumeClaimTemplateSpec) __other;
        return Objects.equals(accessModes, __otherCasted.accessModes) &&
            Objects.equals(dataSource, __otherCasted.dataSource) &&
            Objects.equals(resources, __otherCasted.resources) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(storageClassName, __otherCasted.storageClassName) &&
            Objects.equals(volumeMode, __otherCasted.volumeMode) &&
            Objects.equals(volumeName, __otherCasted.volumeName);
    }
}
