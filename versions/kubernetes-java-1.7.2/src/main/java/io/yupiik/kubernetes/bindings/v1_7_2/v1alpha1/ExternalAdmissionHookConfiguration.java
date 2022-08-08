package io.yupiik.kubernetes.bindings.v1_7_2.v1alpha1;

import io.yupiik.kubernetes.bindings.v1_7_2.Validable;
import io.yupiik.kubernetes.bindings.v1_7_2.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ExternalAdmissionHookConfiguration implements Validable<ExternalAdmissionHookConfiguration> {
    private String apiVersion;
    private List<ExternalAdmissionHook> externalAdmissionHooks;
    private String kind;
    private ObjectMeta metadata;

    public ExternalAdmissionHookConfiguration() {
        // no-op
    }

    public ExternalAdmissionHookConfiguration(final String apiVersion,
                                              final List<ExternalAdmissionHook> externalAdmissionHooks,
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

    public List<ExternalAdmissionHook> getExternalAdmissionHooks() {
        return externalAdmissionHooks;
    }

    public void setExternalAdmissionHooks(final List<ExternalAdmissionHook> externalAdmissionHooks) {
        this.externalAdmissionHooks = externalAdmissionHooks;
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
                externalAdmissionHooks,
                kind,
                metadata);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ExternalAdmissionHookConfiguration)) {
            return false;
        }
        final ExternalAdmissionHookConfiguration __otherCasted = (ExternalAdmissionHookConfiguration) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(externalAdmissionHooks, __otherCasted.externalAdmissionHooks) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata);
    }

    public ExternalAdmissionHookConfiguration apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ExternalAdmissionHookConfiguration externalAdmissionHooks(final List<ExternalAdmissionHook> externalAdmissionHooks) {
        this.externalAdmissionHooks = externalAdmissionHooks;
        return this;
    }

    public ExternalAdmissionHookConfiguration kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ExternalAdmissionHookConfiguration metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    @Override
    public ExternalAdmissionHookConfiguration validate() {
        return this;
    }
}
