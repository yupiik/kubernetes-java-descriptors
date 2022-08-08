package io.yupiik.kubernetes.bindings.v1_13_5;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class CustomResourceDefinitionMetadataInitializers {
    private List<JsonValue> pending;
    private CustomResourceDefinitionMetadataInitializersResult result;

    public CustomResourceDefinitionMetadataInitializers() {
        // no-op
    }

    public CustomResourceDefinitionMetadataInitializers(final List<JsonValue> pending,
                                                        final CustomResourceDefinitionMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public CustomResourceDefinitionMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final CustomResourceDefinitionMetadataInitializersResult result) {
        this.result = result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                pending,
                result);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof CustomResourceDefinitionMetadataInitializers)) {
            return false;
        }
        final CustomResourceDefinitionMetadataInitializers __otherCasted = (CustomResourceDefinitionMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
