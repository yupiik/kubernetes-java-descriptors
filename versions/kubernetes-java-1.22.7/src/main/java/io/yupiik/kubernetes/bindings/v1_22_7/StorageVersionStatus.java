package io.yupiik.kubernetes.bindings.v1_22_7;

import java.util.List;
import java.util.Objects;

public class StorageVersionStatus {
    private String commonEncodingVersion;
    private List<StorageVersionStatusConditions> conditions;
    private List<StorageVersionStatusStorageVersions> storageVersions;

    public StorageVersionStatus() {
        // no-op
    }

    public StorageVersionStatus(final String commonEncodingVersion,
                                final List<StorageVersionStatusConditions> conditions,
                                final List<StorageVersionStatusStorageVersions> storageVersions) {
        // no-op
    }

    public String getCommonEncodingVersion() {
        return commonEncodingVersion;
    }

    public void setCommonEncodingVersion(final String commonEncodingVersion) {
        this.commonEncodingVersion = commonEncodingVersion;
    }

    public List<StorageVersionStatusConditions> getConditions() {
        return conditions;
    }

    public void setConditions(final List<StorageVersionStatusConditions> conditions) {
        this.conditions = conditions;
    }

    public List<StorageVersionStatusStorageVersions> getStorageVersions() {
        return storageVersions;
    }

    public void setStorageVersions(final List<StorageVersionStatusStorageVersions> storageVersions) {
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
}
