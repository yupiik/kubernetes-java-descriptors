package io.yupiik.kubernetes.bindings.v1_32_0.v1;

import io.yupiik.kubernetes.bindings.v1_32_0.Exportable;
import io.yupiik.kubernetes.bindings.v1_32_0.JsonStrings;
import io.yupiik.kubernetes.bindings.v1_32_0.Validable;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class ServiceAccount implements Validable<ServiceAccount>, Exportable {
    private String apiVersion;
    private Boolean automountServiceAccountToken;
    private List<LocalObjectReference> imagePullSecrets;
    private String kind;
    private ObjectMeta metadata;
    private List<ObjectReference> secrets;

    public ServiceAccount() {
        // no-op
    }

    public ServiceAccount(final String apiVersion,
                          final Boolean automountServiceAccountToken,
                          final List<LocalObjectReference> imagePullSecrets,
                          final String kind,
                          final ObjectMeta metadata,
                          final List<ObjectReference> secrets) {
        this.apiVersion = apiVersion;
        this.automountServiceAccountToken = automountServiceAccountToken;
        this.imagePullSecrets = imagePullSecrets;
        this.kind = kind;
        this.metadata = metadata;
        this.secrets = secrets;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Boolean getAutomountServiceAccountToken() {
        return automountServiceAccountToken;
    }

    public void setAutomountServiceAccountToken(final Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
    }

    public List<LocalObjectReference> getImagePullSecrets() {
        return imagePullSecrets;
    }

    public void setImagePullSecrets(final List<LocalObjectReference> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
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

    public List<ObjectReference> getSecrets() {
        return secrets;
    }

    public void setSecrets(final List<ObjectReference> secrets) {
        this.secrets = secrets;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                apiVersion,
                automountServiceAccountToken,
                imagePullSecrets,
                kind,
                metadata,
                secrets);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ServiceAccount)) {
            return false;
        }
        final ServiceAccount __otherCasted = (ServiceAccount) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(automountServiceAccountToken, __otherCasted.automountServiceAccountToken) &&
            Objects.equals(imagePullSecrets, __otherCasted.imagePullSecrets) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(secrets, __otherCasted.secrets);
    }

    public ServiceAccount apiVersion(final String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public ServiceAccount automountServiceAccountToken(final Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
        return this;
    }

    public ServiceAccount imagePullSecrets(final List<LocalObjectReference> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
        return this;
    }

    public ServiceAccount kind(final String kind) {
        this.kind = kind;
        return this;
    }

    public ServiceAccount metadata(final ObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ServiceAccount secrets(final List<ObjectReference> secrets) {
        this.secrets = secrets;
        return this;
    }

    @Override
    public ServiceAccount validate() {
        if (kind == null) {
            kind = "ServiceAccount";
        }
        if (apiVersion == null) {
            apiVersion = "v1";
        }
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (apiVersion != null ? "\"apiVersion\":\"" +  JsonStrings.escapeJson(apiVersion) + "\"" : ""),
                    (automountServiceAccountToken != null ? "\"automountServiceAccountToken\":" + automountServiceAccountToken : ""),
                    (imagePullSecrets != null ? "\"imagePullSecrets\":" + imagePullSecrets.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""),
                    (kind != null ? "\"kind\":\"" +  JsonStrings.escapeJson(kind) + "\"" : ""),
                    (metadata != null ? "\"metadata\":" + metadata.asJson() : ""),
                    (secrets != null ? "\"secrets\":" + secrets.stream().map(__it -> __it == null ? "null" : __it.asJson()).collect(joining(",", "[", "]")) : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}
