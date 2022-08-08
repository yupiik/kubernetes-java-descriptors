package io.yupiik.kubernetes.bindings.v1_14_5.v1;

import java.util.List;
import java.util.Objects;

public class ServiceAccountListItems {
    private String apiVersion;
    private Boolean automountServiceAccountToken;
    private List<ServiceAccountListItemsImagePullSecrets> imagePullSecrets;
    private String kind;
    private ServiceAccountListItemsMetadata metadata;
    private List<ServiceAccountListItemsSecrets> secrets;

    public ServiceAccountListItems() {
        // no-op
    }

    public ServiceAccountListItems(final String apiVersion,
                                   final Boolean automountServiceAccountToken,
                                   final List<ServiceAccountListItemsImagePullSecrets> imagePullSecrets,
                                   final String kind,
                                   final ServiceAccountListItemsMetadata metadata,
                                   final List<ServiceAccountListItemsSecrets> secrets) {
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

    public List<ServiceAccountListItemsImagePullSecrets> getImagePullSecrets() {
        return imagePullSecrets;
    }

    public void setImagePullSecrets(final List<ServiceAccountListItemsImagePullSecrets> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(final String kind) {
        this.kind = kind;
    }

    public ServiceAccountListItemsMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(final ServiceAccountListItemsMetadata metadata) {
        this.metadata = metadata;
    }

    public List<ServiceAccountListItemsSecrets> getSecrets() {
        return secrets;
    }

    public void setSecrets(final List<ServiceAccountListItemsSecrets> secrets) {
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
        if (!(__other instanceof ServiceAccountListItems)) {
            return false;
        }
        final ServiceAccountListItems __otherCasted = (ServiceAccountListItems) __other;
        return Objects.equals(apiVersion, __otherCasted.apiVersion) &&
            Objects.equals(automountServiceAccountToken, __otherCasted.automountServiceAccountToken) &&
            Objects.equals(imagePullSecrets, __otherCasted.imagePullSecrets) &&
            Objects.equals(kind, __otherCasted.kind) &&
            Objects.equals(metadata, __otherCasted.metadata) &&
            Objects.equals(secrets, __otherCasted.secrets);
    }
}
