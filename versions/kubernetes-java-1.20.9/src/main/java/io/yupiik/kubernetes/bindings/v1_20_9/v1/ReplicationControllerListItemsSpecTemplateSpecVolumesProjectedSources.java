package io.yupiik.kubernetes.bindings.v1_20_9.v1;

import java.util.Objects;

public class ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSources {
    private ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesSecret secret;
    private ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSources() {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSources(final ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap,
                                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesSecret secret,
                                                                                 final ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
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
        if (!(__other instanceof ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSources)) {
            return false;
        }
        final ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSources __otherCasted = (ReplicationControllerListItemsSpecTemplateSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
