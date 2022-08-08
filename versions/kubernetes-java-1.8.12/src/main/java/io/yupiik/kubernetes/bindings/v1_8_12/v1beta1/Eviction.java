package io.yupiik.kubernetes.bindings.v1_8_12.v1beta1;

import io.yupiik.kubernetes.bindings.v1_8_12.Validable;
import io.yupiik.kubernetes.bindings.v1_8_12.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Eviction implements Validable<Eviction> {
    private String apiVersion;
    private DeleteOptions deleteOptions;
    private String kind;
    private ObjectMeta metadata;

    public Eviction() {
        // no-op
    }

    public Eviction(final String apiVersion,
                    final DeleteOptions deleteOptions,
                    final String kind,
                    final ObjectMeta metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public DeleteOptions getDeleteOptions() {
        return deleteOptions;
    }

    public void setDeleteOptions(final DeleteOptions deleteOptions) {
        this.deleteOptions = deleteOptions;
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

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                deleteOptions,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof Eviction)) {
            return false;
        }
        final Eviction __otherCasted = (Eviction) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(deleteOptions, __otherCasted.deleteOptions) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public Eviction apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public Eviction deleteOptions(final DeleteOptions deleteOptions) {
        this.deleteOptions = deleteOptions;
        return this;
    }

    public Eviction kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public Eviction metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public Eviction validate() {
        return this;
    }
}
