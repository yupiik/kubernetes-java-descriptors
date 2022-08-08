package io.yupiik.kubernetes.bindings.v1_17_16.v1beta1;

import java.util.Objects;

public class DeploymentSpecTemplateSpecVolumesProjectedSources {
    private DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap;
    private DeploymentSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private DeploymentSpecTemplateSpecVolumesProjectedSourcesSecret secret;
    private DeploymentSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public DeploymentSpecTemplateSpecVolumesProjectedSources() {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesProjectedSources(final DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap,
                                                             final DeploymentSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                                             final DeploymentSpecTemplateSpecVolumesProjectedSourcesSecret secret,
                                                             final DeploymentSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final DeploymentSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public DeploymentSpecTemplateSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final DeploymentSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public DeploymentSpecTemplateSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final DeploymentSpecTemplateSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public DeploymentSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final DeploymentSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
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
        if (!(__other instanceof DeploymentSpecTemplateSpecVolumesProjectedSources)) {
            return false;
        }
        final DeploymentSpecTemplateSpecVolumesProjectedSources __otherCasted = (DeploymentSpecTemplateSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
