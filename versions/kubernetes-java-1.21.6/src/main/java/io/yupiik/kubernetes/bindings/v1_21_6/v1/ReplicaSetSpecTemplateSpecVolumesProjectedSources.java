package io.yupiik.kubernetes.bindings.v1_21_6.v1;

import java.util.Objects;

public class ReplicaSetSpecTemplateSpecVolumesProjectedSources {
    private ReplicaSetSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap;
    private ReplicaSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private ReplicaSetSpecTemplateSpecVolumesProjectedSourcesSecret secret;
    private ReplicaSetSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public ReplicaSetSpecTemplateSpecVolumesProjectedSources() {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesProjectedSources(final ReplicaSetSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap,
                                                             final ReplicaSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                                             final ReplicaSetSpecTemplateSpecVolumesProjectedSourcesSecret secret,
                                                             final ReplicaSetSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public ReplicaSetSpecTemplateSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final ReplicaSetSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public ReplicaSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final ReplicaSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public ReplicaSetSpecTemplateSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final ReplicaSetSpecTemplateSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public ReplicaSetSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final ReplicaSetSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
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
        if (!(__other instanceof ReplicaSetSpecTemplateSpecVolumesProjectedSources)) {
            return false;
        }
        final ReplicaSetSpecTemplateSpecVolumesProjectedSources __otherCasted = (ReplicaSetSpecTemplateSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
