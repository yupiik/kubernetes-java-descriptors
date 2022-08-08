package io.yupiik.kubernetes.bindings.v1_7_0.v1beta1;

import io.yupiik.kubernetes.bindings.v1_7_0.Validable;
import io.yupiik.kubernetes.bindings.v1_7_0.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PodDisruptionBudget implements Validable<PodDisruptionBudget> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private PodDisruptionBudgetSpec spec;
    private PodDisruptionBudgetStatus status;

    public PodDisruptionBudget() {
        // no-op
    }

    public PodDisruptionBudget(final String apiVersion,
                               final String kind,
                               final ObjectMeta metadata,
                               final PodDisruptionBudgetSpec spec,
                               final PodDisruptionBudgetStatus status) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(final ObjectMeta metadata) {
        this.metadata = metadata;
    }

    public PodDisruptionBudgetSpec getSpec() {
        return spec;
    }

    public void setSpec(final PodDisruptionBudgetSpec spec) {
        this.spec = spec;
    }

    public PodDisruptionBudgetStatus getStatus() {
        return status;
    }

    public void setStatus(final PodDisruptionBudgetStatus status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                spec,
                status);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodDisruptionBudget)) {
            return false;
        }
        final PodDisruptionBudget __otherCasted = (PodDisruptionBudget) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public PodDisruptionBudget apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public PodDisruptionBudget kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public PodDisruptionBudget metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public PodDisruptionBudget spec(final PodDisruptionBudgetSpec spec) {
        this.spec = spec;
        return this;
    }

    public PodDisruptionBudget status(final PodDisruptionBudgetStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public PodDisruptionBudget validate() {
        return this;
    }
}
