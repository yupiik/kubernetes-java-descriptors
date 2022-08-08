package io.yupiik.kubernetes.bindings.v1_17_4.v1beta2;

import io.yupiik.kubernetes.bindings.v1_17_4.Validable;
import io.yupiik.kubernetes.bindings.v1_17_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ServiceAccountTokenProjection implements Validable<ServiceAccountTokenProjection> {
    private String audience;
    private Integer expirationSeconds;
    private String path;

    public ServiceAccountTokenProjection() {
        // no-op
    }

    public ServiceAccountTokenProjection(final String audience,
                                         final Integer expirationSeconds,
                                         final String path) {
        // no-op
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(final String audience) {
        this.audience = audience;
    }

    public Integer getExpirationSeconds() {
        return expirationSeconds;
    }

    public void setExpirationSeconds(final Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
    }

    public String getPath() {
        return path;
    }

    public void setPath(final String path) {
        this.path = path;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                audience,
                expirationSeconds,
                path);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceAccountTokenProjection)) {
            return false;
        }
        final ServiceAccountTokenProjection __otherCasted = (ServiceAccountTokenProjection) __other;
        return Objects.equals(audience, __otherCasted.audience) &&
            Objects.equals(expirationSeconds, __otherCasted.expirationSeconds) &&
            Objects.equals(path, __otherCasted.path);
    }

    public ServiceAccountTokenProjection audience(final String audience) {
        this.audience = audience;
        return this;
    }

    public ServiceAccountTokenProjection expirationSeconds(final Integer expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
        return this;
    }

    public ServiceAccountTokenProjection path(final String path) {
        this.path = path;
        return this;
    }

    @Override
    public ServiceAccountTokenProjection validate() {
        List<ValidationException.ValidationError> __errors_jsonSchema = null;
        if (path == null) {
            if (__errors_jsonSchema == null) {
                __errors_jsonSchema = new ArrayList<>();
            }
            __errors_jsonSchema.add(new ValidationException.ValidationError(
                "path", "path",
                "Missing 'path' attribute.", true));
        }
        if (__errors_jsonSchema != null) {
            throw new ValidationException(__errors_jsonSchema);
        }
        return this;
    }
}
