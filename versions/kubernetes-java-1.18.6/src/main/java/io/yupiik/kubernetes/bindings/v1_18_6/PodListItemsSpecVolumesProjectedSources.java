package io.yupiik.kubernetes.bindings.v1_18_6;

import java.util.Objects;

public class PodListItemsSpecVolumesProjectedSources {
    private PodListItemsSpecVolumesProjectedSourcesConfigMap configMap;
    private PodListItemsSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private PodListItemsSpecVolumesProjectedSourcesSecret secret;
    private PodListItemsSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public PodListItemsSpecVolumesProjectedSources() {
        // no-op
    }

    public PodListItemsSpecVolumesProjectedSources(final PodListItemsSpecVolumesProjectedSourcesConfigMap configMap,
                                                   final PodListItemsSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                                   final PodListItemsSpecVolumesProjectedSourcesSecret secret,
                                                   final PodListItemsSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public PodListItemsSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final PodListItemsSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public PodListItemsSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final PodListItemsSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public PodListItemsSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final PodListItemsSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public PodListItemsSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final PodListItemsSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
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
        if (!(__other instanceof PodListItemsSpecVolumesProjectedSources)) {
            return false;
        }
        final PodListItemsSpecVolumesProjectedSources __otherCasted = (PodListItemsSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
