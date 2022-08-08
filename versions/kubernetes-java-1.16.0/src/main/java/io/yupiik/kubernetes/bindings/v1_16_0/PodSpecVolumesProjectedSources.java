package io.yupiik.kubernetes.bindings.v1_16_0;

import java.util.Objects;

public class PodSpecVolumesProjectedSources {
    private PodSpecVolumesProjectedSourcesConfigMap configMap;
    private PodSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private PodSpecVolumesProjectedSourcesSecret secret;
    private PodSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public PodSpecVolumesProjectedSources() {
        // no-op
    }

    public PodSpecVolumesProjectedSources(final PodSpecVolumesProjectedSourcesConfigMap configMap,
                                          final PodSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                          final PodSpecVolumesProjectedSourcesSecret secret,
                                          final PodSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public PodSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final PodSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public PodSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final PodSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public PodSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final PodSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public PodSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final PodSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
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
        if (!(__other instanceof PodSpecVolumesProjectedSources)) {
            return false;
        }
        final PodSpecVolumesProjectedSources __otherCasted = (PodSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
