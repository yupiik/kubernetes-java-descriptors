package io.yupiik.kubernetes.bindings.v1_17_3;

import java.util.Objects;

public class ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSources {
    private ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap;
    private ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret secret;
    private ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSources() {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSources(final ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap,
                                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret secret,
                                                                      final ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        this.serviceAccountToken = serviceAccountToken;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                configMap,
                downwardAPI,
                secret,
                serviceAccountToken);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSources)) {
            return false;
        }
        final ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSources __otherCasted = (ReplicaSetListItemsSpecTemplateSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
