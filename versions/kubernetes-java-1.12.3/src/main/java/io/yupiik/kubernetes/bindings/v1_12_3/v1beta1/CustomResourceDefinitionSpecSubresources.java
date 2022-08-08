package io.yupiik.kubernetes.bindings.v1_12_3.v1beta1;

import jakarta.json.JsonValue;
import java.util.Objects;

public class CustomResourceDefinitionSpecSubresources {
    private CustomResourceDefinitionSpecSubresourcesScale scale;
    private JsonValue status;

    public CustomResourceDefinitionSpecSubresources() {
        // no-op
    }

    public CustomResourceDefinitionSpecSubresources(final CustomResourceDefinitionSpecSubresourcesScale scale,
                                                    final JsonValue status) {
        // no-op
    }

    public CustomResourceDefinitionSpecSubresourcesScale getScale() {
        return scale;
    }

    public void setScale(final CustomResourceDefinitionSpecSubresourcesScale scale) {
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
        if (!(__other instanceof CustomResourceDefinitionSpecSubresources)) {
            return false;
        }
        final CustomResourceDefinitionSpecSubresources __otherCasted = (CustomResourceDefinitionSpecSubresources) __other;
        return Objects.equals(scale, __otherCasted.scale) &&
            Objects.equals(status, __otherCasted.status);
    }
}
