package io.yupiik.kubernetes.bindings.v1_11_8.v1beta1;

import io.yupiik.kubernetes.bindings.v1_11_8.Exportable;
import io.yupiik.kubernetes.bindings.v1_11_8.Validable;
import io.yupiik.kubernetes.bindings.v1_11_8.ValidationException;
import jakarta.json.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class CustomResourceSubresources implements Validable<CustomResourceSubresources>, Exportable {
    private CustomResourceSubresourceScale scale;
    private JsonValue status;

    public CustomResourceSubresources() {
        // no-op
    }

    public CustomResourceSubresources(final CustomResourceSubresourceScale scale,
                                      final JsonValue status) {
        // no-op
    }

    public CustomResourceSubresourceScale getScale() {
        return scale;
    }

    public void setScale(final CustomResourceSubresourceScale scale) {
        this.scale = scale;
    }

    public JsonValue getStatus() {
        return status;
    }

    public void setStatus(final JsonValue status) {
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

    public CustomResourceSubresources status(final JsonValue status) {
        this.status = status;
        return this;
    }

    @Override
    public CustomResourceSubresources validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (scale != null ? "\"scale\":" + scale.asJson() : ""),
                    (status != null ? "\"status\":" + status : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
