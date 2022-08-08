package io.yupiik.kubernetes.bindings.v1_24_2.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecInitContainersVolumeDevices {
    private String devicePath;
    private String name;

    public JobListItemsSpecTemplateSpecInitContainersVolumeDevices() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecInitContainersVolumeDevices(final String devicePath,
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecInitContainersVolumeDevices)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecInitContainersVolumeDevices __otherCasted = (JobListItemsSpecTemplateSpecInitContainersVolumeDevices) __other;
        return Objects.equals(devicePath, __otherCasted.devicePath) &&
            Objects.equals(name, __otherCasted.name);
    }
}
