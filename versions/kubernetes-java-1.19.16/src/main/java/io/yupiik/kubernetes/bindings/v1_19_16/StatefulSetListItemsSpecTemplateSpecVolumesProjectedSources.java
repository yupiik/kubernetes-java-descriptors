package io.yupiik.kubernetes.bindings.v1_19_16;

import java.util.Objects;

public class StatefulSetListItemsSpecTemplateSpecVolumesProjectedSources {
    private StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap;
    private StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret secret;
    private StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public StatefulSetListItemsSpecTemplateSpecVolumesProjectedSources() {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesProjectedSources(final StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap,
                                                                       final StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                                                       final StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret secret,
                                                                       final StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final StatefulSetListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
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
        if (!(__other instanceof StatefulSetListItemsSpecTemplateSpecVolumesProjectedSources)) {
            return false;
        }
        final StatefulSetListItemsSpecTemplateSpecVolumesProjectedSources __otherCasted = (StatefulSetListItemsSpecTemplateSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
