package io.yupiik.kubernetes.bindings.v1_14_0.v1;

import java.util.Objects;

public class JobSpecTemplateSpecVolumesProjectedSources {
    private JobSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap;
    private JobSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private JobSpecTemplateSpecVolumesProjectedSourcesSecret secret;
    private JobSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public JobSpecTemplateSpecVolumesProjectedSources() {
        // no-op
    }

    public JobSpecTemplateSpecVolumesProjectedSources(final JobSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap,
                                                      final JobSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                                      final JobSpecTemplateSpecVolumesProjectedSourcesSecret secret,
                                                      final JobSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public JobSpecTemplateSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final JobSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public JobSpecTemplateSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final JobSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public JobSpecTemplateSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final JobSpecTemplateSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public JobSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final JobSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
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
        if (!(__other instanceof JobSpecTemplateSpecVolumesProjectedSources)) {
            return false;
        }
        final JobSpecTemplateSpecVolumesProjectedSources __otherCasted = (JobSpecTemplateSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
