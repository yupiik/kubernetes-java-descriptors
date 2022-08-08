package io.yupiik.kubernetes.bindings.v1_11_1.v1beta2;

import io.yupiik.kubernetes.bindings.v1_11_1.Validable;
import io.yupiik.kubernetes.bindings.v1_11_1.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class QuobyteVolumeSource implements Validable<QuobyteVolumeSource> {
    private String group;
    private Boolean readOnly;
    private String registry;
    private String user;
    private String volume;

    public QuobyteVolumeSource() {
        // no-op
    }

    public QuobyteVolumeSource(final String group,
                               final Boolean readOnly,
                               final String registry,
                               final String user,
                               final String volume) {
        // no-op
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        this.group = group;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getRegistry() {
        return registry;
    }

    public void setRegistry(final String registry) {
        this.registry = registry;
    }

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(final String volume) {
        this.volume = volume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                group,
                readOnly,
                registry,
                user,
                volume);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof QuobyteVolumeSource)) {
            return false;
        }
        final QuobyteVolumeSource __otherCasted = (QuobyteVolumeSource) __other;
        return Objects.equals(group, __otherCasted.group) &&
            Objects.equals(readOnly, __otherCasted.readOnly) &&
            Objects.equals(registry, __otherCasted.registry) &&
            Objects.equals(user, __otherCasted.user) &&
            Objects.equals(volume, __otherCasted.volume);
    }

    public QuobyteVolumeSource group(final String group) {
        this.group = group;
        return this;
    }

    public QuobyteVolumeSource readOnly(final Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public QuobyteVolumeSource registry(final String registry) {
        this.registry = registry;
        return this;
    }

    public QuobyteVolumeSource user(final String user) {
        this.user = user;
        return this;
    }

    public QuobyteVolumeSource volume(final String volume) {
        this.volume = volume;
        return this;
    }

    @Override
    public QuobyteVolumeSource validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (registry == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "registry", "registry",
                "Missing 'registry' attribute.", true));
        }
        if (volume == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "volume", "volume",
                "Missing 'volume' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
