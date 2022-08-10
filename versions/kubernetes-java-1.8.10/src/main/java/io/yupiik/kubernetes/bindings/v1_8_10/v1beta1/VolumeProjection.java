package io.yupiik.kubernetes.bindings.v1_8_10.v1beta1;

import io.yupiik.kubernetes.bindings.v1_8_10.Exportable;
import io.yupiik.kubernetes.bindings.v1_8_10.Validable;
import io.yupiik.kubernetes.bindings.v1_8_10.ValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class VolumeProjection implements Validable<VolumeProjection>, Exportable {
    private ConfigMapProjection configMap;
    private DownwardAPIProjection downwardAPI;
    private SecretProjection secret;

    public VolumeProjection() {
        // no-op
    }

    public VolumeProjection(final ConfigMapProjection configMap,
                            final DownwardAPIProjection downwardAPI,
                            final SecretProjection secret) {
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

    @Override
    public int hashCode() {
        return Objects.hash(
                configMap,
                downwardAPI,
                secret);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof VolumeProjection)) {
            return false;
        }
        final VolumeProjection __otherCasted = (VolumeProjection) __other;
        return Objects.equals(configMap, __otherCasted.configMap) &&
            Objects.equals(downwardAPI, __otherCasted.downwardAPI) &&
            Objects.equals(secret, __otherCasted.secret);
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

    @Override
    public VolumeProjection validate() {
        return this;
    }

    @Override
    public String asJson() {
        return Stream.of(
                    (configMap != null ? "\"configMap\":" + configMap.asJson() : ""),
                    (downwardAPI != null ? "\"downwardAPI\":" + downwardAPI.asJson() : ""),
                    (secret != null ? "\"secret\":" + secret.asJson() : ""))
                .filter(__it -> !__it.isBlank())
                .collect(joining(",", "{", "}"));
    }
}