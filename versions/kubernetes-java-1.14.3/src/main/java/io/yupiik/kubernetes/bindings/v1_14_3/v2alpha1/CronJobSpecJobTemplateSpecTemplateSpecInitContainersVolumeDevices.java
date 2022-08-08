package io.yupiik.kubernetes.bindings.v1_14_3.v2alpha1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecInitContainersVolumeDevices {
    private String devicePath;
    private String name;

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersVolumeDevices() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecInitContainersVolumeDevices(final String devicePath,
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecInitContainersVolumeDevices)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecInitContainersVolumeDevices __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecInitContainersVolumeDevices) __other;
        return Objects.equals(devicePath, __otherCasted.devicePath) &&
            Objects.equals(name, __otherCasted.name);
    }
}
