package io.yupiik.kubernetes.bindings.v1_25_10.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_25_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_25_10.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_25_10.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class StorageVersionStatus implements Validable<StorageVersionStatus>, Exportable {
    private String commonEncodingVersion;
    private List<StorageVersionCondition> conditions;
    private List<ServerStorageVersion> storageVersions;

    public StorageVersionStatus() {
        // no-op
    }

    public StorageVersionStatus(final String commonEncodingVersion,
                                final List<StorageVersionCondition> conditions,
                                final List<ServerStorageVersion> storageVersions) {
        this.commonEncodingVersion = commonEncodingVersion;
        this.conditions = conditions;
        this.storageVersions = storageVersions;
    }

    public String getCommonEncodingVersion() {
        return commonEncodingVersion;
    }

    public void setCommonEncodingVersion(final String commonEncodingVersion) {
        this.commonEncodingVersion = commonEncodingVersion;
    }

    public List<StorageVersionCondition> getConditions() {
        return conditions;
    }

    public void setConditions(final List<StorageVersionCondition> conditions) {
        this.conditions = conditions;
    }

    public List<ServerStorageVersion> getStorageVersions() {
        return storageVersions;
    }

    public void setStorageVersions(final List<ServerStorageVersion> storageVersions) {
        this.storageVersions = storageVersions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                commonEncodingVersion,
                conditions,
                storageVersions);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof StorageVersionStatus)) {
            return false;
        }
        final StorageVersionStatus __otherCasted = (StorageVersionStatus) __other;
        return Objects.equals(commonEncodingVersion, __otherCasted.commonEncodingVersion) &&
            Objects.equals(conditions, __otherCasted.conditions) &&
            Objects.equals(storageVersions, __otherCasted.storageVersions);
    }

    public StorageVersionStatus commonEncodingVersion(final String commonEncodingVersion) {
        this.commonEncodingVersion = commonEncodingVersion;
        return this;
    }

    public StorageVersionStatus conditions(final List<StorageVersionCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    public StorageVersionStatus storageVersions(final List<ServerStorageVersion> storageVersions) {
        this.storageVersions = storageVersions;
        return this;
    }

    @Override
    public StorageVersionStatus validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (commonEncodingVersion != null ? "\"commonEncodingVersion\":\"" +  JsonStrings.escapeJson(commonEncodingVersion) + "\"" : ""),
                    (conditions != null ? "\"conditions\":" + conditions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (storageVersions != null ? "\"storageVersions\":" + storageVersions.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
