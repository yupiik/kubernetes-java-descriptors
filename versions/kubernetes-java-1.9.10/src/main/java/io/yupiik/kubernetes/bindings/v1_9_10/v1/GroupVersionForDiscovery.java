package io.yupiik.kubernetes.bindings.v1_9_10.v1;

import io.yupiik.kubernetes.bindings.v1_9_10.Validable;
import io.yupiik.kubernetes.bindings.v1_9_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GroupVersionForDiscovery implements Validable<GroupVersionForDiscovery> {
    private String groupVersion;
    private String version;

    public GroupVersionForDiscovery() {
        // no-op
    }

    public GroupVersionForDiscovery(final String groupVersion,
                                    final String version) {
        // no-op
    }

    public String getGroupVersion() {
        return groupVersion;
    }

    public void setGroupVersion(final String groupVersion) {
        this.groupVersion = groupVersion;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(final String version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                groupVersion,
                version);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof GroupVersionForDiscovery)) {
            return false;
        }
        final GroupVersionForDiscovery __otherCasted = (GroupVersionForDiscovery) __other;
        return Objects.equals(groupVersion, __otherCasted.groupVersion) &&
            Objects.equals(version, __otherCasted.version);
    }

    public GroupVersionForDiscovery groupVersion(final String groupVersion) {
        this.groupVersion = groupVersion;
        return this;
    }

    public GroupVersionForDiscovery version(final String version) {
        this.version = version;
        return this;
    }

    @Override
    public GroupVersionForDiscovery validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (groupVersion == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "groupVersion", "groupVersion",
                "Missing 'groupVersion' attribute.", true));
        }
        if (version == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "version", "version",
                "Missing 'version' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
