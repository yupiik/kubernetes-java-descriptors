package io.yupiik.kubernetes.bindings.v1_22_2.v1;

import java.util.Objects;

public class PodTemplateTemplateSpecVolumesProjectedSources {
    private PodTemplateTemplateSpecVolumesProjectedSourcesConfigMap configMap;
    private PodTemplateTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private PodTemplateTemplateSpecVolumesProjectedSourcesSecret secret;
    private PodTemplateTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public PodTemplateTemplateSpecVolumesProjectedSources() {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesProjectedSources(final PodTemplateTemplateSpecVolumesProjectedSourcesConfigMap configMap,
                                                          final PodTemplateTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                                          final PodTemplateTemplateSpecVolumesProjectedSourcesSecret secret,
                                                          final PodTemplateTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public PodTemplateTemplateSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final PodTemplateTemplateSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public PodTemplateTemplateSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final PodTemplateTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public PodTemplateTemplateSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final PodTemplateTemplateSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public PodTemplateTemplateSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final PodTemplateTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
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
        if (!(__other instanceof PodTemplateTemplateSpecVolumesProjectedSources)) {
            return false;
        }
        final PodTemplateTemplateSpecVolumesProjectedSources __otherCasted = (PodTemplateTemplateSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
