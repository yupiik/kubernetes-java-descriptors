package io.yupiik.kubernetes.bindings.v1_18_0.v2alpha1;

import java.util.Objects;

public class CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSources {
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesSecret secret;
    private CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSources() {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSources(final CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap,
                                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesSecret secret,
                                                                         final CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
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
        if (!(__other instanceof CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSources)) {
            return false;
        }
        final CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSources __otherCasted = (CronJobSpecJobTemplateSpecTemplateSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
