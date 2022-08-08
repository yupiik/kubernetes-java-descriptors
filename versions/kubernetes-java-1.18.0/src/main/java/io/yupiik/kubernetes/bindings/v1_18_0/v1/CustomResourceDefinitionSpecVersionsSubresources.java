package io.yupiik.kubernetes.bindings.v1_18_0.v1;

import jakarta.json.JsonObject;
import java.util.Objects;

public class CustomResourceDefinitionSpecVersionsSubresources {
    private CustomResourceDefinitionSpecVersionsSubresourcesScale scale;
    private JsonObject status;

    public CustomResourceDefinitionSpecVersionsSubresources() {
        // no-op
    }

    public CustomResourceDefinitionSpecVersionsSubresources(final CustomResourceDefinitionSpecVersionsSubresourcesScale scale,
                                                            final JsonObject status) {
        // no-op
    }

    public CustomResourceDefinitionSpecVersionsSubresourcesScale getScale() {
        return scale;
    }

    public void setScale(final CustomResourceDefinitionSpecVersionsSubresourcesScale scale) {
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
        if (!(__other instanceof CustomResourceDefinitionSpecVersionsSubresources)) {
            return false;
        }
        final CustomResourceDefinitionSpecVersionsSubresources __otherCasted = (CustomResourceDefinitionSpecVersionsSubresources) __other;
        return Objects.equals(scale, __otherCasted.scale) &&
            Objects.equals(status, __otherCasted.status);
    }
}
