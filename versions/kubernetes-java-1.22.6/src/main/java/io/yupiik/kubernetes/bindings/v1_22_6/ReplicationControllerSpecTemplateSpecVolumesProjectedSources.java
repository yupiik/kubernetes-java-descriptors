package io.yupiik.kubernetes.bindings.v1_22_6;

import java.util.Objects;

public class ReplicationControllerSpecTemplateSpecVolumesProjectedSources {
    private ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap;
    private ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesSecret secret;
    private ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public ReplicationControllerSpecTemplateSpecVolumesProjectedSources() {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesProjectedSources(final ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap,
                                                                        final ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                                                        final ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesSecret secret,
                                                                        final ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final ReplicationControllerSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
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
        if (!(__other instanceof ReplicationControllerSpecTemplateSpecVolumesProjectedSources)) {
            return false;
        }
        final ReplicationControllerSpecTemplateSpecVolumesProjectedSources __otherCasted = (ReplicationControllerSpecTemplateSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
