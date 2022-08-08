package io.yupiik.kubernetes.bindings.v1_15_6.v1beta2;

import java.util.Objects;

public class DaemonSetListItemsSpecTemplateSpecVolumesProjectedSources {
    private DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap;
    private DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret secret;
    private DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public DaemonSetListItemsSpecTemplateSpecVolumesProjectedSources() {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesProjectedSources(final DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap,
                                                                     final DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                                                     final DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret secret,
                                                                     final DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final DaemonSetListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
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
        if (!(__other instanceof DaemonSetListItemsSpecTemplateSpecVolumesProjectedSources)) {
            return false;
        }
        final DaemonSetListItemsSpecTemplateSpecVolumesProjectedSources __otherCasted = (DaemonSetListItemsSpecTemplateSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
