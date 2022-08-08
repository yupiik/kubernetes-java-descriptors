package io.yupiik.kubernetes.bindings.v1_18_6.v1alpha1;

import java.util.Objects;

public class PodPresetListItemsSpecVolumesProjectedSources {
    private PodPresetListItemsSpecVolumesProjectedSourcesConfigMap configMap;
    private PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private PodPresetListItemsSpecVolumesProjectedSourcesSecret secret;
    private PodPresetListItemsSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public PodPresetListItemsSpecVolumesProjectedSources() {
        // no-op
    }

    public PodPresetListItemsSpecVolumesProjectedSources(final PodPresetListItemsSpecVolumesProjectedSourcesConfigMap configMap,
                                                         final PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                                         final PodPresetListItemsSpecVolumesProjectedSourcesSecret secret,
                                                         final PodPresetListItemsSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public PodPresetListItemsSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final PodPresetListItemsSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final PodPresetListItemsSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public PodPresetListItemsSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final PodPresetListItemsSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public PodPresetListItemsSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final PodPresetListItemsSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
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
        if (!(__other instanceof PodPresetListItemsSpecVolumesProjectedSources)) {
            return false;
        }
        final PodPresetListItemsSpecVolumesProjectedSources __otherCasted = (PodPresetListItemsSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
