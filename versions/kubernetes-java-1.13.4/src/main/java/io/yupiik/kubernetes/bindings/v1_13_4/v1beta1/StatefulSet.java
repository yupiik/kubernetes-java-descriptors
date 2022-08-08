package io.yupiik.kubernetes.bindings.v1_13_4.v1beta1;

import io.yupiik.kubernetes.bindings.v1_13_4.Validable;
import io.yupiik.kubernetes.bindings.v1_13_4.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StatefulSet implements Validable<StatefulSet> {
    private String apiVersion;
    private String kind;
    private ObjectMeta metadata;
    private StatefulSetSpec spec;
    private StatefulSetStatus status;

    public StatefulSet() {
        // no-op
    }

    public StatefulSet(final String apiVersion,
                       final String kind,
                       final ObjectMeta metadata,
                       final StatefulSetSpec spec,
                       final StatefulSetStatus status) {
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

    public StatefulSetSpec getSpec() {
        return spec;
    }

    public void setSpec(final StatefulSetSpec spec) {
        this.spec = spec;
    }

    public StatefulSetStatus getStatus() {
        return status;
    }

    public void setStatus(final StatefulSetStatus status) {
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
        if (!(__other instanceof StatefulSet)) {
            return false;
        }
        final StatefulSet __otherCasted = (StatefulSet) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(spec, __otherCasted.spec) &&
            Objects.equals(status, __otherCasted.status);
    }

    public StatefulSet apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public StatefulSet kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public StatefulSet metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public StatefulSet spec(final StatefulSetSpec spec) {
        this.spec = spec;
        return this;
    }

    public StatefulSet status(final StatefulSetStatus status) {
        this.status = status;
        return this;
    }

    @Override
    public StatefulSet validate() {
        return this;
    }
}
