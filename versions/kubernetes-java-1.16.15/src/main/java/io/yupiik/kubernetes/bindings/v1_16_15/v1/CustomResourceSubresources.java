package io.yupiik.kubernetes.bindings.v1_16_15.v1;

import io.yupiik.kubernetes.bindings.v1_16_15.Validable;
import io.yupiik.kubernetes.bindings.v1_16_15.ValidationException;
import jakarta.json.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomResourceSubresources implements Validable<CustomResourceSubresources> {
    private CustomResourceSubresourceScale scale;
    private JsonObject status;

    public CustomResourceSubresources() {
        // no-op
    }

    public CustomResourceSubresources(final CustomResourceSubresourceScale scale,
                                      final JsonObject status) {
        // no-op
    }

    public CustomResourceSubresourceScale getScale() {
        return scale;
    }

    public void setScale(final CustomResourceSubresourceScale scale) {
        this.scale = scale;
    }

    public JsonObject getStatus() {
        return status;
    }

    public void setStatus(final JsonObject status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                scale,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceSubresources)) {
            return false;
        }
        final CustomResourceSubresources __otherCasted = (CustomResourceSubresources) __other;
        return Objects.equals(scale, __otherCasted.scale) &&
            Objects.equals(status, __otherCasted.status);
    }

    public CustomResourceSubresources scale(final CustomResourceSubresourceScale scale) {
        this.scale = scale;
        return this;
    }

    public CustomResourceSubresources status(final JsonObject status) {
        this.status = status;
        return this;
    }

    @Override
    public CustomResourceSubresources validate() {
        return this;
    }
}
