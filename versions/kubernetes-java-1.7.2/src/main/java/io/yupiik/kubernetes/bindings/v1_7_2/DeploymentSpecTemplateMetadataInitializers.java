package io.yupiik.kubernetes.bindings.v1_7_2;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class DeploymentSpecTemplateMetadataInitializers {
    private List<JsonValue> pending;
    private DeploymentSpecTemplateMetadataInitializersResult result;

    public DeploymentSpecTemplateMetadataInitializers() {
        // no-op
    }

    public DeploymentSpecTemplateMetadataInitializers(final List<JsonValue> pending,
                                                      final DeploymentSpecTemplateMetadataInitializersResult result) {
        // no-op
    }

    public List<JsonValue> getPending() {
        return pending;
    }

    public void setPending(final List<JsonValue> pending) {
        this.pending = pending;
    }

    public DeploymentSpecTemplateMetadataInitializersResult getResult() {
        return result;
    }

    public void setResult(final DeploymentSpecTemplateMetadataInitializersResult result) {
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
        if (!(__other instanceof DeploymentSpecTemplateMetadataInitializers)) {
            return false;
        }
        final DeploymentSpecTemplateMetadataInitializers __otherCasted = (DeploymentSpecTemplateMetadataInitializers) __other;
        return Objects.equals(pending, __otherCasted.pending) &&
            Objects.equals(result, __otherCasted.result);
    }
}
