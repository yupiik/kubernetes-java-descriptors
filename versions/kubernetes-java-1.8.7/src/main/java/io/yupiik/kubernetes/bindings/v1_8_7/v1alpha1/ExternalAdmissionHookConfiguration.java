package io.yupiik.kubernetes.bindings.v1_8_7.v1alpha1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class ExternalAdmissionHookConfiguration {
    private String apiVersion;
    private List<JsonValue> externalAdmissionHooks;
    private String kind;
    private ExternalAdmissionHookConfigurationMetadata metadata;

    public ExternalAdmissionHookConfiguration() {
        // no-op
    }

    public ExternalAdmissionHookConfiguration(final String apiVersion,
                                              final List<JsonValue> externalAdmissionHooks,
                                              final String kind,
                                              final ExternalAdmissionHookConfigurationMetadata metadata) {
        // no-op
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<JsonValue> getExternalAdmissionHooks() {
        return externalAdmissionHooks;
    }

    public void setExternalAdmissionHooks(final List<JsonValue> externalAdmissionHooks) {
        this.externalAdmissionHooks = externalAdmissionHooks;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ExternalAdmissionHookConfigurationMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ExternalAdmissionHookConfigurationMetadata metadata) {
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
}
