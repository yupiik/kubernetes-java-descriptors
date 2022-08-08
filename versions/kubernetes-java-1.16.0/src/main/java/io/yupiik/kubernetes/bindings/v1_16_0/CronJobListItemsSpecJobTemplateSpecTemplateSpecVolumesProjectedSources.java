package io.yupiik.kubernetes.bindings.v1_16_0;

import java.util.Objects;

public class CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSources {
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesSecret secret;
    private CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSources() {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSources(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap,
                                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesSecret secret,
                                                                                  final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
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
        if (!(__other instanceof CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSources)) {
            return false;
        }
        final CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSources __otherCasted = (CronJobListItemsSpecJobTemplateSpecTemplateSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
