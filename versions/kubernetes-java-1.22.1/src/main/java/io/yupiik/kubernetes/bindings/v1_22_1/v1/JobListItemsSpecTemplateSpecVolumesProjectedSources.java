package io.yupiik.kubernetes.bindings.v1_22_1.v1;

import java.util.Objects;

public class JobListItemsSpecTemplateSpecVolumesProjectedSources {
    private JobListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap;
    private JobListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private JobListItemsSpecTemplateSpecVolumesProjectedSourcesSecret secret;
    private JobListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public JobListItemsSpecTemplateSpecVolumesProjectedSources() {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesProjectedSources(final JobListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap,
                                                               final JobListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                                               final JobListItemsSpecTemplateSpecVolumesProjectedSourcesSecret secret,
                                                               final JobListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public JobListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final JobListItemsSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public JobListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final JobListItemsSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public JobListItemsSpecTemplateSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final JobListItemsSpecTemplateSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public JobListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final JobListItemsSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
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
        if (!(__other instanceof JobListItemsSpecTemplateSpecVolumesProjectedSources)) {
            return false;
        }
        final JobListItemsSpecTemplateSpecVolumesProjectedSources __otherCasted = (JobListItemsSpecTemplateSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
