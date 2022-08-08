package io.yupiik.kubernetes.bindings.v1_11_4.v1alpha1;

import jakarta.json.JsonValue;
import java.util.List;
import java.util.Objects;

public class PodPresetSpec {
    private List<JsonValue> env;
    private List<JsonValue> envFrom;
    private PodPresetSpecSelector selector;
    private List<JsonValue> volumeMounts;
    private List<JsonValue> volumes;

    public PodPresetSpec() {
        // no-op
    }

    public PodPresetSpec(final List<JsonValue> env,
                         final List<JsonValue> envFrom,
                         final PodPresetSpecSelector selector,
                         final List<JsonValue> volumeMounts,
                         final List<JsonValue> volumes) {
        // no-op
    }

    public List<JsonValue> getEnv() {
        return env;
    }

    public void setEnv(final List<JsonValue> env) {
        this.env = env;
    }

    public List<JsonValue> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<JsonValue> envFrom) {
        this.envFrom = envFrom;
    }

    public PodPresetSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final PodPresetSpecSelector selector) {
        this.selector = selector;
    }

    public List<JsonValue> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<JsonValue> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    public List<JsonValue> getVolumes() {
        return volumes;
    }

    public void setVolumes(final List<JsonValue> volumes) {
        this.volumes = volumes;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                env,
                envFrom,
                selector,
                volumeMounts,
                volumes);
    }

    @Override
    public boolean equals(final Object __other) {
        if (!(__other instanceof PodPresetSpec)) {
            return false;
        }
        final PodPresetSpec __otherCasted = (PodPresetSpec) __other;
        return Objects.equals(env, __otherCasted.env) &&
            Objects.equals(envFrom, __otherCasted.envFrom) &&
            Objects.equals(selector, __otherCasted.selector) &&
            Objects.equals(volumeMounts, __otherCasted.volumeMounts) &&
            Objects.equals(volumes, __otherCasted.volumes);
    }
}
