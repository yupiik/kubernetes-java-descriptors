package io.yupiik.kubernetes.bindings.v1_18_10.v1;

import java.util.Objects;

public class PodTemplateListItemsTemplateSpecVolumesProjectedSources {
    private PodTemplateListItemsTemplateSpecVolumesProjectedSourcesConfigMap configMap;
    private PodTemplateListItemsTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private PodTemplateListItemsTemplateSpecVolumesProjectedSourcesSecret secret;
    private PodTemplateListItemsTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public PodTemplateListItemsTemplateSpecVolumesProjectedSources() {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesProjectedSources(final PodTemplateListItemsTemplateSpecVolumesProjectedSourcesConfigMap configMap,
                                                                   final PodTemplateListItemsTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                                                   final PodTemplateListItemsTemplateSpecVolumesProjectedSourcesSecret secret,
                                                                   final PodTemplateListItemsTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public PodTemplateListItemsTemplateSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final PodTemplateListItemsTemplateSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public PodTemplateListItemsTemplateSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final PodTemplateListItemsTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public PodTemplateListItemsTemplateSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final PodTemplateListItemsTemplateSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public PodTemplateListItemsTemplateSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final PodTemplateListItemsTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
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
        if (!(__other instanceof PodTemplateListItemsTemplateSpecVolumesProjectedSources)) {
            return false;
        }
        final PodTemplateListItemsTemplateSpecVolumesProjectedSources __otherCasted = (PodTemplateListItemsTemplateSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
