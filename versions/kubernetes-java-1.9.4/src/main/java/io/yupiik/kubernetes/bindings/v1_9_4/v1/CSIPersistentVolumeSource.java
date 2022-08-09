package io.yupiik.kubernetes.bindings.v1_9_4.v1;

import io.yupiik.kubernetes.bindings.v1_9_4.Exportable;
import io.yupiik.kubernetes.bindings.v1_9_4.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_9_4.Validable;
import io.yupiik.kubernetes.bindings.v1_9_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CSIPersistentVolumeSource implements Validable<CSIPersistentVolumeSource>, Exportable {
    private String driver;
    private Boolean readOnly;
    private String volumeHandle;

    public CSIPersistentVolumeSource() {
        // no-op
    }

    public CSIPersistentVolumeSource(final String driver,
                                     final Boolean readOnly,
                                     final String volumeHandle) {
        // no-op
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(final String driver) {
        this.driver = driver;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getVolumeHandle() {
        return volumeHandle;
    }

    public void setVolumeHandle(final String volumeHandle) {
        this.volumeHandle = volumeHandle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                driver,
                readOnly,
                volumeHandle);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CSIPersistentVolumeSource)) {
            return false;
        }
        final CSIPersistentVolumeSource __otherCasted = (CSIPersistentVolumeSource) __other;
        return Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(volumeHandle, __otherCasted.volumeHandle);
    }

    public CSIPersistentVolumeSource driver(final String driver) {
        this.driver = driver;
        return this;
    }

    public CSIPersistentVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public CSIPersistentVolumeSource volumeHandle(final String volumeHandle) {
        this.volumeHandle = volumeHandle;
        return this;
    }

    @Override
    public CSIPersistentVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (driver == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "driver", "driver",
                "Missing 'driver' attribute.", true));
        }
        if (volumeHandle == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "volumeHandle", "volumeHandle",
                "Missing 'volumeHandle' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (driver != null ? "\"driver\":\"" +  JsonStrings.escapeJson(driver) + "\"" : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (volumeHandle != null ? "\"volumeHandle\":\"" +  JsonStrings.escapeJson(volumeHandle) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
