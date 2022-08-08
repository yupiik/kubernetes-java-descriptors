package io.yupiik.kubernetes.bindings.v1_19_7;

import java.util.Objects;

public class DaemonSetSpecTemplateSpecVolumesProjectedSources {
    private DaemonSetSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap;
    private DaemonSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI;
    private DaemonSetSpecTemplateSpecVolumesProjectedSourcesSecret secret;
    private DaemonSetSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken;

    public DaemonSetSpecTemplateSpecVolumesProjectedSources() {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesProjectedSources(final DaemonSetSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap,
                                                            final DaemonSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI,
                                                            final DaemonSetSpecTemplateSpecVolumesProjectedSourcesSecret secret,
                                                            final DaemonSetSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
        // no-op
    }

    public DaemonSetSpecTemplateSpecVolumesProjectedSourcesConfigMap getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final DaemonSetSpecTemplateSpecVolumesProjectedSourcesConfigMap configMap) {
        this.configMap = configMap;
    }

    public DaemonSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final DaemonSetSpecTemplateSpecVolumesProjectedSourcesDownwardAPI downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public DaemonSetSpecTemplateSpecVolumesProjectedSourcesSecret getSecret() {
        return secret;
    }

    public void setSecret(final DaemonSetSpecTemplateSpecVolumesProjectedSourcesSecret secret) {
        this.secret = secret;
    }

    public DaemonSetSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final DaemonSetSpecTemplateSpecVolumesProjectedSourcesServiceAccountToken serviceAccountToken) {
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
        if (!(__other instanceof DaemonSetSpecTemplateSpecVolumesProjectedSources)) {
            return false;
        }
        final DaemonSetSpecTemplateSpecVolumesProjectedSources __otherCasted = (DaemonSetSpecTemplateSpecVolumesProjectedSources) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }
}
