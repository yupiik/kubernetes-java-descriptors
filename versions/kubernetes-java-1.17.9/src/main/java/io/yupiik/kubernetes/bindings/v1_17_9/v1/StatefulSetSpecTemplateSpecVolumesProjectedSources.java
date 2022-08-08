package io.yupiik.kubernetes.bindings.v1_17_9.v1;

import java.util.Objects;

public class StatefulSetSpecTemplateSpecVolumesProjectedSources {
    private StatefulSetSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap;
    private StatefulSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private StatefulSetSpecTemplateSpecVolumesProjectedSourcesSecret secret;
    private StatefulSetSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public StatefulSetSpecTemplateSpecVolumesProjectedSources() {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesProjectedSources(final StatefulSetSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap,
                                                              final StatefulSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                                              final StatefulSetSpecTemplateSpecVolumesProjectedSourcesSecret secret,
                                                              final StatefulSetSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public StatefulSetSpecTemplateSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final StatefulSetSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public StatefulSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final StatefulSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public StatefulSetSpecTemplateSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final StatefulSetSpecTemplateSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public StatefulSetSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final StatefulSetSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
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
        if (!(__other instanceof StatefulSetSpecTemplateSpecVolumesProjectedSources)) {
            return false;
        }
        final StatefulSetSpecTemplateSpecVolumesProjectedSources __otherCasted = (StatefulSetSpecTemplateSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
