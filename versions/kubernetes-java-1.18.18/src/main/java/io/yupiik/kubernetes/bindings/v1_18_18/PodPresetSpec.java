package io.yupiik.kubernetes.bindings.v1_18_18;

import java.util.List;
import java.util.Objects;

public class PodPresetSpec {
    private List<PodPresetSpecEnv> env;
    private List<PodPresetSpecEnvFrom> envFrom;
    private PodPresetSpecSelector selector;
    private List<PodPresetSpecVolumeMounts> volumeMounts;
    private List<PodPresetSpecVolumes> volumes;

    public PodPresetSpec() {
        // no-op
    }

    public PodPresetSpec(final List<PodPresetSpecEnv> env,
                         final List<PodPresetSpecEnvFrom> envFrom,
                         final PodPresetSpecSelector selector,
                         final List<PodPresetSpecVolumeMounts> volumeMounts,
                         final List<PodPresetSpecVolumes> volumes) {
        // no-op
    }

    public List<PodPresetSpecEnv> getEnv() {
        return env;
    }

    public void setEnv(final List<PodPresetSpecEnv> env) {
        this.env = env;
    }

    public List<PodPresetSpecEnvFrom> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(final List<PodPresetSpecEnvFrom> envFrom) {
        this.envFrom = envFrom;
    }

    public PodPresetSpecSelector getSelector() {
        return selector;
    }

    public void setSelector(final PodPresetSpecSelector selector) {
        this.selector = selector;
    }

    public List<PodPresetSpecVolumeMounts> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(final List<PodPresetSpecVolumeMounts> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    public List<PodPresetSpecVolumes> getVolumes() {
        return volumes;
    }

    public void setVolumes(final List<PodPresetSpecVolumes> volumes) {
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
