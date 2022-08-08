package io.yupiik.kubernetes.bindings.v1_16_4;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecInitContainersVolumeDevices {
    private String devicePath;
    private String name;

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersVolumeDevices() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecInitContainersVolumeDevices(final String devicePath,
                                                                                     final String name) {
        // no-op
    }

    public String getDevicePath() {
        return devicePath;
    }

    public void setDevicePath(final String devicePath) {
        this.devicePath = devicePath;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                devicePath,
                name);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecInitContainersVolumeDevices)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecInitContainersVolumeDevices __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecInitContainersVolumeDevices) __other;
        return Objects.equals(devicePath, __otherCasted.devicePath) &&
            Objects.equals(name, __otherCasted.name);
    }
}
