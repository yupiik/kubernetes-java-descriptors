package io.yupiik.kubernetes.bindings.v1_18_15.v1alpha1;

import java.util.Objects;

public class PodPresetSpecVolumesProjectedSources {
    private PodPresetSpecVolumesProjectedSourcesConfigMap configMap;
    private PodPresetSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private PodPresetSpecVolumesProjectedSourcesSecret secret;
    private PodPresetSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public PodPresetSpecVolumesProjectedSources() {
        // no-op
    }

    public PodPresetSpecVolumesProjectedSources(final PodPresetSpecVolumesProjectedSourcesConfigMap configMap,
                                                final PodPresetSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                                final PodPresetSpecVolumesProjectedSourcesSecret secret,
                                                final PodPresetSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public PodPresetSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final PodPresetSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public PodPresetSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final PodPresetSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public PodPresetSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final PodPresetSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public PodPresetSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final PodPresetSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
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
        if (!(__other instanceof PodPresetSpecVolumesProjectedSources)) {
            return false;
        }
        final PodPresetSpecVolumesProjectedSources __otherCasted = (PodPresetSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
