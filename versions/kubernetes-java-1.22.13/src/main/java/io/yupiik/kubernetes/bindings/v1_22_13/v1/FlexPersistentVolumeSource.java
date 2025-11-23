package io.yupiik.kubernetes.bindings.v1_22_13.v1;

import io.yupiik.kubernetes.bindings.v1_22_13.Exportable;
import io.yupiik.kubernetes.bindings.v1_22_13.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_22_13.Validable;
import io.yupiik.kubernetes.bindings.v1_22_13.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class FlexPersistentVolumeSource implements Validable<FlexPersistentVolumeSource>, Exportable {
    private String driver;
    private String fsType;
    private Map<String, String> options;
    private Boolean readOnly;
    private SecretReference secretRef;

    public FlexPersistentVolumeSource() {
        // no-op
    }

    public FlexPersistentVolumeSource(final String driver,
                                      final String fsType,
                                      final Map<String, String> options,
                                      final Boolean readOnly,
                                      final SecretReference secretRef) {
        this.driver = driver;
        this.fsType = fsType;
        this.options = options;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(final String driver) {
        this.driver = driver;
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(final String fsType) {
        this.fsType = fsType;
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(final Map<String, String> options) {
        this.options = options;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public SecretReference getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(final SecretReference secretRef) {
        this.secretRef = secretRef;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                driver,
                fsType,
                options,
                readOnly,
                secretRef);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof FlexPersistentVolumeSource)) {
            return false;
        }
        final FlexPersistentVolumeSource __otherCasted = (FlexPersistentVolumeSource) __other;
        return Objects.equals(driver, __otherCasted.driver) &&
            Objects.equals(fsType, __otherCasted.fsType) &&
            Objects.equals(options, __otherCasted.options) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(secretRef, __otherCasted.secretRef);
    }

    public FlexPersistentVolumeSource driver(final String driver) {
        this.driver = driver;
        return this;
    }

    public FlexPersistentVolumeSource fsType(final String fsType) {
        this.fsType = fsType;
        return this;
    }

    public FlexPersistentVolumeSource options(final Map<String, String> options) {
        this.options = options;
        return this;
    }

    public FlexPersistentVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public FlexPersistentVolumeSource secretRef(final SecretReference secretRef) {
        this.secretRef = secretRef;
        return this;
    }

    @Override
    public FlexPersistentVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (driver == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "driver", "driver",
                "Missing 'driver' attribute.", true));
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
                    (fsType != null ? "\"fsType\":\"" +  JsonStrings.escapeJson(fsType) + "\"" : ""),
                    (options != null ? "\"options\":" + options.entrySet().stream()
                        .map(__it -> "\"" + JsonStrings.escapeJson(__it.getKey()) + "\":" + (__it.getValue() == null ? "null" : ("\"" + JsonStrings.escapeJson(__it.getValue()) + "\"")))
                        .collect(joining(",", "{", "}")) : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (secretRef != null ? "\"secretRef\":" + secretRef.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
