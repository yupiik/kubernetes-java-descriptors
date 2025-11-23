package io.yupiik.kubernetes.bindings.v1_31_8.v1;

import io.yupiik.kubernetes.bindings.v1_31_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_31_8.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_31_8.Validable;
import io.yupiik.kubernetes.bindings.v1_31_8.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class AppArmorProfile implements Validable<AppArmorProfile>, Exportable {
    private String localhostProfile;
    private String type;

    public AppArmorProfile() {
        // no-op
    }

    public AppArmorProfile(final String localhostProfile,
                           final String type) {
        this.localhostProfile = localhostProfile;
        this.type = type;
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                localhostProfile,
                type);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof AppArmorProfile)) {
            return false;
        }
        final AppArmorProfile __otherCasted = (AppArmorProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }

    public AppArmorProfile localhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
        return this;
    }

    public AppArmorProfile type(final String type) {
        this.type = type;
        return this;
    }

    @Override
    public AppArmorProfile validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (type == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "type", "type",
                "Missing 'type' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (localhostProfile != null ? "\"localhostProfile\":\"" +  JsonStrings.escapeJson(localhostProfile) + "\"" : ""),
                    (type != null ? "\"type\":\"" +  JsonStrings.escapeJson(type) + "\"" : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
