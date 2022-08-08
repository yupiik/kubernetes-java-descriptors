package io.yupiik.kubernetes.bindings.v1_17_14.v1;

import java.util.Objects;

public class Binding {
    private String apiVersion;
    private String kind;
    private BindingMetadata metadata;
    private BindingTarget target;

    public Binding() {
        // no-op
    }

    public Binding(final String apiVersion,
                   final String kind,
                   final BindingMetadata metadata,
                   final BindingTarget target) {
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

    public BindingMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final BindingMetadata metadata) {
        this.metadata = metadata;
    }

    public BindingTarget getTarget() {
        return target;
    }

    public void setTarget(final BindingTarget target) {
        this.target = target;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                kind,
                metadata,
                target);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Binding)) {
            return false;
        }
        final Binding __otherCasted = (Binding) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(target, __otherCasted.target);
    }
}
