package io.yupiik.kubernetes.bindings.v1_23_5.v1beta1;

import io.yupiik.kubernetes.bindings.v1_23_5.Validable;
import io.yupiik.kubernetes.bindings.v1_23_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SeccompProfile implements Validable<SeccompProfile> {
    private String localhostProfile;
    private SeccompProfileType type;

    public SeccompProfile() {
        // no-op
    }

    public SeccompProfile(final String localhostProfile,
                          final SeccompProfileType type) {
        // no-op
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public SeccompProfileType getType() {
        return type;
    }

    public void setType(final SeccompProfileType type) {
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
        if (!(__other instanceof SeccompProfile)) {
            return false;
        }
        final SeccompProfile __otherCasted = (SeccompProfile) __other;
        return Objects.equals(localhostProfile, __otherCasted.localhostProfile) &&
            Objects.equals(type, __otherCasted.type);
    }

    public SeccompProfile localhostProfile(final String localhostProfile) {
        this.localhostProfile = localhostProfile;
        return this;
    }

    public SeccompProfile type(final SeccompProfileType type) {
        this.type = type;
        return this;
    }

    @Override
    public SeccompProfile validate() {
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
}
