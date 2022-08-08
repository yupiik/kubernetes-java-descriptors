package io.yupiik.kubernetes.bindings.v1_9_6.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_9_6.Validable;
import io.yupiik.kubernetes.bindings.v1_9_6.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VolumeDevice implements Validable<VolumeDevice> {
    private String devicePath;
    private String name;

    public VolumeDevice() {
        // no-op
    }

    public VolumeDevice(final String devicePath,
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
        if (!(__other instanceof VolumeDevice)) {
            return false;
        }
        final VolumeDevice __otherCasted = (VolumeDevice) __other;
        return Objects.equals(devicePath, __otherCasted.devicePath) &&
            Objects.equals(name, __otherCasted.name);
    }

    public VolumeDevice devicePath(final String devicePath) {
        this.devicePath = devicePath;
        return this;
    }

    public VolumeDevice name(final String name) {
        this.name = name;
        return this;
    }

    @Override
    public VolumeDevice validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (devicePath == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "devicePath", "devicePath",
                "Missing 'devicePath' attribute.", true));
        }
        if (name == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "name", "name",
                "Missing 'name' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
