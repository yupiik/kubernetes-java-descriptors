package io.yupiik.kubernetes.bindings.v1_19_7.v1;

import java.util.Objects;

public class DeploymentListItemsSpecTemplateSpecVolumesProjectedSources {
    private DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap;
    private DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesSecret secret;
    private DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public DeploymentListItemsSpecTemplateSpecVolumesProjectedSources() {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesProjectedSources(final DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap,
                                                                      final DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                                                      final DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesSecret secret,
                                                                      final DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final DeploymentListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
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
        if (!(__other instanceof DeploymentListItemsSpecTemplateSpecVolumesProjectedSources)) {
            return false;
        }
        final DeploymentListItemsSpecTemplateSpecVolumesProjectedSources __otherCasted = (DeploymentListItemsSpecTemplateSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
