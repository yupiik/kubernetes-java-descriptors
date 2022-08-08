package io.yupiik.kubernetes.bindings.v1_16_11.v1;

import java.util.List;
import java.util.Objects;

public class ServiceAccount {
    private String apiVersion;
    private Boolean automountServiceAccountToken;
    private List<ServiceAccountImagePullSecrets> imagePullSecrets;
    private String kind;
    private ServiceAccountMetadata metadata;
    private List<ServiceAccountSecrets> secrets;

    public ServiceAccount() {
        // no-op
    }

    public ServiceAccount(final String apiVersion,
                          final Boolean automountServiceAccountToken,
                          final List<ServiceAccountImagePullSecrets> imagePullSecrets,
                          final String kind,
                          final ServiceAccountMetadata metadata,
                          final List<ServiceAccountSecrets> secrets) {
        // no-op
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

    public List<ServiceAccountImagePullSecrets> getImagePullSecrets() {
        return imagePullSecrets;
    }

    public void setImagePullSecrets(final List<ServiceAccountImagePullSecrets> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ServiceAccountMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ServiceAccountMetadata metadata) {
        this.metadata = metadata;
    }

    public List<ServiceAccountSecrets> getSecrets() {
        return secrets;
    }

    public void setSecrets(final List<ServiceAccountSecrets> secrets) {
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
}
