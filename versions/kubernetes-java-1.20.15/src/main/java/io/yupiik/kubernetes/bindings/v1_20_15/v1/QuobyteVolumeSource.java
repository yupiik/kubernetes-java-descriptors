package io.yupiik.kubernetes.bindings.v1_20_15.v1;

import io.yupiik.kubernetes.bindings.v1_20_15.Exportable;
import io.yupiik.kubernetes.bindings.v1_20_15.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_20_15.Validable;
import io.yupiik.kubernetes.bindings.v1_20_15.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class QuobyteVolumeSource implements Validable<QuobyteVolumeSource>, Exportable {
    private String group;
    private Boolean readOnly;
    private String registry;
    private String tenant;
    private String user;
    private String volume;

    public QuobyteVolumeSource() {
        // no-op
    }

    public QuobyteVolumeSource(final String group,
                               final Boolean readOnly,
                               final String registry,
                               final String tenant,
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

    public String getTenant() {
        return tenant;
    }

    public void setTenant(final String tenant) {
        this.tenant = tenant;
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
                tenant,
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
            Objects.equals(tenant, __otherCasted.tenant) &&
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

    public QuobyteVolumeSource tenant(final String tenant) {
        this.tenant = tenant;
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

    @Override
    public String asJson() {
        return Stream.of(
                    (group != null ? "\"group\":\"" +  JsonStrings.escapeJson(group) + "\"" : ""),
                    (readOnly != null ? "\"readOnly\":" + readOnly : ""),
                    (registry != null ? "\"registry\":\"" +  JsonStrings.escapeJson(registry) + "\"" : ""),
                    (tenant != null ? "\"tenant\":\"" +  JsonStrings.escapeJson(tenant) + "\"" : ""),
                    (user != null ? "\"user\":\"" +  JsonStrings.escapeJson(user) + "\"" : ""),
                    (volume != null ? "\"volume\":\"" +  JsonStrings.escapeJson(volume) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
