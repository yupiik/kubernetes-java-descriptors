package io.yupiik.kubernetes.bindings.v1_19_5.v2alpha1;

import io.yupiik.kubernetes.bindings.v1_19_5.Validable;
import io.yupiik.kubernetes.bindings.v1_19_5.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VolumeProjection implements Validable<VolumeProjection> {
    private ConfigMapProjection configMap;
    private DownwardAPIProjection downwardAPI;
    private SecretProjection secret;
    private ServiceAccountTokenProjection serviceAccountToken;

    public VolumeProjection() {
        // no-op
    }

    public VolumeProjection(final ConfigMapProjection configMap,
                            final DownwardAPIProjection downwardAPI,
                            final SecretProjection secret,
                            final ServiceAccountTokenProjection serviceAccountToken) {
        // no-op
    }

    public ConfigMapProjection getConfigMap() {
        return configMap;
    }

    public void setConfigMap(final ConfigMapProjection configMap) {
        this.configMap = configMap;
    }

    public DownwardAPIProjection getDownwardAPI() {
        return downwardAPI;
    }

    public void setDownwardAPI(final DownwardAPIProjection downwardAPI) {
        this.downwardAPI = downwardAPI;
    }

    public SecretProjection getSecret() {
        return secret;
    }

    public void setSecret(final SecretProjection secret) {
        this.secret = secret;
    }

    public ServiceAccountTokenProjection getServiceAccountToken() {
        return serviceAccountToken;
    }

    public void setServiceAccountToken(final ServiceAccountTokenProjection serviceAccountToken) {
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
        if (!(__other instanceof VolumeProjection)) {
            return false;
        }
        final VolumeProjection __otherCasted = (VolumeProjection) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret) &&
            Objects.equals(serviceAccountToken, __otherCasted.serviceAccountToken);
    }

    public VolumeProjection configMap(final ConfigMapProjection configMap) {
        this.configMap = configMap;
        return this;
    }

    public VolumeProjection downwardAPI(final DownwardAPIProjection downwardAPI) {
        this.downwardAPI = downwardAPI;
        return this;
    }

    public VolumeProjection secret(final SecretProjection secret) {
        this.secret = secret;
        return this;
    }

    public VolumeProjection serviceAccountToken(final ServiceAccountTokenProjection serviceAccountToken) {
        this.serviceAccountToken = serviceAccountToken;
        return this;
    }

    @Override
    public VolumeProjection validate() {
        return this;
    }
}
