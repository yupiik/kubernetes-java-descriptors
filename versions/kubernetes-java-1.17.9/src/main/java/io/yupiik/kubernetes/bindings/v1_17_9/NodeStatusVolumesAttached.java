package io.yupiik.kubernetes.bindings.v1_17_9;

import java.util.Objects;

public class NodeStatusVolumesAttached {
    private String devicePath;
    private String name;

    public NodeStatusVolumesAttached() {
        // no-op
    }

    public NodeStatusVolumesAttached(final String devicePath,
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
        if (!(__other instanceof NodeStatusVolumesAttached)) {
            return false;
        }
        final NodeStatusVolumesAttached __otherCasted = (NodeStatusVolumesAttached) __other;
        return Objects.equals(devicePath, __otherCasted.devicePath) &&
            Objects.equals(name, __otherCasted.name);
    }
}
